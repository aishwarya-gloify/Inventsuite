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

public class signintestcse10 extends baseclass{
	@Test
	public void testcase10() throws EncryptedDocumentException, IOException, InterruptedException
	{
		SignupPage signup= new SignupPage(driver);
		LoginPage l=new LoginPage(driver);
		Actions(l.getSignup());
		Reporter.log("signuppage", true);
		FileLib f= new FileLib();
		String data1= f.getExcelData("signuppage", 5, 2);
		String data2= f.getExcelData("signuppage", 5, 3);
		String data3= f.getExcelData("signuppage", 5, 4);
		
		signup.getEmail().sendKeys(data1);
		signup.getPwd().sendKeys(data2);
		signup.getConpwd().sendKeys(data3);
		
		signup.getCreate().click();;
		Thread.sleep(5000);
		
		//String pwdvalidation= signup.getPwdvalidation().getText();
		WebElement conpwdvalidation= driver.findElement(By.xpath("//p[.='Password and confirm password not matched']"));
		  String conpwdvalidation2= conpwdvalidation.getText();
			System.out.println(conpwdvalidation2);
			assert conpwdvalidation.isDisplayed();
			
			Assert.assertEquals(conpwdvalidation2, "Password and confirm password not matched");
	}

}
