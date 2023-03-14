package com.inventsuite.testscript.profilepage;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.inventsuite.generics.profilepage;
import com.inventsuite.pom.profile;
@Listeners(com.inventsuite.generics.Listenerprofile.class)
public class profiletestcase26 extends profilepage{
	
	@Test
	public void profiletestcase26() throws InterruptedException
	{
		profile p= new profile(driver);
		
		p.getUserimg().click();
		Thread.sleep(3000);
		
		p.getChange_pwd().click();

		Assert.assertEquals(p.getCurrent_pwd().getAttribute("value"), "");
		Assert.assertEquals(p.getNew_pwd().getAttribute("value"), "");
		Assert.assertEquals(p.getConfirm_pwd().getAttribute("value"), "");
		
		Thread.sleep(3000);
		
		p.getChange_pwd_btn().click();
		
		Thread.sleep(3000);
		
		Assert.assertEquals(p.getCurrent_pwd_validation().getText(), "Current password cannot be empty");
		Assert.assertEquals(p.getNew_pwd_validation().getText(), "Password cannot be empty");
		Assert.assertEquals(p.getConfirm_pwd_validation().getText(), "Confirm password cannot be empty");
	}

}
