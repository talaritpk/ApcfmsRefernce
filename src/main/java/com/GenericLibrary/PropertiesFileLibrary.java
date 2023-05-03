package com.GenericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * This class consists of generic methods related property file
 * @author T Pavan Kumar
 *
 */
public class PropertiesFileLibrary {
	/**
	 * This method is used to read data from properties file
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String readDatafromPropertyFile(String key) throws IOException {
		FileInputStream fileInputStream=new FileInputStream(IConstantLibrary.propertyFilePath);
		Properties properties=new Properties();
		properties.load(fileInputStream);
		String value=properties.getProperty(key);
		return value;
	}
}
