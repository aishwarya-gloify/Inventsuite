package com.testcasedemo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.testng.annotations.Test;

import com.demo.base;
import com.inventsuite.pom.LoginPage;

public class testcase2 extends base{
	@Test
	public void testcase02() throws EncryptedDocumentException, IOException, InterruptedException{
		// checking logo is present
		
		LoginPage login= new LoginPage(driver);
		// testing logo id displayed
		assert login.getLogo().isDisplayed();
         Thread.sleep(2000);

}
}
