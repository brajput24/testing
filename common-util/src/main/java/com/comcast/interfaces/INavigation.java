/**
 * Copyright (c) 2017-2018 Xavient Information System 
 * - Reestablish your software!. All Rights Reserved.
 *
 */
package com.comcast.interfaces;

import java.net.URL;

/**
 * @author adnan hasan
 */
public interface INavigation {
	public void navigateTo(String url);

	public void naviagteTo(URL url);

	public String getTitle();

	public String getCurrentUrl();
}
