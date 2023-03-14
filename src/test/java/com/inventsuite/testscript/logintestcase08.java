package com.inventsuite.testscript;

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

@Listeners(com.inventsuite.generics.Listener2.class)
public class logintestcase08 extends baseclass{
	@Test
	public void testcase08() throws EncryptedDocumentException, IOException, InterruptedException
	{
	Reporter.log("login", true);
	FileLib f=new FileLib();
	String data1=f.getExcelData("loginpage", 4, 2);
	String data2= f.getExcelData("loginpage", 4, 3);
	
	LoginPage login= new LoginPage(driver);
	login.getUntbx().sendKeys(data1);
	login.getPwtbx().sendKeys(data2);
	
	Thread.sleep(5000);	
	login.getLgbtn().click();
		
	 login.getEmailvalidation().isDisplayed();
	 login.getPasswordvalidation().isDisplayed();
	 
	 Assert.assertEquals( login.getEmailvalidation().getText(),"Invalid email, eg: abc@example.xyz");
	 Assert.assertEquals(login.getPasswordvalidation().getText(), "Password at least six characters");
	
	}

}
