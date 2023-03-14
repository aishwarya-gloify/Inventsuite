package com.inventsuite.testscript.signin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inventsuite.generics.baseclass;

import com.inventsuite.pom.LoginPage;
import com.inventsuite.pom.SignupPage;

public class signintestcase01  extends baseclass {

	@Test
	public void testcase01() throws InterruptedException 
	{
		LoginPage l=new LoginPage(driver);
		Actions(l.getSignup());
		Thread.sleep(3000);

		//SignupPage signup= new SignupPage(driver);
		String current_url= driver.getCurrentUrl();
		String Expected_url= "https://admin.gloify.co/Signup";

		Thread.sleep(5000);
		Assert.assertEquals(current_url, Expected_url);



	}

}
