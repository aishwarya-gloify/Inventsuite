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
public class profiletestcase27 extends profilepage{
	@Test
	public void profiletestcase27() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Reporter.log("changepwd", true);
		FileLib file= new FileLib();
		profile p= new profile(driver);
		p.getUserimg().click();
		Thread.sleep(3000);
		p.getChange_pwd().click();
		Thread.sleep(3000);
		
		//String data1=file.getExcelData("changepwd", 1, 2);
		String data2= file.getExcelData("changepwd", 1, 3);
		String data3=file.getExcelData("changepwd", 1, 4);
		
		Thread.sleep(3000);
		p.getNew_pwd().sendKeys(data2);
		p.getConfirm_pwd().sendKeys(data3);
		
		Thread.sleep(3000);
		p.getChange_pwd_btn().click();
		
		Assert.assertEquals(p.getCurrent_pwd_validation().getText(), "Current password cannot be empty");
	}

}
