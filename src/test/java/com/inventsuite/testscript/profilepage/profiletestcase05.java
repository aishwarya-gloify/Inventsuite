package com.inventsuite.testscript.profilepage;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.inventsuite.generics.profilepage;
import com.inventsuite.pom.profile;
@Listeners(com.inventsuite.generics.Listenerprofile.class)
public class profiletestcase05 extends profilepage{
	
	@Test
	public void profiletestcase05() throws InterruptedException
	{
		profile p= new profile(driver);
		
		p.getUserimg().click();
		Thread.sleep(3000);
		p.getMy_profile_btn().click();
		
		Thread.sleep(3000);
		p.getMyprofile_editbtn().click();
		
	}

}
