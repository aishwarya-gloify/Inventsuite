package com.inventsuite.testscript;



import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.demo.base;
import com.inventsuite.generics.baseclass;
import com.inventsuite.pom.LoginPage;
@Listeners(com.demo.Listenertest.class)
public class logintestcase04 extends base{
	@Test
	public void testcase04() throws EncryptedDocumentException, IOException, InterruptedException
	{
		// Checking with blank email and blank password, on click on login validation message is displayed
		LoginPage login= new LoginPage(driver);
		// checking validation message is displayed for email and password
		Actions act= new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Login')]"))).click().perform();
        // login.setLogin().click();

		
		/*//Assert.assertTrue(emailValidation.isDisplayed(), "Email validation message is not displayed");
       
	*/
		
		//Assert.assertTrue(login.emailvalidation().isDisplayed());
		Thread.sleep(5000);
		assert (login.getPasswordvalidation().isDisplayed()&&login.getEmailvalidation().isDisplayed());
	//	assert login.emailvalidation.isDisplayed();
	}

}
