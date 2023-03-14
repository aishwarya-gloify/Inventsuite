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

public class signintestcase16 extends baseclass  {
	
	@Test
	
	public void testcase16() throws EncryptedDocumentException, IOException, InterruptedException
	{
		SignupPage signup= new SignupPage(driver);
		LoginPage l=new LoginPage(driver);
		Actions(l.getSignup());
		Reporter.log("signuppage", true);
		FileLib f= new FileLib();
		
		String data1= f.getExcelData("signuppage", 12, 2);
		String data2= f.getExcelData("signuppage", 12, 3);
		String data3= f.getExcelData("signuppage", 12, 4);
		
		signup.getEmail().sendKeys(data1);
		signup.getPwd().sendKeys(data2);
		signup.getConpwd().sendKeys(data3);
		
		
		signup.getCreate().click();
		Thread.sleep(5000);
		
		WebElement success= driver.findElement(By.xpath("//h2[@id='swal2-title']"));	
		String message= success.getText();
		System.out.println(message);
		
		Assert.assertEquals(message,"Success");
		Thread.sleep(3000);
		WebElement ok= driver.findElement(By.xpath("//button[contains(text(),'OK')]"));
		ok.click();
		
				
		Thread.sleep(5000);
		
		LoginPage login= new LoginPage(driver);
		login.getUntbx().sendKeys(data1);
		login.getPwtbx().sendKeys(data2);
		
		Thread.sleep(5000);
		
		login.getLgbtn().click();
		
		Thread.sleep(5000);
		
		/*String current_url= driver.getCurrentUrl();
		String expected_url= "https://admin.gloify.co/dashboard";
		
		Assert.assertEquals(current_url, expected_url);
		*/
		
		WebElement error= driver.findElement(By.xpath("//h2[@id='swal2-title']"));
		
		String error1= error.getText();
		
		assert error.isDisplayed();
		
		
		Assert.assertEquals(error1, "Error");
		
		WebElement ok1= driver.findElement(By.xpath("//button[contains(text(),'OK')]"));
		
		ok1.click();
	}

	
		
	
}
