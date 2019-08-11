package com.facebook.pagelocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LandingPageLocators {
	
	@FindBy(how=How.ID, using="email")
	public WebElement email;
	
	@FindBy(how=How.ID, using="pass")
	public WebElement passWord;
	
	@FindBy(how=How.ID, using="loginbutton")
	public WebElement login;
}
