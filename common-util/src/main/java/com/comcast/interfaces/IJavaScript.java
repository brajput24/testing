/**
 * Copyright (c) 2017-2018 Xavient Digital 
 * - Reestablish your software!. All Rights Reserved.
 *
 */
package com.comcast.interfaces;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * @author Jatin Baweja
 */
public interface IJavaScript {
	public Object executeScript(String script);

	public Object executeScript(String script, Object... args);

	public void scrollToElemet(WebElement element);

	public void scrollToElemet(By locator);

	public void scrollToElemetAndClick(By locator);
	
	public void scrollToElemetAndClick(WebElement element);
	
	public void scrollIntoView(WebElement element);
	
	public void scrollIntoView(By locator);
	
	public void scrollIntoViewAndClick(By locator);
	
	public void scrollIntoViewAndClick(WebElement element);
}
