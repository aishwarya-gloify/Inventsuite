package com.inventsuite.testscript;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.demo.base;
import com.inventsuite.generics.FileLib;
import com.inventsuite.generics.baseclass;
import com.inventsuite.pom.LoginPage;

@Listeners(com.inventsuite.generics.Listener2.class)
public class logintestcase05 extends baseclass{
	@Test
	public void testcase05() throws InterruptedException, EncryptedDocumentException, IOException
	{
		// checking with valid email id and valid password
	Reporter.log("Login",true);
	FileLib f=new FileLib();
	String data1 = f.getExcelData("loginpage", 1, 2);
	String data2=f.getExcelData("loginpage", 1, 3);
	
	LoginPage login= new LoginPage(driver);
	login.getUntbx().sendKeys(data1);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	login.getPwtbx().sendKeys(data2);
	
	Thread.sleep(5000);
	login.getLgbtn().click();
	Thread.sleep(5000);
	
	String current_url= driver.getCurrentUrl();
	String expected_url= "https://admin.gloify.co/dashboard";
	
	
	Assert.assertEquals(current_url, expected_url);
	System.out.println("checking with valid email id and valid password"+" is working fine");
	}

}
