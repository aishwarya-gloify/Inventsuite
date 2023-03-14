package com.inventsuite.testscript.signin;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inventsuite.generics.baseclass;

import com.inventsuite.pom.LoginPage;
import com.inventsuite.pom.SignupPage;

public class signintestcase02 extends baseclass{
	
	@Test
	public void testcase02() throws InterruptedException 
	{
		SignupPage signup= new SignupPage(driver);
		LoginPage l=new LoginPage(driver);
		Actions(l.getSignup());
		Thread.sleep(3000);
		
	    assert signup.getLogo().isDisplayed();
	    assert signup.getText().isDisplayed();
	   String text= signup.getText().getText();
	   Assert.assertEquals(text, "Create Your Store");
	   assert signup.getText1().isDisplayed();
	   String text1= signup.getText1().getText();
	   Assert.assertEquals(text1, "You need to start,run and grow your business");
	    assert signup.getEmail().isDisplayed();
	    assert signup.getPwd().isDisplayed();
	    assert signup.getConpwd().isDisplayed();
	    assert signup.getCreate().isDisplayed();
	    assert signup.getSignin().isDisplayed();
	    
	    Thread.sleep(5000);
	    System.out.println(signup.getText().getText());
	    System.out.println(signup.getText1().getText());
	    System.out.println(signup.getCreate().getText());
		
	}

}
