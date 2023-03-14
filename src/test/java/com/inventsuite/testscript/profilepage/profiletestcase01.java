package com.inventsuite.testscript.profilepage;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.inventsuite.generics.profilepage;
import com.inventsuite.pom.profile;
@Listeners(com.inventsuite.generics.Listenerprofile.class)
public class profiletestcase01 extends profilepage
{
	@Test
	public void profiletestcase01() throws InterruptedException
	{
		profile p= new profile(driver);
		
		p.getUserimg().click();
		Thread.sleep(2000);
		
		p.getEdit_icon().isDisplayed();
		p.getMy_profile_btn().isDisplayed();
		p.getChange_pwd().isDisplayed();
		p.getLogout().isDisplayed();
	}
	

}
