package com.inventsuite.testscript.signin;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.inventsuite.generics.FileLib;
import com.inventsuite.generics.baseclass;

import com.inventsuite.pom.LoginPage;
import com.inventsuite.pom.SignupPage;

public class signintestcase08 extends baseclass{
	@Test
	public void testcase08() throws EncryptedDocumentException, IOException, InterruptedException
	{
		SignupPage signup= new SignupPage(driver);
		LoginPage l=new LoginPage(driver);
		Actions(l.getSignup());
		Thread.sleep(3000);
		Reporter.log("signuppage", true);
		FileLib f= new FileLib();
		
		String data1= f.getExcelData("signuppage", 3, 2);
		String data2= f.getExcelData("signuppage", 3, 3);
		
		signup.getEmail().sendKeys(data1);
		signup.getPwd().sendKeys(data2);
		
	  signup.getCreate().click();
	  Thread.sleep(5000);
	  WebElement conpwdvalidation= driver.findElement(By.xpath("//p[contains(text(),'Password and confirm password not matched')]"));
	  String conpwdvalidation2= conpwdvalidation.getText();
		System.out.println(conpwdvalidation2);
		assert conpwdvalidation.isDisplayed();
		
		Assert.assertEquals(conpwdvalidation2, "Password and confirm password not matched");
		
	
	}

}
