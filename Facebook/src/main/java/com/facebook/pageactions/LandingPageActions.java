package com.facebook.pageactions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.facebook.pagelocators.LandingPageLocators;
import com.facebook.utils.BasePage;
import com.facebook.utils.Constants;

public class LandingPageActions extends BasePage {
	
	public LandingPageLocators landingPage;
	
	public LandingPageActions()
	{
		this.landingPage = new LandingPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.landingPage);
	}
       
	public void doLogin()
	{
		landingPage.email.sendKeys(Constants.email);
		landingPage.passWord.sendKeys(Constants.password);
		landingPage.login.click();
	}
	

	
}
