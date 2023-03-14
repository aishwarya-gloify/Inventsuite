package com.inventsuite.testscript.signin;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.inventsuite.generics.FileLib;
import com.inventsuite.generics.baseclass;

import com.inventsuite.pom.LoginPage;
import com.inventsuite.pom.SignupPage;

public class signintestcase06 extends baseclass{
	@Test
	public void testcase06() throws EncryptedDocumentException, IOException, InterruptedException
	{
		SignupPage signup= new SignupPage(driver);
		LoginPage l=new LoginPage(driver);
		Actions(l.getSignup());
		Thread.sleep(3000);
		//Reporter.log("signuppage", true);
		//FileLib f= new FileLib();
		
		//String data1= f.getExcelData("signuppage", 1, 2);
		//String data2= f.getExcelData("signuppage", 1, 3);
		//signup.getEmail().sendKeys(data1);
		//signup.getPwd().sendKeys(data2);
		//System.out.println(data1);
		
		signup.getCreate().click();
		Thread.sleep(5000);
		
		String emailvalidation= signup.getEmailvalidation().getText();
		String pwdvalidation= signup.getPwdvalidation().getText();
		String conpwdvalidation= signup.getConpwdvalidation().getText();
		
	
		Assert.assertEquals(emailvalidation, "Email Cannot be empty");
		Assert.assertEquals(pwdvalidation, "Password cannot be empty");
		Assert.assertEquals(conpwdvalidation, "Confirm password cannot be empty");
		
	}

}
