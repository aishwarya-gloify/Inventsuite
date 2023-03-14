package com.inventsuite.testscript.profilepage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.inventsuite.generics.profilepage;
import com.inventsuite.pom.profile;
@Listeners(com.inventsuite.generics.Listenerprofile.class)
public class profiletestcase25 extends profilepage{
	
	@Test
	public void profiletestcase25() throws InterruptedException
	{
		profile p= new profile(driver);
		
		p.getUserimg().click();
		Thread.sleep(3000);
		p.getChange_pwd().click();
		Thread.sleep(3000);
		
		String change_pwd_txt= driver.findElement(By.xpath("//h6[normalize-space()='Change Password']")).getText();
		
		
		Assert.assertEquals(change_pwd_txt, "Change Password");
		
		assert p.getCurrent_pwd().isDisplayed();
		assert p.getNew_pwd().isDisplayed();
		assert p.getConfirm_pwd().isDisplayed();
		assert p.getChange_pwd_btn().isDisplayed();
		
		
		
		
	}

}
