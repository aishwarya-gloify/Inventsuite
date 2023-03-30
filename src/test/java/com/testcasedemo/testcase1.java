package com.testcasedemo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.demo.base;
import com.inventsuite.pom.LoginPage;

public class testcase1 extends base{
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
