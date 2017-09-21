package com.selecon.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropFileHandler {
	public static String FilePath = System.getProperty("user.dir")+"\\OR.properties";
	public static Properties prop;
	public static InputStream input;
	
	public static String fetchProp(String key) throws IOException {
				
		try {
			prop = new Properties();
			input = new FileInputStream(FilePath);
			prop.load(input);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String value= prop.getProperty(key);
		return value;
	
		
	}

}
