package com.dotcom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Billing {
	
	protected static WebDriver driver;
	public Billing(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(id="firstNameLabel")
	private WebElement firstName;
	
	@FindBy(id="lastNameLabel")
	private WebElement lastName;
	
	@FindBy(id="telephoneNumber")
	private WebElement telephone;
	
	@FindBy(id="emailAddress")
	private WebElement emailAddress;
	
	@FindBy(id="cardholderFirstname")
	private WebElement cardHolderFirstName;
	
	@FindBy(id="cardholderLastname")
	private WebElement cardHolderLastName;
	
	@FindBy(id="cvv")
	private WebElement cvv;
	
	@FindBy(id="city")
	private WebElement city;
	
	@FindBy(id="state")
	private WebElement state;
	
	@FindBy(id="zipCode")
	private WebElement zipcode;
	
	public WebElement getCity() {
		return city;
	}


	public void setCity(WebElement city) {
		this.city = city;
	}


	public WebElement getState() {
		return state;
	}


	public void setState(WebElement state) {
		this.state = state;
	}


	public WebElement getZipcode() {
		return zipcode;
	}


	public void setZipcode(WebElement zipcode) {
		this.zipcode = zipcode;
	}


	public WebElement getFirstName() {
		return firstName;
	}


	public void setFirstName(WebElement firstName) {
		this.firstName = firstName;
	}
	
	public WebElement getLastName() {
		return lastName;
	}


	public void setLastName(WebElement firstName) {
		this.lastName = lastName;
	}
	
	public WebElement getTelephone() {
		return telephone;
	}


	public void setTelephone(WebElement telephone) {
		this.telephone = telephone;
	}
	
	public WebElement getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(WebElement emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public WebElement getCardHolderFirstName() {
		return cardHolderFirstName;
	}


	public void setCardHolderFirstName(WebElement cardHolderFirstName) {
		this.cardHolderFirstName = cardHolderFirstName;
	}
	
	public WebElement getCardHolderLastName() {
		return cardHolderFirstName;
	}


	public void setCardHolderLastName(WebElement cardHolderFirstName) {
		this.cardHolderLastName = cardHolderLastName;
	}
	
	public WebElement getCvv() {
		return cardHolderFirstName;
	}


	public void setCvv(WebElement cvv) {
		this.cvv = cvv;
	}
}
