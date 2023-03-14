package com.inventsuite.testscript.tags;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.inventsuite.generics.FileLib;
import com.inventsuite.generics.tagbaseclass;
import com.inventsuite.pom.tags;

public class tagtestcase07 extends tagbaseclass{
	@Test(priority = 1)
	public void tagtestcase0701() throws EncryptedDocumentException, IOException, InterruptedException
	{
		tags t= new tags(driver);
		FileLib f= new FileLib();
				
		t.getAdd_tag_btn().click();
		
		String data1= f.getExcelData("tag", 6, 2);
		double data3=f.getExcelData2("tag", 6, 4);
		
		
		String t2= Double.toString(data3);
		t.getTag_name_textbox().sendKeys(data1);
		t.getDisplayorder_textbox().sendKeys(t2);
		
		
		Select s1= new Select(t.getSelect_featured_drpdwn());
		s1.selectByIndex(1);
		
		Select s2= new Select(t.getSelect_img_size_drpdwn());
		s2.selectByIndex(1);
		
		Thread.sleep(2000);
		
		t.getCreate_tag_btn().click();
		
	  Thread.sleep(2000);
	  assert t.getSelect_active_validation().isDisplayed();
		
	}
	
	@Test(priority = 2)
	public void tagtestcase0702() throws EncryptedDocumentException, IOException, InterruptedException
	{
		tags t= new tags(driver);
		FileLib f= new FileLib();
				
		t.getAdd_tag_btn().click();
		
		String data1= f.getExcelData("tag", 6, 2);
		double data3=f.getExcelData2("tag", 6, 4);
		
		
		String t2= Double.toString(data3);
		t.getTag_name_textbox().sendKeys(data1);
		t.getDisplayorder_textbox().sendKeys(t2);
		
		Select s= new Select(t.getSelect_active_drpdwn());
		s.selectByIndex(1);
		
		
		Select s2= new Select(t.getSelect_img_size_drpdwn());
		s2.selectByIndex(1);
		
		Thread.sleep(2000);
		
		t.getCreate_tag_btn().click();
		
	  Thread.sleep(2000);
	  assert t.getSelect_featured_valudation().isDisplayed();
	}
	
	@Test(priority = 3)
	public void tagtestcase0703() throws EncryptedDocumentException, IOException, InterruptedException
	{
		tags t= new tags(driver);
		FileLib f= new FileLib();
				
		t.getAdd_tag_btn().click();
		
		String data1= f.getExcelData("tag", 6, 2);
		double data3=f.getExcelData2("tag", 6, 4);
		
		
		String t2= Double.toString(data3);
		t.getTag_name_textbox().sendKeys(data1);
		t.getDisplayorder_textbox().sendKeys(t2);
		
		Select s= new Select(t.getSelect_active_drpdwn());
		s.selectByIndex(1);
		
		Select s1= new Select(t.getSelect_featured_drpdwn());
		s1.selectByIndex(1);
		
		
		Thread.sleep(2000);
		
		t.getCreate_tag_btn().click();
		
	  Thread.sleep(2000);
	  assert t.getImage_size_validation().isDisplayed();
	}
	
	@Test(priority = 4)
	public void tagtestcase04() throws EncryptedDocumentException, IOException, InterruptedException
	{
		tags t= new tags(driver);
		FileLib f= new FileLib();
				
		t.getAdd_tag_btn().click();
		
		String data1= f.getExcelData("tag", 6, 2);
		double data3=f.getExcelData2("tag", 6, 4);
		
		
		String t2= Double.toString(data3);
		t.getTag_name_textbox().sendKeys(data1);
		t.getDisplayorder_textbox().sendKeys(t2);
		
        Thread.sleep(2000);
		
		t.getCreate_tag_btn().click();
		
	    Thread.sleep(2000);
	    t.getSelect_active_validation().isDisplayed();
	    t.getSelect_featured_valudation().isDisplayed();
	    t.getImage_size_validation().isDisplayed();
	}

}
