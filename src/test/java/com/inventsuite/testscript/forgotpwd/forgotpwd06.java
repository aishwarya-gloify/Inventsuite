package com.inventsuite.testscript.forgotpwd;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.inventsuite.generics.FileLib;
import com.inventsuite.generics.baseclass;
import com.inventsuite.pom.LoginPage;
import com.inventsuite.pom.forgorpwd;

@Listeners(com.inventsuite.generics.Listener2.class)

public class forgotpwd06 extends baseclass{
	
	@Test
	
	public void testcase06() throws InterruptedException, EncryptedDocumentException, IOException
	{
		forgorpwd f= new forgorpwd(driver);
		LoginPage login= new LoginPage(driver);
		Actions(login.getPsd());
		Thread.sleep(5000);
		
		Reporter.log("frpwd", true);
		FileLib file= new FileLib();
		
		String data= file.getExcelData("frpwd", 3, 2);
		System.out.println(data);
		f.getEmail().sendKeys(data);
		Thread.sleep(5000);
		 f.getVerify().click();
		 
		 Thread.sleep(5000);
		 WebElement error= driver.findElement(By.xpath("//h2[@id='swal2-title']"));
		 
		 String error1= error.getText();
		 Assert.assertEquals(error1, "Unable to find user with email '"+data+"'.");
		 
		 WebElement ok= driver.findElement(By.xpath("//button[contains(text(),'OK')]"));
		 ok.click();
		 
	}

}
