package com.inventsuite.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.inventsuite.generics.baseclass;
import com.inventsuite.pom.LoginPage;


@Listeners(com.inventsuite.generics.Listener2.class)
public class logintestcase01 extends baseclass{
	@Test
	public void testlogin ()throws EncryptedDocumentException, IOException, InterruptedException{
		//checking logged in url is valid
		LoginPage login= new LoginPage(driver);
		
		String url ="https://admin.gloify.co/login";
		String current_url= driver.getCurrentUrl();
		/*if (current_url.equals(url)) {
            System.out.println("Navigation to " + url + " is successful");
        } else {
            System.out.println("Navigation to " + url + " failed");
        }*/
		 
	Assert.assertEquals(current_url, url);
	}
	

	

}
