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
public class storetestcase05 extends storebaseclass{
	
	@Test
	public void testcase05() throws InterruptedException, EncryptedDocumentException, IOException
	{
		
		// checking by providing company name and permalink
		
		Reporter.log("Store", true);
		Store s= new Store(driver);
		Thread.sleep(3000);
		s.getAddstore().click();
		Thread.sleep(3000);
		
		FileLib f= new FileLib();
		
		
		String data2= f.getExcelData("storecreate", 2, 3);
		String data3= f.getExcelData("storecreate", 2, 4);
		
		s.getDomainname().sendKeys(data2);
		s.getPermalink().sendKeys(data3);
		
		s.getCreate_btn().click();
		
		assert s.getCompanynamevalidation().isDisplayed();
		//assert s.getDomainvalidation().isDisplayed();
		assert s.getLogovalidation().isDisplayed();
		//Assert.assertEquals(s.getCompanynamevalidation().getText(), true);
		Assert.assertEquals(s.getCompanynamevalidation().getText(), "Company Name Cannot be empty");
		Assert.assertEquals(s.getLogovalidation().getText(), "Logo Cannot be empty");
		Thread.sleep(3000);
	}

}
