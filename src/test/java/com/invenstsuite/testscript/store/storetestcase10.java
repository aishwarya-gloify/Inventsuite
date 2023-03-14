package com.invenstsuite.testscript.store;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.inventsuite.generics.FileLib;
import com.inventsuite.generics.storebaseclass;
import com.inventsuite.pom.Store;
import com.inventsuite.pom.fileupload;
@Listeners(com.inventsuite.generics.Listenerstore.class)
public class storetestcase10 extends storebaseclass{
	
	@Test
	public void testcase10() throws InterruptedException, AWTException, EncryptedDocumentException, IOException
	{
		// cheking by uploading logo with space as data in other fields, faild testcase
		         Reporter.log("Store", true);
				Store s= new Store(driver);
				fileupload f1= new fileupload();
				FileLib f= new FileLib();
				
				s.getAddstore().click();
				Thread.sleep(2000);
				
				String data1= f.getExcelData("storecreate", 1, 2);
				String data2= f.getExcelData("storecreate", 1, 3);
				String data3= f.getExcelData("storecreate", 1, 4);
				
				// passing data to text box
				
				s.getCmpname().sendKeys(data1);
				s.getDomainname().sendKeys(data2);
				s.getPermalink().sendKeys(data3);
				
				s.getUploadlogo().click();
				f1.uploadfile();
				
				s.getCreate_btn().click();
				
				Thread.sleep(5000);
				
				assert s.getCompanynamevalidation().isDisplayed();
				assert s.getDomainvalidation().isDisplayed();
				assert s.getPermalinkvalidation().isDisplayed();
				
		 
	}

}
