package com.inventsuite.testscript;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.inventsuite.generics.baseclass;
import com.inventsuite.pom.LoginPage;

@Listeners(com.inventsuite.generics.Listener2.class)
public class navtoforgotpwd extends baseclass{
	@Test
	public void navtoforgotpwd()
	{
	LoginPage login= new LoginPage(driver);
	Actions act= new Actions(driver);
	act.moveToElement(login.getPsd()).click().perform();
	
	String current_url= driver.getCurrentUrl();
	String Expected_url= "https://admin.gloify.co/forgot-password";
	
	Assert.assertEquals(current_url, Expected_url);
	System.out.println("On click of signin link from Login page, page is navigating to signin page, is working fine");
	}
	

}
