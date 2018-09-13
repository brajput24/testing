/**
 * Copyright (c) 2017-2018 Xavient Digital 
 * - Reestablish your software!. All Rights Reserved.
 *
 */

package dotcom.steps;

import org.junit.Assert;

import com.comcast.utility.CommomMethods;
import com.comcast.wait.WebElementWait;
import com.dotcom.pages.Billing;
import com.dotcom.pages.Homepage;
import com.dotcom.pages.Services;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import dotcom.runner.Runner;

public class BuyDeal extends Runner {



	
 protected Homepage home = new Homepage(driver);
 protected Services service = new Services(driver);
 protected CommomMethods util = new CommomMethods();
 protected Billing bill = new Billing(driver);
	
	@Given("^user is on homepage$")
	public void user_is_on_homepage() throws Throwable {

		Assert.assertEquals(driver.getTitle(), "Digital Cable TV, Internet and Home Phone | XFINITY");
	   
	}
	
	@When("^user clicks shop link$")
	public void user_clicks_shop_link() throws Throwable {
		//Thread.sleep(6000);
    WebElementWait.waitForElementVisibility(home.getShopLink(), 15, driver);
    util.elementHighlight(home.getShopLink(), driver);
	home.getShopLink().click();
	   
	}

	@When("^user enters its address$")
	public void user_enters_its_address() throws Throwable {

	  home.getStreetAddress().sendKeys("10 TEST AVE");
	  home.getAddressZipcode().sendKeys("60061");
	}

	@When("^clicks on show deal button$")
	public void clicks_on_show_deal_button() throws Throwable {
	   home.getDealsButton().click();
	}

	@When("^able to navigate to services section$")
	public void able_to_navigate_to_services_section() throws Throwable {
		WebElementWait.waitForElementVisibility(service.getPhoneFilter(), 40, driver);
		//Assert.assertEquals(driver.getTitle(), "Digital Cable TV, Internet and Home Phone | XFINITY");
	}

	@When("^filters result based on \"([^\"]*)\" only$")
	public void filters_result_based_on_only(String plan) throws Throwable {
	   
	   service.getPhoneFilter().click();
	   service.getTvFilter().click();
	}

	@When("^user selects \"([^\"]*)\" deal to its cart$")
	public void user_selects_deal_to_its_cart(String deal) throws Throwable {
	   service.getAddPlan().click();
	   WebElementWait.waitForElementVisibility(service.getTvNext(), 40, driver);
	   service.getTvNext().click();
	   WebElementWait.waitForElementVisibility(service.getModemNext(), 40, driver);
	   util.javascriptClick(service.getModemNext(), driver);
	   
	}

	@When("^selects gateway offer$")
	public void selects_gateway_offer() throws Throwable {
		WebElementWait.waitForElementVisibility(service.getTakeModem(), 40, driver);
	   util.javascriptClick(service.getTakeModem(), driver);

	   
	}

	@When("^clicks on next install button$")
	public void clicks_on_next_install_button() throws Throwable {
		WebElementWait.waitForElementVisibility(service.getModemPricing(), 40, driver);
		   util.elementHighlight(service.getModemPricing(), driver);
		util.javascriptClick(service.getNextInstall(), driver);
	}

	@When("^on installation page selects Get a self-install kit option$")
	public void on_installation_page_selects_Get_a_self_install_kit_option() throws Throwable {
		WebElementWait.waitForElementVisibility(service.getSelfSchedule(), 40, driver);
		util.javascriptClick(service.getSelfSchedule(), driver);
	   
	}

	@When("^clicks next button$")
	public void clicks_next_button() throws Throwable {
		WebElementWait.waitForElementVisibility(service.getStandardShipping(), 40, driver);
		util.javascriptClick(service.getAccountInfo(), driver);
	}

/*	@When("^on billing page fills up all required information\\.$")
	public void on_billing_page_fills_up_all_required_information() throws Throwable {
	   
	}
	@Then("^user should able to buy deal$")
	public void user_should_able_to_buy_deal() throws Throwable {
	    
	}*/
}
