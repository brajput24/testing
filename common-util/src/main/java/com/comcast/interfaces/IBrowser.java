/**
 * Copyright (c) 2017-2018 Xavient Digital 
 * - Reestablish your software!. All Rights Reserved.
 *
 */
package com.comcast.interfaces;

import java.util.Set;

import org.openqa.selenium.By;

/**
 * @author Jatin Baweja
 */
public interface IBrowser {
	public void goBack();

	public void goForward();

	public void refresh();

	public Set<String> getWindowHandlens();

	public void switchToWindow(int index);

	public void switchToParentWindow();

	public void switchToParentWithChildClose();

	public void switchToFrame(By locator);
	
	public void switchToFrame(String nameOrId);
}
