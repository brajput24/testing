/**
 * Copyright (c) 2017-2018 Xavient Digital 
 * - Reestablish your software!. All Rights Reserved.
 *
 */

package com.dotcom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Services {
	
	protected static WebDriver driver;
	
	public Services(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath=".//span[contains(text(),'Phone')]")
	 private WebElement phoneFilter;
	
	@FindBy(xpath=".//label[@for='lob-tv']/span")
	 private WebElement tvFilter;
	
	@FindBy(xpath="(.//button[@class='x-button--solid'])[1]")
	 private WebElement addPlan;
	
	@FindBy(xpath=".//label[contains(text(),' add a Gateway')]")
	 private WebElement takeModem;
	
	@FindBy(xpath=".//span[contains(text(),'Schedule a professional installation')]")
	 private WebElement serviceSchedule;
	
	@FindBy(xpath=".//label[contains(text(),'Get a self-install kit')]")
	 private WebElement selfSchedule;
	
	@FindBy(xpath=".//button[contains(text(), 'Next: Account Info')]")
	 private WebElement accountInfo;
	
	@FindBy(xpath=".//button[contains(text(),'Next: TVs')]")
	 private WebElement tvNext;
	
	@FindBy(xpath=".//h3[contains(text(),'Standard Shipping')]")
	 private WebElement standardShipping;
	
	@FindBy(xpath=".//button[contains(text(),'Next: Modem')]")
	 private WebElement modemNext;
	
	@FindBy(xpath=".//button[contains(text(), 'Next: Install')]")
	 private WebElement nextInstall;
	
	@FindBy(xpath="(.//h3[contains(text(),'Internet/Voice Equipment Rental')])[1]")
	 private WebElement modemPricing;
	
	public WebElement getStandardShipping() {
		return standardShipping;
	}


	public void setStandardShipping(WebElement standardShipping) {
		this.standardShipping = standardShipping;
	}


	public WebElement getServiceSchedule() {
		return serviceSchedule;
	}


	public void setServiceSchedule(WebElement serviceSchedule) {
		this.serviceSchedule = serviceSchedule;
	}


	public WebElement getTvNext() {
		return tvNext;
	}


	public void setTvNext(WebElement tvNext) {
		this.tvNext = tvNext;
	}


	public WebElement getModemNext() {
		return modemNext;
	}


	public void setModemNext(WebElement modemNext) {
		this.modemNext = modemNext;
	}


	public WebElement getNextInstall() {
		return nextInstall;
	}


	public void setNextInstall(WebElement nextInstall) {
		this.nextInstall = nextInstall;
	}


	
	public WebElement getModemPricing() {
		return modemPricing;
	}


	public void setModemPricing(WebElement modemPricing) {
		this.modemPricing = modemPricing;
	}


	public WebElement getPhoneFilter() {
		return phoneFilter;
	}


	public void setPhoneFilter(WebElement PhoneFilter) {
		this.phoneFilter = PhoneFilter;
	}
	
	public WebElement getTvFilter() {
		return tvFilter;
	}


	public void setTvFilter(WebElement tvFilter) {
		this.tvFilter = tvFilter;
	}
	
	public WebElement getAddPlan() {
		return addPlan;
	}


	public void setAddPlan(WebElement addPlan) {
		this.addPlan = addPlan;
	}
	
	public WebElement getTakeModem() {
		return takeModem;
	}


	public void setTakeModem(WebElement takeModem) {
		this.takeModem = takeModem;
	}
	
	public WebElement getSelfSchedule() {
		return selfSchedule;
	}


	public void setSelfSchedule(WebElement selfSchedule) {
		this.selfSchedule = selfSchedule;
	}
	
	public WebElement getAccountInfo() {
		return accountInfo;
	}


	public void setAccountInfo(WebElement accountInfo) {
		this.accountInfo = accountInfo;
	}
	
	
}
