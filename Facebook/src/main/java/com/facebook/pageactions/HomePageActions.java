package com.facebook.pageactions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.facebook.pagelocators.HomePageLocators;
import com.facebook.utils.BasePage;

public class HomePageActions extends BasePage {

public HomePageLocators homePage;
	
	public HomePageActions()
	{
		this.homePage = new HomePageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 30);
		PageFactory.initElements(factory, this.homePage);
	}
       
	public void doCreatePost() throws InterruptedException
	{
		String winHandleBefore = driver.getWindowHandle();
		homePage.createPost.click();
		Thread.sleep(2000);
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_5yk2']//div[@class='_5rp7']//div[@class='_5rpb']//div[@class='notranslate _5rpu']//div//div//div[@class='_1mf _1mj']")).click();
		driver.findElement(By.xpath("//div[@class='_5yk2']//div[@class='_5rp7']//div[@class='_5rpb']//div[@class='notranslate _5rpu']//div//div//div[@class='_1mf _1mj']")).sendKeys("Hello");
		
	}
}
