package com.invenstsuite.testscript.store;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.inventsuite.generics.storebaseclass;
import com.inventsuite.pom.Store;
@Listeners(com.inventsuite.generics.Listenerstore.class)
public class storetestcase03 extends storebaseclass{
	
	@Test
	
	public void testcase03() throws InterruptedException
	{
		// Checking by providing blank data
		Store s= new Store(driver);
		s.getAddstore().click();
		s.getCreate_btn().click();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Thread.sleep(3000);
		
		assert s.getCompanynamevalidation().isDisplayed();
		assert s.getDomainvalidation().isDisplayed();
		assert	s.getPermalinkvalidation().isDisplayed();
		assert	s.getLogovalidation().isDisplayed();
		
		/*System.out.println(s.getCompanynamevalidation().getText());
		System.out.println(s.getDomainvalidation().getText());
		System.out.println(s.getPermalinkvalidation().getText());
		System.out.println(s.getLogovalidation().getText());*/
		
		Reporter.log(s.getCompanynamevalidation().getText());
		
		Assert.assertEquals(s.getCompanynamevalidation().getText(), "Company Name Cannot be empty");
		Assert.assertEquals(s.getDomainvalidation().getText(), "Company Domain Cannot be empty");
		Assert.assertEquals(s.getPermalinkvalidation().getText(), "Company Permalink Cannot be empty");
		Assert.assertEquals(s.getLogovalidation().getText(), "Logo Cannot be empty");
		
		Thread.sleep(3000);
	}

}
