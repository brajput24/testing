/**
 * Copyright (c) 2017-2018 Xavient Digital 
 * - Reestablish your software!. All Rights Reserved.
 *
 */
package com.comcast.configreader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.log4j.Level;
import org.openqa.selenium.remote.BrowserType;

import com.comcast.interfaces.IconfigReader;



public class PropertyFileReader implements IconfigReader {

	private Properties prop = null;
	private static String configPath = "src/main/resources/configfile/config.properties";

	public static FileInputStream PropertyFileReader(String file)
			throws FileNotFoundException {
		return new FileInputStream(new File(file));
	}

	public static Map<String, String> readProperties()
			throws FileNotFoundException, IOException {

		Properties prop = new Properties();
		prop.load(PropertyFileReader(configPath));

		Map<String, String> properties = new HashMap<String, String>();

		Enumeration<Object> KeyValues = prop.keys();
		while (KeyValues.hasMoreElements()) {
			String key = (String) KeyValues.nextElement();
			String value = prop.getProperty(key);
			properties.put(key, System.getProperty(key, value));
		}

		return properties;
	}

	public PropertyFileReader() {
		prop = new Properties();
		try {
			prop.load(PropertyFileReader(configPath));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getUserName() {
		return prop.getProperty("Username");
	}

	public String getPassword() {
		return prop.getProperty("Password");
	}

	public String getWebsite() {
		return prop.getProperty("Website");
	}

	public int getPageLoadTimeOut() {
		return Integer.parseInt(prop.getProperty("PageLoadTimeOut"));
	}

	public int getImplicitWait() {
		return Integer.parseInt(prop.getProperty("ImplcitWait"));
	}

	public int getExplicitWait() {
		return Integer.parseInt(prop.getProperty("ExplicitWait"));
	}

	public String getDbType() {
		return prop.getProperty("DataBase.Type");
	}

	public String getDbConnStr() {
		return prop.getProperty("DtaBase.ConnectionStr");
	}

	public String getBrowser() {
		return prop.getProperty("Browser");
	}

	public Level getLoggerLevel() {

		switch (prop.getProperty("Logger.Level")) {

		case "DEBUG":
			return Level.DEBUG;
		case "INFO":
			return Level.INFO;
		case "WARN":
			return Level.WARN;
		case "ERROR":
			return Level.ERROR;
		case "FATAL":
			return Level.FATAL;
		}
		return Level.ALL;
	}

}
