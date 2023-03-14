package com.inventsuite.testscript.profilepage;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.inventsuite.generics.profilepage;
import com.inventsuite.pom.profile;
@Listeners(com.inventsuite.generics.Listenerprofile.class)
public class profiletestcase03 extends profilepage{
	@Test
	public void profiletestcase03() throws InterruptedException
	{
		profile p= new profile(driver);
		
		p.getUserimg().click();
		Thread.sleep(3000);
		
		p.getMy_profile_btn().click();
		
		String current_url= driver.getCurrentUrl();
		
		System.out.println(current_url);
		
		Assert.assertEquals(current_url, "https://admin.gloify.co/profile");
	}

}
