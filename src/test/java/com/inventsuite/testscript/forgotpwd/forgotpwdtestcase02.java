package com.inventsuite.testscript.forgotpwd;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.inventsuite.generics.baseclass;
import com.inventsuite.pom.LoginPage;
import com.inventsuite.pom.forgorpwd;

@Listeners(com.inventsuite.generics.Listener2.class)
public class forgotpwdtestcase02 extends baseclass{
	@Test
	public void testcase02() throws InterruptedException
	{
		forgorpwd f= new forgorpwd(driver);
		LoginPage login= new LoginPage(driver);
		//login.getPsd().click();
		Actions(login.getPsd());
		
		
		//f.getVerify().click();
		Thread.sleep(5000);
		
		Assert.assertEquals(f.getEmail().getText(), "");
		System.out.println("Email text box is empty");
	}

}
