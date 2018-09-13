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



public class Homepage {
	protected static WebDriver driver;

public Homepage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}
	
	@FindBy(xpath=".//div[@class='polaris-header']/ul[3]/li[1]")
	private WebElement shopLink;
	
	@FindBy(id="Address_StreetAddress")
	 private WebElement streetAddress;
	
	@FindBy(id="Address_UnitNumber")
	 private WebElement addressUnit;
	
	@FindBy(id="Address_ZipCode")
	 private WebElement addressZipcode;
	
	@FindBy(xpath=".//*[@type=\"submit\"]")
	 private WebElement dealsButton;
	
	@FindBy(id="no")
	 private WebElement noOpinion;
	


	public WebElement getNoOpinion() {
		return noOpinion;
	}


	public void setNoOpinion(WebElement noOpinion) {
		this.noOpinion = noOpinion;
	}


	public WebElement getShopLink() {
		return shopLink;
	}


	public void setShopLink(WebElement shopLink) {
		this.shopLink = shopLink;
	}
	
	public WebElement getStreetAddress() {
		return streetAddress;
	}


	public void setStreetAddress(WebElement streetAddress) {
		this.streetAddress = streetAddress;
	}
	public WebElement getAddressZipcode() {
		return addressZipcode;
	}


	public void setAddressZipcode(WebElement addressZipcode) {
		this.addressZipcode = addressZipcode;
	}
	
	public WebElement getDealsButton() {
		return dealsButton;
	}


	public void setDealsButton(WebElement dealsButton) {
		this.dealsButton = dealsButton;
	}
}
