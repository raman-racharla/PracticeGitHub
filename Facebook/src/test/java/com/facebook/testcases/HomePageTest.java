package com.facebook.testcases;

import org.testng.annotations.Test;

import com.facebook.pageactions.HomePageActions;


public class HomePageTest {
	
	@Test
	public void homePageTest() throws InterruptedException
	{
		
		HomePageActions homePage = new HomePageActions();
		homePage.doCreatePost();
	}

}
