package org.companyname.projectname.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.commons.lang.StringUtils;

public class PropertiesFileUtils {

	public Properties propertiesFile = new Properties();

	public PropertiesFileUtils(String filePath){
		File inputFile = new File(filePath);
		
		try{
			FileInputStream fis = new FileInputStream(inputFile);
			this.propertiesFile.load(fis);
			MiscUtils.closeQuietly(new Closeable[] {fis});
		}
		catch(Exception var4){
			CucumberLogUtils.logError("Error loading Properties file");
			var4.printStackTrace();
		}
	}
	
	public static void loadPropsFromResource(Properties properties, String configPath) throws IOException{
		if(StringUtils.isNotBlank(configPath)){
			InputStream inputStream = PropertiesFileUtils.class.getResourceAsStream(configPath);
			properties.load(inputStream);
		}
		else{
			throw new NullPointerException("properties config path can not be null");
		}
	}
	
}
