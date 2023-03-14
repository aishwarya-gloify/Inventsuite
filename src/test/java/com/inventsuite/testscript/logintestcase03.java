package com.inventsuite.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.inventsuite.generics.baseclass;
import com.inventsuite.pom.LoginPage;
@Listeners(com.inventsuite.generics.Listener2.class)
public class logintestcase03 extends baseclass{
	@Test
	public void testcase03() throws EncryptedDocumentException, IOException, InterruptedException
	{// checking Login text and "You need to start,run and grow your business" texts are displayed
		LoginPage login= new LoginPage(driver);
		// Checking Login and text"Enter your email and password login to your store" is displayed
		assert (login.getLog().isDisplayed()&&login.getText().isDisplayed());
		
	}

}
