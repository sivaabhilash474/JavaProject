package org.companyname.projectname.utilities;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.crypt.examples.EncryptionUtils;

public class UserUtils {
	
	public static Map<String,String> getUser(String userType){
		
		Map<String,String> ret = new HashMap<String,String>();
		
		String usersFilePath = LocalConfUtils.getResourceDir() + File.separator +"conf"
				+File.separator+"users.xml";
		
		File userFile = new File(usersFilePath);
		
		XmlUtils xml = new XmlUtils(userFile);
		
		ret.put("username", xml.get_data("//type[text()='" +userType + " ']/../username"));
		ret.put("password", EncryptionUtils.decrypt(xml.get_data("//type[text()='"+userType+"']//..password")));
		
		return ret;
		
		
		
	}

}
