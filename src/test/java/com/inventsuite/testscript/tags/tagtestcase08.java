package com.inventsuite.testscript.tags;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inventsuite.generics.FileLib;
import com.inventsuite.generics.tagbaseclass;
import com.inventsuite.pom.fileupload;
import com.inventsuite.pom.tags;

import utility.tagselectdropdowns;

public class tagtestcase08 extends tagbaseclass{
	
	
	@Test (priority = 1)
	public void tagtestcase0801() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Actions a= new Actions(driver);
		tags t= new tags(driver);
		FileLib f= new FileLib();
				
		t.getAdd_tag_btn().click();
		
		String data1= f.getExcelData("tag", 6, 2);
		double data3=f.getExcelData2("tag", 6, 4);
		String data2=f.getExcelData("tag", 4, 3);
		
		String t2= Double.toString(data3);
		t.getTag_name_textbox().sendKeys(data1);
		t.getDisplayorder_textbox().sendKeys(t2);
		t.getSlug_textbox().sendKeys(data2);
		Thread.sleep(3000);
		Select s= new Select(t.getSelect_active_drpdwn());
		s.selectByIndex(2);
		
		Select s1= new Select(t.getSelect_featured_drpdwn());
		s1.selectByIndex(2);
		
		Select s2= new Select(t.getSelect_img_size_drpdwn());
		s2.selectByIndex(2);
//		
//	tagselectdropdowns t0=new tagselectdropdowns();
//		t0.select_classes();
		
		// protected
		String drpactive= t.getSelect_active_drpdwn().getAttribute("value");
		System.out.println(drpactive);
		String drpfeatured=t.getSelect_featured_drpdwn().getAttribute("value");
		System.out.println(drpfeatured);
		String drpimg=t.getSelect_img_size_drpdwn().getAttribute("value");
		System.out.println(drpimg);
		
		Thread.sleep(2000);
		
		Thread.sleep(3000);
		
		t.getCreate_tag_btn().click();
		
	  Thread.sleep(2000);
	  
	  String message= t.getCreated_success_msg().getText();
	  
	  Assert.assertEquals(message, "Tag details created successfully");
	  
	  t.getSuccess_ok_btn().click();
	  
	  Thread.sleep(4000);
		WebElement product_btn= driver.findElement(By.xpath("//span[contains(text(),'Products')]"));
		
		//clicking on product
		a.moveToElement(product_btn).click().perform();
		
		Thread.sleep(3000);
		
		WebElement list2= driver.findElement(By.xpath("//div[@class='MuiCollapse-root MuiCollapse-entered']"));
		List<WebElement> listAll2 = list2.findElements(By.tagName("a"));
		//System.out.println(listAll2.size());
////		for (int i = 0; i < listAll2.size(); i++) {
////			WebElement text = listAll2.get(i);
////			System.out.println(text.getText());
////			
////
////		}
//		
		Thread.sleep(4000);
		for (WebElement option : listAll2) {
			
			String name= "Tags";
			
			if(option.getText().equals(name))
			{
				//System.out.println("Located element and clicked");
				a.moveToElement(option).perform();
				Thread.sleep(3000);
				a.moveToElement(option).click().perform();
				Thread.sleep(3000);
				break;
			}
		}
		List <WebElement> list= driver.findElements(By.xpath("//td[@class='MuiTableCell-root MuiTableCell-body'][2] "));
		System.out.println(list.size());
		for(int i=0;i<list.size();i++)
		{
			System.out.println("testing");
			String text = list.get(i).getText();
			System.out.println(text);
			if(text.equals(data1))
			{
				System.out.println("Tag with name "+data1+ " created successfully");
			}
		}
		
		String status= driver.findElement(By.xpath("//*[text()='"+data1+"']/../*[@class='MuiTableCell-root MuiTableCell-body'][3]")).getText();
		String featured=driver.findElement(By.xpath("//*[text()='"+data1+"']/../*[@class='MuiTableCell-root MuiTableCell-body'][4]")).getText();
		String display_order= driver.findElement(By.xpath("//*[text()='"+data1+"']/../*[@class='MuiTableCell-root MuiTableCell-body'][5]")).getText();
		String imagesize= driver.findElement(By.xpath("//*[text()='"+data1+"']/../*[@class='MuiTableCell-root MuiTableCell-body'][6]")).getText();
	  
		System.out.println(status);
		System.out.println(featured);
		System.out.println(display_order);
		System.out.println(imagesize);
		if(drpactive.equals("true") && status.equals("Active"))
		{
			System.out.println("Status in create and listing page are matched");
			
		}
		else if(drpactive.equals("false") && status.equals("Inactive"))
		{
			System.out.println("Status in create and listing page are matched and both are false");
		}
		else
		{
			Assert.fail();
		}
		
		if(drpfeatured.equals("true") && featured.equals("Active"))
		{
			System.out.println("featured in create and listing page are matched");
			
		}
		else if(drpfeatured.equals("false") && featured.equals("Inactive"))
		{
			System.out.println("featured in create and listing page are matched and both are false");
		}
		else
		{
			Assert.fail();
		}
		if(drpimg.equals(imagesize))
		{
			System.out.println("image size is equal");
			
		}
		
		else
		{
			Assert.fail();
		}
		
	}
	
	@Test(priority = 2)
	public void tagtestcase0802() throws InterruptedException, EncryptedDocumentException, IOException, AWTException
	{
		tags t= new tags(driver);
		FileLib f= new FileLib();
		String data1= f.getExcelData("tag", 6, 2);
		Actions a=new Actions(driver);
		
		
// Listing page data
		Thread.sleep(2000);
		WebElement dots= driver.findElement(By.xpath("//*[text()='"+data1+"']/../*[@class='MuiTableCell-root MuiTableCell-body MuiTableCell-alignRight']/child::button"));
		a.moveToElement(dots).click().perform();
		
		Thread.sleep(3000);
		
		
		t.getEdit_btn().click();
		WebElement edit_tag_text= driver.findElement(By.xpath("//h6[normalize-space()='Edit Tag']"));
		
		assert edit_tag_text.isDisplayed();
		t.getTag_name_textbox().clear();
		t.getSlug_textbox().clear();
		t.getDisplayorder_textbox().clear();
		
		Thread.sleep(3000);
		
//		assert t.getTag_name_textbox().isSelected();
//		assert t.getDisplayorder_textbox().isSelected();
//		assert t.getSelect_active_drpdwn().isSelected();
//		assert t.getSelect_featured_drpdwn().isSelected();
//		assert t.getSelect_img_size_drpdwn().isSelected();
//		
		
		
		String data2=f.setExcelData("tag", 6, 2, "update tag name12");
		System.out.println(data2);
		String data3=f.getExcelData("tag", 6, 2);
	     t.getTag_name_textbox().sendKeys(data3);

		//String data4=f.setExcelData("tag", 6, 3, "Slug name5");
		double data5= f.setExcelData2("tag", 6, 4, 4);
		
		//String data6= f.getExcelData("tag", 6, 3);
		double data7=f.getExcelData2("tag", 6, 4);
		
		//t.getSlug_textbox().sendKeys(data6);
		String t2= Double.toString(data7);
		t.getDisplayorder_textbox().sendKeys(t2);
		
		//t.getSlug_textbox().sendKeys(data6);
		
		Thread.sleep(4000);
		t.getImage_upload_btn().click();
		
		Thread.sleep(3000);
		
		fileupload f1=new fileupload();
		f1.uploadfile();
		
		WebElement cropt_withot_selection= driver.findElement(By.xpath("//span[normalize-space()='Select without crop']"));
		
		Thread.sleep(2000);
		cropt_withot_selection.click();
		Select s= new Select(t.getSelect_active_drpdwn());
		s.selectByIndex(1);
		
		Select s1= new Select(t.getSelect_featured_drpdwn());
		s1.selectByIndex(1);
		
		Select s2= new Select(t.getSelect_img_size_drpdwn());
		s2.selectByIndex(1);
	
	
	t.getUpdate_btn().click();
		Thread.sleep(3000);
		
		t.getSuccess_ok_btn().click();
		//System.out.println(drpactive);
	
		
		List <WebElement> list= driver.findElements(By.xpath("//td[@class='MuiTableCell-root MuiTableCell-body'][2] "));
		System.out.println(list.size());
		for(int i=0;i<list.size();i++)
	{
			System.out.println("testing");
			String text = list.get(i).getText();
			System.out.println(text);
			if(text.equals(data1))
			{
				System.out.println("Tag with name "+data1+ " updated successfully");
			}
	}
	}
		
	

	
	@Test(priority = 3)
	public void tagtestcase03() throws EncryptedDocumentException, IOException, InterruptedException
	{
		tags t= new tags(driver);
		FileLib f= new FileLib();
		String data1= f.getExcelData("tag", 6, 2);
		Actions a=new Actions(driver);
		List <WebElement> list= driver.findElements(By.xpath("//td[@class='MuiTableCell-root MuiTableCell-body'][2] "));
		System.out.println(list.size());
		for(int i=0;i<list.size();i++)
	{
			System.out.println("testing");
			String text = list.get(i).getText();
			System.out.println(text);
			if(text.equals(data1))
			{
				System.out.println("Tag with name "+data1+ " updated successfully");
			}
		}
		Thread.sleep(2000);
		WebElement dots= driver.findElement(By.xpath("//*[text()='"+data1+"']/../*[@class='MuiTableCell-root MuiTableCell-body MuiTableCell-alignRight']/child::button"));
		a.moveToElement(dots).click().perform();
		
		t.getDelete_btn().click();
			Thread.sleep(3000);
			
			t.getYes_delete_btn().click();
			Thread.sleep(2000);
			t.getDelete_ok_btn().click();
			List <WebElement> list1= driver.findElements(By.xpath("//td[@class='MuiTableCell-root MuiTableCell-body'][2] "));
			System.out.println("  ");
			System.out.println(list.size());
			for(int i=0;i<list1.size();i++)
			{
			String text1 = list1.get(i).getText();
				
			if(text1.equals(data1))
				{
					System.out.println("Tag with name "+data1+ " is not deleted from the list");
				}
				else
				{
					System.out.println("Tag with name "+data1+" deleted from the list");
				}
			}
	}
	
	}