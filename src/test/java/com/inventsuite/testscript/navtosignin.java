package com.inventsuite.testscript;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.inventsuite.generics.baseclass;
import com.inventsuite.pom.LoginPage;
@Listeners(com.inventsuite.generics.Listener2.class)
public class navtosignin extends baseclass{
	@Test
	public void navtosignin() 
	{
		LoginPage login= new LoginPage(driver);
		
		Actions act= new Actions(driver);
		act.moveToElement(login.getSignup()).click().perform();
		String current_url= driver.getCurrentUrl();
		String expected_url="https://admin.gloify.co/Signup";
		
		Assert.assertEquals(current_url, expected_url);
		
		System.out.println("On click of Forgot password link from Login page, page is navigating to Reset password page, is working fine");
		
	}
	
	

}
