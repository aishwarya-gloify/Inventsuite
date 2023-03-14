package com.inventsuite.testscript.forgotpwd;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.inventsuite.generics.baseclass;
import com.inventsuite.pom.LoginPage;
import com.inventsuite.pom.forgorpwd;

@Listeners(com.inventsuite.generics.Listener2.class)
public class forgotpwdtestcase1 extends baseclass{
	@Test
	public void testcase01()
	{
		forgorpwd f= new forgorpwd(driver);
		LoginPage login= new LoginPage(driver);
		//login.getPsd().click();
		Actions(login.getPsd());
		f.getLogo().isDisplayed();
		f.getText1().isDisplayed();
		f.getText2().isDisplayed();
		
		String text1= f.getText1().getText();
		String text2= f.getText2().getText();
		
		System.out.println(text1);
		System.out.println(text2);
		
		Assert.assertEquals(text1, "Reset password");
		Assert.assertEquals(text2, "Enter your email and get password change link to your mail");
	}

}
