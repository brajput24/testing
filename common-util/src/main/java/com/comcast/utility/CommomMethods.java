package com.comcast.utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class CommomMethods {
	
	public void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().dismiss();
		
	}
	
	public void elementHighlight(WebElement element, WebDriver driver) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].style.border='3px solid red'", element);
		
	}
	
	public void javascriptClick(WebElement element, WebDriver driver) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(false)", element);
		element.click();
		
	}
	
	
}
