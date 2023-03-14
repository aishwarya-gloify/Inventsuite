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
public class storetestcase06 extends storebaseclass{
	
	@Test
	public void testcase06() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Reporter.log("Store", true);
		Store s= new Store(driver);
		Thread.sleep(3000);
		s.getAddstore().click();
		Thread.sleep(3000);
		
		FileLib f= new FileLib();
		
		
		String data1= f.getExcelData("storecreate", 3, 2);
		String data3= f.getExcelData("storecreate", 3, 4);
		
		s.getCmpname().sendKeys(data1);
		s.getPermalink().sendKeys(data3);
		
		s.getCmpname().sendKeys(data1);
		s.getPermalink().sendKeys(data3);
		s.getCreate_btn().click();
		Thread.sleep(3000);
		
		Assert.assertEquals(s.getDomainvalidation().getText(), "Company Domain Cannot be empty");
		Assert.assertEquals(s.getLogovalidation().getText(), "Logo Cannot be empty");
		Thread.sleep(3000);
	}
	

}
