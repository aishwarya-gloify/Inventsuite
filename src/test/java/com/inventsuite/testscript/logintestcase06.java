package com.inventsuite.testscript;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.inventsuite.generics.FileLib;
import com.inventsuite.generics.baseclass;
import com.inventsuite.pom.LoginPage;

@Listeners(com.inventsuite.generics.Listener2.class)
public class logintestcase06 extends baseclass{
	@Test
	public void testcase06() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Reporter.log("Login",true);
		FileLib f=new FileLib();
		String data1 = f.getExcelData("loginpage", 2, 2);
		LoginPage login= new LoginPage(driver);
		
	  login.getUntbx().sendKeys(data1);
	 
	  System.out.println(data1);
	  
	  String data2= f.getExcelData("loginpage", 2, 3);
	  login.getPwtbx().sendKeys(data2);
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  System.out.println(data2);
	  
	  login.getLgbtn().click();
	  
	  Thread.sleep(5000);
	  
	  WebElement swaltrigger= driver.findElement(By.xpath("//button[contains(text(),'OK')]"));
	  swaltrigger.click();
	  
	    // Accept the alert.
	    
    System.out.println("With invalid email id and valid password, validation message is displayed, is working fine");

	}

}
