package com.inventsuite.testscript.tags;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.inventsuite.generics.FileLib;
import com.inventsuite.generics.tagbaseclass;
import com.inventsuite.pom.tags;

public class tagtestcase06 extends tagbaseclass{
	@Test(priority = 1)
	public void testcase0601() throws EncryptedDocumentException, IOException, InterruptedException
	{
		tags t= new tags(driver);
FileLib f= new FileLib();
		
		t.getAdd_tag_btn().click();
		
		String data2=f.getExcelData("tag", 4, 3);
		
		t.getSlug_textbox().sendKeys(data2);
		
		Select s= new Select(t.getSelect_active_drpdwn());
		s.selectByIndex(1);
		
		Select s1= new Select(t.getSelect_featured_drpdwn());
		s1.selectByIndex(1);
		
		Select s2= new Select(t.getSelect_img_size_drpdwn());
		s2.selectByIndex(1);
		
		Thread.sleep(2000);
		
		t.getCreate_tag_btn().click();
		
		Thread.sleep(2000);
		
		assert t.getTag_name_validation().isDisplayed();
		assert t.getDisplay_order_validation().isDisplayed();
		
	}
	@Test(priority = 2)
	public void tagtestcase0602() throws EncryptedDocumentException, IOException, InterruptedException
	{
		tags t= new tags(driver);
		FileLib f= new FileLib();
				
				t.getAdd_tag_btn().click();
				
				String data1= f.getExcelData("tag",5,2);
				
				t.getTag_name_textbox().sendKeys(data1);
				
				Select s= new Select(t.getSelect_active_drpdwn());
				s.selectByIndex(1);
				
				Select s1= new Select(t.getSelect_featured_drpdwn());
				s1.selectByIndex(1);
				
				Select s2= new Select(t.getSelect_img_size_drpdwn());
				s2.selectByIndex(1);
				
				Thread.sleep(2000);
				
				t.getCreate_tag_btn().click();
				
				Thread.sleep(4000);
			
				assert t.getDisplay_order_validation().isDisplayed();
				
	}

}
