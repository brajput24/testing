/**
 * Copyright (c) 2017-2018 Xavient Information System 
 * - Reestablish your software!. All Rights Reserved.
 *
 */
package com.comcast.configuration.browser;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.comcast.utility.DateTimeHelper;
import com.comcast.utility.ResourceHelper;


/**
 * @author adnan hasan
 *
 */
public class ChromeBrowser {

	public Capabilities getChromeCapabilities() {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("start-maximized");
		DesiredCapabilities chrome = DesiredCapabilities.chrome();
		chrome.setJavascriptEnabled(true);
		chrome.setCapability(ChromeOptions.CAPABILITY, option);
		return chrome;
	}

	public WebDriver getChromeDriver(Capabilities cap) {
		System.out.println(ResourceHelper
				.getResourcePath("driver/chromedriver"));
		System.setProperty("webdriver.chrome.driver",
				BrowserPath.Chrome.chromePath);
		System.setProperty(
				"webdriver.chrome.logfile",
				BrowserPath.Chrome.chromeLogPath + "chromelog"
						+ DateTimeHelper.getCurrentDateTime() + ".log");
		return new ChromeDriver(cap);
	}

	public WebDriver getChromeDriver(String hubUrl, Capabilities cap)
			throws MalformedURLException {
		return new RemoteWebDriver(new URL(hubUrl), cap);
	}

}
