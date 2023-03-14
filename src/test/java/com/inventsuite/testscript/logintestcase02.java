package com.inventsuite.testscript;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.inventsuite.generics.baseclass;
import com.inventsuite.pom.LoginPage;

@Listeners(com.inventsuite.generics.Listener2.class)
public class logintestcase02 extends baseclass{
	@Test
	public void testcase02() throws EncryptedDocumentException, IOException, InterruptedException{
		// checking logo is present
		LoginPage login= new LoginPage(driver);
		// testing logo id displayed

	/*boolean logo=login.logo().isDisplayed();
	if (logo) {
        System.out.println("Logo is displayed.");
    } else {
        System.out.println("Logo is not displayed.");
    }
	*/
 //assert login.logo().isDisplayed();
	//Assert.assertTrue(login.logo().isDisplayed());
		//Assert.assertTrue(login.logo.isDisplayed());
assert login.getLogo().isDisplayed();
Thread.sleep(5000);
	}

}
