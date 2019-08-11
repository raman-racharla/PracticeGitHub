package com.facebook.pagelocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePageLocators {
	
	@FindBy(how=How.XPATH, using="//span[@class='_5qtp']")
	public WebElement createPost;
	
	@FindBy(how=How.XPATH, using="//div[@id='feedx_sprouts_container']")
	public WebElement container;

}
