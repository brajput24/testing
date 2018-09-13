/**
 * Copyright (c) 2017-2018 Xavient Information System 
 * - Reestablish your software!. All Rights Reserved.
 *
 */
package com.comcast.interfaces;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

/**
 * @author adnan hasan
 */
public interface IWait {
	public WebDriverWait getWait(int timeOutInSeconds,
			int pollingEveryInMiliSec);

	public void setImplicitWait(long timeout, TimeUnit unit);

	public void waitForElementVisible(By locator, int timeOutInSeconds,
			int pollingEveryInMiliSec);

	public void hardWait(int timeOutInMiliSec) throws InterruptedException;
	
	public WebElement handleStaleElement(By locator, int retryCount,
			int delayInSeconds) throws InterruptedException;
	
	public void elementExits(By locator, int timeOutInSeconds,
			int pollingEveryInMiliSec);
	
	public void elementExistAndVisible(By locator, int timeOutInSeconds,
			int pollingEveryInMiliSec);
	
	public void waitForIframe(By locator, int timeOutInSeconds,
			int pollingEveryInMiliSec);
	
	public Function<WebDriver, Boolean> elementLocatedBy(final By locator);
}
