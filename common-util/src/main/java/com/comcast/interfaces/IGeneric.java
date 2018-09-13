/**
 * Copyright (c) 2017-2018 Xavient Digital 
 * - Reestablish your software!. All Rights Reserved.
 *
 */
package com.comcast.interfaces;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * @author Jatin Baweja
 */
public interface IGeneric {
	public WebElement getElement(By locator);

	public WebElement getElementWithNull(By locator);

	public boolean isElementPresentQuick(By locator);

	public String takeScreenShot(String name) throws IOException;

	public String takeScreenShot();
}
