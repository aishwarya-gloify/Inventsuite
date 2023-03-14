package com.inventsuite.testscript.profilepage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.inventsuite.generics.FileLib;
import com.inventsuite.generics.profilepage;
import com.inventsuite.pom.profile;
@Listeners(com.inventsuite.generics.Listenerprofile.class)
public class profiletestcase31 extends profilepage{
	@Test
	public void profiletestcse31() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Reporter.log("changepwd", true);
		System.out.println("testing29");
		
		profile p= new profile(driver);
		
		p.getUserimg().click();
	     Thread.sleep(4000);
	     p.getChange_pwd().click();
	     Thread.sleep(4000);
	     
	     FileLib f= new FileLib();
	     String data1=f.getExcelData("changepwd", 5, 2);
		 String data2= f.getExcelData("changepwd", 5, 3);
		 String data3=f.getExcelData("changepwd", 5, 4);
			
			Thread.sleep(3000);
			p.getCurrent_pwd().sendKeys(data1);
			p.getNew_pwd().sendKeys(data2);
			p.getConfirm_pwd().sendKeys(data3);
			
			Thread.sleep(3000);
			
			p.getChange_pwd_btn().click();
			Thread.sleep(3000);
			
			Assert.assertEquals(p.getNew_pwd_validation().getText(), "Password strength less than 6");
			Assert.assertEquals(p.getNot_matched_validation().getText(), "New Password and Confirm password not matched");
	}

}
