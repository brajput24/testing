/**
 * Copyright (c) 2017-2018 Xavient Digital 
 * - Reestablish your software!. All Rights Reserved.
 *
 */
package com.comcast.interfaces;

import org.openqa.selenium.Alert;

/**
 * @author Jatin Baweja
 */
public interface IAlert {
	public Alert getAlert();

	public void acceptAlert();

	public void dismissAlert();

	public String getAlertText();

	public boolean isAlertPresent();

	public void acceptAlertIfPresent();

	public void dismissAlertIfPresent();

	public void acceptPrompt(String text);
}
