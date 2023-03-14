package com.inventsuite.testscript.signin;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.inventsuite.generics.FileLib;
import com.inventsuite.generics.baseclass;

import com.inventsuite.pom.LoginPage;
import com.inventsuite.pom.SignupPage;

public class signintestcase11 extends baseclass{
	
	@Test
	public void testcase11() throws EncryptedDocumentException, IOException, InterruptedException
	{
		SignupPage signup= new SignupPage(driver);
		LoginPage l=new LoginPage(driver);
		Actions(l.getSignup());
		Thread.sleep(3000);
		Reporter.log("signuppage", true);
		FileLib f= new FileLib();
		
		String data1= f.getExcelData("signuppage", 6, 2);
		String data2= f.getExcelData("signuppage", 6, 3);
		String data3= f.getExcelData("signuppage", 6, 4);
		
		signup.getEmail().sendKeys(data1);
		signup.getPwd().sendKeys(data2);
		signup.getConpwd().sendKeys(data3);
		
		signup.getCreate().click();
		Thread.sleep(5000);
		
	}

}
