package com.inventsuite.testscript.forgotpwd;

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
import com.inventsuite.pom.forgorpwd;


@Listeners(com.inventsuite.generics.Listener2.class)
// Signed in email id, but not verified
public class forgotpwdtestcase04 extends baseclass{
	@Test
	public void testcase04() throws InterruptedException, EncryptedDocumentException, IOException
	{
		forgorpwd f= new forgorpwd(driver);
		LoginPage login= new LoginPage(driver);
		//login.getPsd().click();
		Actions(login.getPsd());
		Thread.sleep(5000);
		
		Reporter.log("frpwd", true);
		FileLib file= new FileLib();
		
		String data= file.getExcelData("frpwd", 1, 2);
		System.out.println(data);
		f.getEmail().sendKeys(data);
		Thread.sleep(2000);
		 f.getVerify().click();
		
		WebElement success= driver.findElement(By.xpath("//div[contains(text(),'You will receive an email with Reset password inst')]"));
		String message= success.getText();
		System.out.println(message);
		//Assert.assertEquals(message, "You will receive an email with Reset password instructions");
		
		Assert.fail(message);
	}

}
