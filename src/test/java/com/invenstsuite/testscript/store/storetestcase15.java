package com.invenstsuite.testscript.store;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.inventsuite.generics.FileLib;
import com.inventsuite.generics.storebaseclass;
import com.inventsuite.pom.Store;
import com.inventsuite.pom.fileupload;
@Listeners(com.inventsuite.generics.Listenerstore.class)
public class storetestcase15 extends storebaseclass{
	
	@Test
	public void testcase15() throws InterruptedException, EncryptedDocumentException, IOException, AWTException
	{
		// need to check this one
		Reporter.log("Store", true);
		Store s= new Store(driver);
		Thread.sleep(3000);
		s.getAddstore().click();
		Thread.sleep(3000);
		
		FileLib f= new FileLib();
		
		String data1= f.getExcelData("storecreate", 6, 2);
		String data2=f.getExcelData("storecreate", 6, 3);
		String data3= f.getExcelData("storecreate", 6, 4);
		
		// passing data to text box
		
		s.getCmpname().sendKeys(data1);
		s.getDomainname().sendKeys(data2);
		s.getPermalink().sendKeys(data3);
		
		//click on upload image button
		s.getUploadlogo().click();
		Thread.sleep(3000);
		
		// uploading image from system
		
		fileupload upload= new fileupload();
		upload.uploadfile();
		
		Thread.sleep(4000);
		s.getCreate_btn().click();
		
		String successmsg= driver.findElement(By.xpath("//h2[@id='swal2-title']")).getText();
		
		String createdmsg= driver.findElement(By.xpath("//div[@id='swal2-content']")).getText();
		
		WebElement ok_btn= driver.findElement(By.xpath("//button[contains(text(),'OK')]"));
		
		Assert.assertEquals(successmsg, "Success");
		Assert.assertEquals(createdmsg, "Company created successfully");
		ok_btn.click();
		
		

		Thread.sleep(4000);
		
		s.getAddstore().click();
		Thread.sleep(4000);
		
		String data12= f.getExcelData("storecreate", 6, 2);
		String data22= f.getExcelData("storecreate", 6, 3);
		String data32= f.getExcelData("storecreate", 6, 4);
		
		// passing data to text box
		
		s.getCmpname().sendKeys(data12);
		s.getDomainname().sendKeys(data22);
		s.getPermalink().sendKeys(data32);
		
		//click on upload image button
		s.getUploadlogo().click();
		Thread.sleep(3000);
		
		// uploading image from system
		
		fileupload upload1= new fileupload();
		upload.uploadfile();
		
		Thread.sleep(4000);
		s.getCreate_btn().click();
		
		Thread.sleep(2000);
		
		String errormsg= driver.findElement(By.xpath("//div[@id='swal2-content']")).getText();
		//Unique link is already taken
		
		WebElement ok_btn2= driver.findElement(By.xpath("//button[normalize-space()='OK']"));
		
		Assert.assertEquals(errormsg, "Unique link is already taken");
		
		ok_btn2.click();
	}

}
