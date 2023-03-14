package com.inventsuite.testscript.signin;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inventsuite.generics.baseclass;

import com.inventsuite.pom.LoginPage;
import com.inventsuite.pom.SignupPage;



public class signintestcase04 extends baseclass{
	@Test
	public void testcase04() throws InterruptedException
	{
		SignupPage signup= new SignupPage(driver);
		LoginPage l=new LoginPage(driver);
		Actions(l.getSignup());
		Thread.sleep(3000);
		
//		Actions act= new Actions(driver);
//		act.moveToElement(signup.getCreate()).click().perform();
		Actions(signup.getCreate());
		
		String emailvalidation= signup.getEmailvalidation().getText();
		System.out.println(emailvalidation);
		
		String pwdvalidation= signup.getPwdvalidation().getText();
		System.out.println(pwdvalidation);
		
		String conpwdvalidation= signup.getConpwdvalidation().getText();
		System.out.println(conpwdvalidation);
		Thread.sleep(5000);
		
		
	Assert.assertEquals(emailvalidation, "Email Cannot be empty");
	Assert.assertEquals(pwdvalidation, "Password cannot be empty");
	Assert.assertEquals(conpwdvalidation,"Confirm password cannot be empty");
	}

}
