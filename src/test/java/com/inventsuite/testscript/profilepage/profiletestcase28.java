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
public class profiletestcase28 extends profilepage
{
	
	@Test
	public void profiletestcase28() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Reporter.log("frpwd", true);
		FileLib file= new FileLib();
		profile p= new profile(driver);
		p.getUserimg().click();
		Thread.sleep(3000);
		p.getChange_pwd().click();
		Thread.sleep(3000);
		
		String data1=file.getExcelData("changepwd", 2, 2);
		//String data2= file.getExcelData("changepwd", 2, 3);
		String data3=file.getExcelData("changepwd", 2, 4);
		
		Thread.sleep(3000);
		p.getCurrent_pwd().sendKeys(data1);
		p.getConfirm_pwd().sendKeys(data3);
		
		Thread.sleep(3000);
		p.getChange_pwd_btn().click();
		
		Thread.sleep(5000);
		
		Assert.assertEquals(p.getNew_pwd_validation().getText(), "Password cannot be empty");
		
		Assert.assertEquals(p.getNot_matched_validation().getText(), "New Password and Confirm password not matched");
		Thread.sleep(5000);
	}

}
