package com.inventsuite.testscript.profilepage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.inventsuite.generics.FileLib;
import com.inventsuite.generics.profilepage;
import com.inventsuite.pom.profile;
@Listeners(com.inventsuite.generics.Listenerprofile.class)
public class profiletestcase33 extends profilepage{
	
	@Test
	public void profiletestcase33() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Reporter.log("changepwd", true);
		System.out.println("testing29");
		
		profile p= new profile(driver);
		
		p.getUserimg().click();
	     Thread.sleep(4000);
	     p.getChange_pwd().click();
	     Thread.sleep(4000);
	     
	     FileLib f= new FileLib();
	     String data1=f.getExcelData("changepwd", 7, 2);
		 String data2= f.getExcelData("changepwd", 7, 3);
		 String data3=f.getExcelData("changepwd", 7, 4);
			
			Thread.sleep(3000);
			p.getCurrent_pwd().sendKeys(data1);
			p.getNew_pwd().sendKeys(data2);
			p.getConfirm_pwd().sendKeys(data3);
			
			Thread.sleep(3000);
			
			p.getChange_pwd_btn().click();
			
			Thread.sleep(3000);
			
			String error_msg=  driver.findElement(By.xpath("//div[@id='swal2-content']")).getText();
			
			WebElement ok_btn= driver.findElement(By.xpath("//button[normalize-space()='OK']"));
			
			Assert.assertEquals(error_msg, "Current Password and New Password should not be same.");
			
			ok_btn.click();
			Thread.sleep(3000);
			
	}

}
