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
public class storetestcase07 extends storebaseclass{
	// Have doubt in this
	@Test
	public void testcase07() throws EncryptedDocumentException, IOException, InterruptedException
	{
		//cheking by entering company name and domain name
		Reporter.log("Store", true);
		Store s= new Store(driver);
		Thread.sleep(3000);
		s.getAddstore().click();
		Thread.sleep(3000);
		
		FileLib f= new FileLib();
		
		String data1= f.getExcelData("storecreate", 4, 2);
		String data2= f.getExcelData("storecreate", 4, 3);
		
		
		
		s.getCmpname().sendKeys(data1);
		System.out.println(s.getCmpname());
		s.getDomainname().sendKeys(data2);
		s.getCreate_btn().click();
		
		Thread.sleep(3000);
		//System.out.println(s.getPermalink().getText());
		Reporter.log(data1);
		
		//assert s.getLogovalidation().isDisplayed();
		
		// checking company is displayed in permalink text box, company name= permalink text
		
		Assert.assertEquals(s.getPermalink().getText(), data1 );
	
		//Assert.assertEquals(s.getLogovalidation().getText(), "Logo Cannot be empty");
	
		Thread.sleep(3000);
		
	}

}
