package com.inventsuite.testscript.profilepage;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.inventsuite.generics.profilepage;
import com.inventsuite.pom.profile;
@Listeners(com.inventsuite.generics.Listenerprofile.class)
public class profiletestcase02 extends profilepage{
	@Test
	public void profiletestcase02() throws InterruptedException
	{
		profile p= new profile(driver);
		
		p.getUserimg().click();
		Thread.sleep(3000);
		p.getLogout().click();
		
		Thread.sleep(4000);
		String Expected_url="https://admin.gloify.co/login";
		
		String current_url= driver.getCurrentUrl();
		
		Thread.sleep(2000);
		Assert.assertEquals(current_url, Expected_url);
		
	}

}
