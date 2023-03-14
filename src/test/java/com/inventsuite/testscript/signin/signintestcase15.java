package com.inventsuite.testscript.signin;

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
import com.inventsuite.pom.SignupPage;



public class signintestcase15 extends baseclass{
	
	@Test
	public void testcase15() throws EncryptedDocumentException, IOException, InterruptedException
	{
		SignupPage signup= new SignupPage(driver);
		LoginPage l=new LoginPage(driver);
		Actions(l.getSignup());
		Reporter.log("signuppage", true);
		FileLib f= new FileLib();
		

		String data1= f.getExcelData("signuppage", 10, 2);
		String data2= f.getExcelData("signuppage", 10, 3);
		String data3= f.getExcelData("signuppage", 10, 4);
		
		signup.getEmail().sendKeys(data1);
		signup.getPwd().sendKeys(data2);
		signup.getConpwd().sendKeys(data3);
		
		signup.getCreate().click();
		
		Thread.sleep(5000);
		
      //assert signup.getEmailvalidation().isDisplayed();
	WebElement success= driver.findElement(By.xpath("//h2[@id='swal2-title']"));	
	String message= success.getText();
	System.out.println(message);
	//Assert.assertEquals(signup.getEmailvalidation().getText(), "Invalid email address, eg: abc@example.xyz");
	
	//Assert.assertEquals(message, "Success");
	//Assert.assertFalse(true, message);
	
	Assert.fail(message);
	}

}
