/**
 * Copyright (c) 2017-2018 Xavient Information System 
 * - Reestablish your software!. All Rights Reserved.
 *
 */
package com.comcast.configuration.browser;

/**
 * @author adnan hasan
 *
 */
public interface BrowserPath {

	interface Chrome {
		public static final String chromePath = "src/main/resources/driver/chromedriver";
		public static final String chromeLogPath = "src/main/resources/logs/chromelogs/";
	}

	interface Firefox {
		public static final String firefoxPath = "src/main/resources/driver/geckodriver";
		public static final String firefoxLogPath = "src/main/resources/logs/firefoxlogs/";
	}

	interface Iexplore {
		public static final String iexplorePath = "src/main/resources/driver/IEDriverServer.exe";
		public static final String iexploreLogPath = "src/main/resources/logs/iexplorerlogs/";
	}
}
