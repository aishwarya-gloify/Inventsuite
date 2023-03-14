package com.inventsuite.testscript.forgotpwd;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inventsuite.generics.baseclass;
import com.inventsuite.pom.LoginPage;
import com.inventsuite.pom.forgorpwd;

public class forgotpwd07 extends baseclass{
	
	@Test
	public void testcase07() throws InterruptedException
	{
		forgorpwd f= new forgorpwd(driver);
		LoginPage login= new LoginPage(driver);
		Actions(login.getPsd());
		Thread.sleep(5000);
		
		Actions(f.getNavlogin());
		Thread.sleep(4000);
		String current_url= driver.getCurrentUrl();
		String expected_url="https://admin.gloify.co/login";
		
		Assert.assertEquals(current_url, expected_url);
	}

}
