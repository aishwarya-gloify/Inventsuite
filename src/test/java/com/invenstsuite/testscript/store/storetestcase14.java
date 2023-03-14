package com.invenstsuite.testscript.store;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.inventsuite.generics.FileLib;
import com.inventsuite.generics.storebaseclass;
import com.inventsuite.pom.Store;
import com.inventsuite.pom.fileupload;
@Listeners(com.inventsuite.generics.Listenerstore.class)
public class storetestcase14 extends storebaseclass{
	
	@Test
	public void testcase14() throws InterruptedException, EncryptedDocumentException, IOException, AWTException
	{
		Store s= new Store(driver);
		fileupload f= new fileupload();
		FileLib f1= new FileLib();
		s.getAddstore().click();
		Thread.sleep(2000);
		System.out.println("testing started");
		String data1= f1.getExcelData("storecreate", 3, 2);
		String data2= f1.getExcelData("storecreate", 1, 3);
		String data3= f1.getExcelData("storecreate", 5, 4);
		
		
		s.getCmpname().sendKeys(data1);
	//System.out.println(s.getCmpname().getText());
	//Reporter.log(s.getCmpname().getText());
		
		//Reporter.log(s.getCmpname().getText(), true);
		s.getDomainname().sendKeys(data2);
		s.getPermalink().sendKeys(data3);
		
		//System.out.println(s.getCmpname().getText());
		s.getUploadlogo().click();
		f.uploadfile();
		Thread.sleep(2000);
		
		s.getClose().click();
		
		Thread.sleep(3000);
		
		s.getAddstore().click();
		Thread.sleep(3000);
		
		s.getCreate_btn().click();
		
		Thread.sleep(2000);
		
		assert s.getDomainvalidation().isDisplayed();
	}

}
