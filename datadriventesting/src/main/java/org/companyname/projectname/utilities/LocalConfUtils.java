package org.companyname.projectname.utilities;

import java.io.File;
import java.util.Enumeration;
import java.util.Properties;
import org.apache.commons.lang.StringUtils;


public class LocalConfUtils {
	
	private static Properties localConf = null;
	private static String RESOURCE_PATH;
	
	public LocalConfUtils(){
		
	}
	
	public static Properties loadLocalConf(){
		String localConfResourcesPath = System.getProperty("configurationFile");
		if(StringUtils.isBlank(localConfResourcesPath)){
			localConfResourcesPath = "/conf/localConf.properties";
		}
		
		
		localConf = new Properties();
		
		try{
			PropertiesFileUtils.loadPropsFromResource(localConf, localConfResourcesPath);
			localConf = loadSystemProperties(localConf);
		
		}
		catch (Exception var2){
			CucumberLogUtils.logError("Failed to load properties from the path: "+localConfResourcesPath);
			
	}
		
		return localConf;
	
		
	}

	private static Properties loadSystemProperties(Properties localProps) {
		Properties systemProperties = System.getProperties();
		Enumeration e = systemProperties.propertyNames();
		
		while(e.hasMoreElements()){
			String key = (String) e.nextElement();
			String value = systemProperties.getProperty(key);
			localProps.setProperty(key, value);
			
			
		}
		
		return localProps;
		
	}
	
	
	public static Properties getProperties(){
		if(localConf == null){
			loadLocalConf();
			
		}
		
		return localConf;
	}

	public static String getProperty(String key){
		if(localConf == null){
			loadLocalConf();
			
		}
		return localConf.getProperty(key);
	}
	
	public static void setProperty(String key, Stirng value){
		if(localConf == null){
			loadLocalConf();
			
		}
		
		localConf.setProperty(key, value);
	}
	
	public static String getRootDir(){
		return System.getProperty("user.dir");
	}
	
	public static String getResourceDir(){
		return getRootDir() +File.separator+RESOURCE_PATH;
	}
	
	public static String getQcResourcesDir(){
		return getResourceDir() + File.separator +"libs" +File.separator +"qc";
	}
	
	static{
		RESOURCE_PATH = "src" +File.separator +"main" +File.separator +"resources";
	}
	
}
