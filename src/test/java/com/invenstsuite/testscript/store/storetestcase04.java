package com.invenstsuite.testscript.store;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.inventsuite.generics.FileLib;
import com.inventsuite.generics.storebaseclass;
import com.inventsuite.pom.Store;
@Listeners(com.inventsuite.generics.Listenerstore.class)
public class storetestcase04 extends storebaseclass{
	
	@Test
	public void testcase04() throws InterruptedException, EncryptedDocumentException, IOException
	{
		// checking by entering space
		Reporter.log("Store", true);
		Store s= new Store(driver);
		Thread.sleep(3000);
		s.getAddstore().click();
		Thread.sleep(3000);
		
		FileLib f= new FileLib();
		
		String data1= f.getExcelData("storecreate", 1, 2);
		String data2= f.getExcelData("storecreate", 1, 3);
		String data3= f.getExcelData("storecreate", 1, 4);
		
		// passing data to text box
		
		s.getCmpname().sendKeys(data1);
		s.getDomainname().sendKeys(data2);
		s.getPermalink().sendKeys(data3);
		
		Thread.sleep(2000);
		
		s.getCreate_btn().click();
		
		assert s.getCompanynamevalidation().isDisplayed();
		assert s.getDomainvalidation().isDisplayed();
		assert	s.getPermalinkvalidation().isDisplayed();
		assert s.getLogovalidation().isDisplayed();
		
		Assert.assertEquals(s.getCompanynamevalidation().getText(), "Company Name Cannot be empty");
		Assert.assertEquals(s.getDomainvalidation().getText(), "Company Domain Cannot be empty");
		Assert.assertEquals(s.getPermalinkvalidation().getText(), "Company Permalink Cannot be empty");
		Assert.assertEquals(s.getLogovalidation().getText(), "Logo Cannot be empty");
		Thread.sleep(3000);
	}
	
	

}
