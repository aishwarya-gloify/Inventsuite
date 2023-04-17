package com.inventsuite.testscript;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

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

@Listeners(com.inventsuite.generics.Listener2.class)

//password less than 6 characters
public class logintestcase07 extends baseclass{
	@Test
	public void testcase06() throws EncryptedDocumentException, IOException, InterruptedException 
	{
	Reporter.log("login", true);
	FileLib f=new FileLib();
	String data1= f.getExcelData("loginpage", 3, 2);
	String data2= f.getExcelData("loginpage", 3, 3);
	LoginPage login= new LoginPage(driver);
	
	login.getUntbx().sendKeys(data1);
	login.getPwtbx().sendKeys(data2);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	login.getLgbtn().click();
	Thread.sleep(5000);
	
	WebElement message= driver.findElement(By.xpath("//p[@id='password-text']"));
	String message1= message.getText();
	System.out.println(message1);
	
	Assert.assertEquals(message1,"Password at least six characters");
	
	System.out.println("With valid email address and password less than 6 characters, is working fine");
	
	}
  
}
