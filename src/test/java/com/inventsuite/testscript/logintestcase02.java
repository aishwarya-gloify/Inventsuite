package com.inventsuite.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.demo.base;
import com.inventsuite.generics.baseclass;
import com.inventsuite.pom.LoginPage;

@Listeners(com.inventsuite.generics.Listener2.class)
public class logintestcase02 extends baseclass{
	@Test
	public void testcase02() throws EncryptedDocumentException, IOException, InterruptedException{
		// checking logo is present
		
		LoginPage login= new LoginPage(driver);
		// testing logo id displayed
		

	
assert login.getLogo().isDisplayed();
Thread.sleep(5000);

System.out.println("valid logo is displayed");

	}

}
