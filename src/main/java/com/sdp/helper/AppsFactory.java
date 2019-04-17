package com.sdp.helper;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AppsFactory {
	// this is the factory class to create an ob
	public static Object getObject(String logical_name)
			throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {

		Properties prop = null;
		String class_Name=null;
		Object obj = null;
		String fName = "com\\sdp\\common\\appClasses.properties";		
		InputStream input = null;
		
		
		// based on logical name we need to create
		input = AppsFactory.class.getClassLoader().getResourceAsStream(fName);
		if (input == null) {
			System.out.println("unable to find the property file ...");
			return input;
		}
		
		prop=new Properties();
		// load a properties file from class path, inside static method
		prop.load(input);

		class_Name = prop.getProperty(logical_name);
		Class clazz = Class.forName(class_Name);
		obj = clazz.newInstance();

		return obj;
	}
}
