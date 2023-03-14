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

public class signintestcase07 extends baseclass{
	@Test
	public void testcase07() throws EncryptedDocumentException, IOException, InterruptedException
	{
		SignupPage signup= new SignupPage(driver);
		LoginPage l=new LoginPage(driver);
		Actions(l.getSignup());
		Thread.sleep(3000);
		Reporter.log("signuppage", true);
		FileLib f= new FileLib();
		
		String data1= f.getExcelData("signuppage", 2, 2);
		signup.getEmail().sendKeys(data1);
		
		signup.getCreate().click();
		String pwdvalidation= signup.getPwdvalidation().getText();
		String conpwdvalidation= signup.getConpwdvalidation().getText();
		
		Assert.assertEquals(pwdvalidation, "Password cannot be empty");
		Assert.assertEquals(conpwdvalidation, "Confirm password cannot be empty");
	}

}
