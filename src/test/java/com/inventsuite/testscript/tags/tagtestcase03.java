package com.inventsuite.testscript.tags;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.inventsuite.generics.FileLib;
import com.inventsuite.generics.tagbaseclass;
import com.inventsuite.pom.tags;

public class tagtestcase03 extends tagbaseclass{
	@Test
	public void tagtestcase04() throws EncryptedDocumentException, IOException, InterruptedException
	{
		tags t= new tags(driver);
		FileLib f= new FileLib();
		
		t.getAdd_tag_btn().click();
		String data1= f.getExcelData("tag", 1, 2);
		String data2=f.getExcelData("tag", 1, 3);
		//String data3= f.getExcelData("tag", 1, 4);
		
		t.getTag_name_textbox().sendKeys(data1);
		t.getSlug_textbox().sendKeys(data2);
		//t.getDisplayorder_textbox().sendKeys(data3);
		
		Select s= new Select(t.getSelect_active_drpdwn());
		s.selectByIndex(1);
		String active= t.getSelect_active_drpdwn().getAttribute("value");
		Select s1= new Select(t.getSelect_featured_drpdwn());
		s1.selectByIndex(1);
		
		Select s2= new Select(t.getSelect_img_size_drpdwn());
		s2.selectByIndex(1);
		
		Thread.sleep(2000);
		
		t.getCreate_tag_btn().click();
		
		Thread.sleep(2000);
		
		assert t.getTag_name_validation().isDisplayed();
		assert t.getDisplay_order_validation().isDisplayed();
		
		return;
	}

}
