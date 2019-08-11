package com.facebook.testcases;

import org.testng.annotations.Test;

import com.facebook.pageactions.LandingPageActions;
import com.facebook.utils.BasePage;

public class LandingPageTest {
	
	@Test
	public void landingPageTest()
	{
		BasePage.initConfiguration();
		LandingPageActions landingPage = new LandingPageActions();
		landingPage.doLogin();
	}

}
