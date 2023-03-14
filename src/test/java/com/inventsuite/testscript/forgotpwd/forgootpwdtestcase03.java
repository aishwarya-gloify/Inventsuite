package com.inventsuite.testscript.forgotpwd;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.inventsuite.generics.baseclass;
import com.inventsuite.pom.LoginPage;
import com.inventsuite.pom.forgorpwd;

@Listeners(com.inventsuite.generics.Listener2.class)
public class forgootpwdtestcase03 extends baseclass{
	@Test
	public void testcase03() throws InterruptedException
	{
		forgorpwd f= new forgorpwd(driver);
		LoginPage login= new LoginPage(driver);
		Actions(login.getPsd());
		
		
		
		f.getVerify().click();
		Thread.sleep(5000);
		
		assert f.getValidation().isDisplayed();
		
		Assert.assertEquals(f.getValidation().getText(), "Email Cannot be empty");
	}

}
