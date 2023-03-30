package com.inventsuite.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.inventsuite.testscript.logintestcase02;
import com.demo.base;
import com.inventsuite.generics.baseclass;
import com.inventsuite.pom.LoginPage;
@Listeners(com.inventsuite.generics.Listener2.class)
public class logintestcase001 extends base {
	
	@Test
	public void testcase() throws EncryptedDocumentException, IOException, InterruptedException 
	{
		
		// checking email id and paswword id are blank
	LoginPage login=new LoginPage(driver);
	
    String email= login.getUntbx().getText();
    String pwd= login.getPwtbx().getText();
      Assert.assertEquals(email, "");
      Assert.assertEquals(pwd, "");
      
	
   
	
		
	}

}
