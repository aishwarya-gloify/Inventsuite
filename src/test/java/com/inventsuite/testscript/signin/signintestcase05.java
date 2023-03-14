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
//checking with existing user
public class signintestcase05 extends baseclass{
	
	@Test
	public void testcase05() throws EncryptedDocumentException, IOException, InterruptedException
	{
		SignupPage signup= new SignupPage(driver);
		LoginPage l=new LoginPage(driver);
		Actions(l.getSignup());
		Thread.sleep(3000);
		Reporter.log("signuppage", true);
		FileLib f= new FileLib();
		String data1= f.getExcelData("signuppage", 9, 2);
		String data2= f.getExcelData("signuppage", 9, 3);
		String data3= f.getExcelData("signuppage", 9, 4);
		signup.getEmail().sendKeys(data1);
		signup.getPwd().sendKeys(data2);
		signup.getConpwd().sendKeys(data3);
		
		signup.getCreate().click();
		Thread.sleep(5000);
		
		WebElement message= driver.findElement(By.xpath("//h2[@id='swal2-title']"));
		assert message.isDisplayed();
		
		String message1= message.getText();
		System.out.println(message1);
		Assert.assertEquals(message1, "Email Address already exists");
		
		Thread.sleep(5000);
		
		WebElement ok= driver.findElement(By.xpath("//button[contains(text(),'OK')]"));
		ok.click();
		
	}

}
