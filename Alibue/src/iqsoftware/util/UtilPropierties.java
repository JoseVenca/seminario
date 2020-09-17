package iqsoftware.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class UtilPropierties {
	
	private static Properties config;
	private static String properties = "config.properties";
	
	
	public static String getDriver() {

						
			try {
				
				config=new Properties();
				ClassLoader classLoader=Thread.currentThread().getContextClassLoader();
				InputStream propertiesStream = classLoader.getResourceAsStream("config.properties");
				config.load(propertiesStream);
				return config.getProperty("driver");
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return null;
			
	}
	
	
	public static String getUrl() {
		
		
		
			try {
				
				config=new Properties();
				ClassLoader classLoader=Thread.currentThread().getContextClassLoader();
				InputStream propertiesStream = classLoader.getResourceAsStream("config.properties");
				config.load(propertiesStream);
				return config.getProperty("url");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		return null;
		
		
	}
	
	public static String getIP() {
		
		
		
		try {
			
			config=new Properties();
			ClassLoader classLoader=Thread.currentThread().getContextClassLoader();
			InputStream propertiesStream = classLoader.getResourceAsStream("config.properties");
			config.load(propertiesStream);
			return config.getProperty("ip");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	
	
	return null;
	
	
}
	
	public static String getPuerto() {
		
		
		
		try {
			
			config=new Properties();
			ClassLoader classLoader=Thread.currentThread().getContextClassLoader();
			InputStream propertiesStream = classLoader.getResourceAsStream(properties);
			config.load(propertiesStream);
			return config.getProperty("puerto");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	
	
	return null; 
	}
	
	
	public static String getBase() {
		
		
		
		try {
			
			config=new Properties();
			ClassLoader classLoader=Thread.currentThread().getContextClassLoader();
			InputStream propertiesStream = classLoader.getResourceAsStream(properties);
			config.load(propertiesStream);
			return config.getProperty("base");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	
	
	return null; 
	}
	
	public static String getUser() {
		
		
		
		try {
			
			config=new Properties();
			ClassLoader classLoader=Thread.currentThread().getContextClassLoader();
			InputStream propertiesStream = classLoader.getResourceAsStream(properties);
			config.load(propertiesStream);
			return config.getProperty("user");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	
	
	return null; 
	}
	
	public static String getPassword() {
		
		
		
		try {
			
			config=new Properties();
			ClassLoader classLoader=Thread.currentThread().getContextClassLoader();
			InputStream propertiesStream = classLoader.getResourceAsStream(properties);
			config.load(propertiesStream);
			return config.getProperty("password");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	
	
	return null; 
	}
			

}
