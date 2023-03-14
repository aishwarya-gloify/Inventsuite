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

public class signintestcase17 extends baseclass{
	
	@Test
	public void testcase17() throws EncryptedDocumentException, IOException, InterruptedException{
		LoginPage l=new LoginPage(driver);
		Actions(l.getSignup());
		SignupPage signup= new SignupPage(driver);
		Reporter.log("signuppage", true);
		FileLib f= new FileLib();
		
		String data1= f.getExcelData("signuppage", 11, 2);
		String data2= f.getExcelData("signuppage", 11, 3);
		String data3= f.getExcelData("signuppage", 11, 4);
		
		signup.getEmail().sendKeys(data1);
		signup.getPwd().sendKeys(data2);
		signup.getConpwd().sendKeys(data3);
		
		signup.getCreate().click();
		Thread.sleep(5000);
		
		WebElement pwdval= driver.findElement(By.xpath("//p[contains(text(),'Password strength less than 6')]"));
		String pwdval2= pwdval.getText();
		System.out.println(pwdval2);
		
		Assert.assertEquals(pwdval2, "Password strength less than 6");
	}

}
