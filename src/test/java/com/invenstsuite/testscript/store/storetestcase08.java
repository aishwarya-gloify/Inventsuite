package com.invenstsuite.testscript.store;

import java.awt.AWTException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.inventsuite.generics.storebaseclass;
import com.inventsuite.pom.Store;
import com.inventsuite.pom.fileupload;
@Listeners(com.inventsuite.generics.Listenerstore.class)
public class storetestcase08 extends storebaseclass{
	
	@Test
	public void testcase08() throws InterruptedException, AWTException
	{
		// cheking by uploading logo with blank data in other fields
		Store s= new Store(driver);
		fileupload f= new fileupload();
		
		s.getAddstore().click();
		Thread.sleep(2000);
		
		s.getUploadlogo().click();
		f.uploadfile();
		
		s.getCreate_btn().click();
		Thread.sleep(3000);
		assert s.getCompanynamevalidation().isDisplayed();
		assert s.getDomainvalidation().isDisplayed();
		assert s.getPermalinkvalidation().isDisplayed();
		
		
	}

}
