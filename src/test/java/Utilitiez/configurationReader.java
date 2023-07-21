package Utilitiez;

import java.io.FileInputStream;
import java.util.Properties;

public class configurationReader {

	private static Properties properties;
	
	static{
		try{
			String filePath=Constants.config_File_Path;
		FileInputStream fis= 
			new FileInputStream(filePath);
		properties = new Properties();
		properties.load(fis);
		fis.close();
		}catch(Exception e) {
			
	}
	}//end of catch block
	
	public static String getProperties(String keyName) {
		return properties.getProperty(keyName);
	}
}


