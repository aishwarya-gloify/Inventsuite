package com.inventsuite.testscript.tags;

import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inventsuite.generics.FileLib;
import com.inventsuite.generics.tagbaseclass;
import com.inventsuite.pom.tags;

public class tagtestcase09 extends tagbaseclass{
	@Test(priority = 1)
	public void tagtestcase0901() throws InterruptedException, EncryptedDocumentException, IOException
	{
		
		Actions a= new Actions(driver);
		tags t= new tags(driver);
		FileLib f= new FileLib();
				
		t.getAdd_tag_btn().click();
		
		String data1= f.getExcelData("tag", 7, 2);
		double data3=f.getExcelData2("tag", 7, 4);
		String data2=f.getExcelData("tag", 7, 3);
		
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
	public void tagtestcase0902() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Actions a= new Actions(driver);
		tags t= new tags(driver);
		FileLib f= new FileLib();
		
		
		t.getAdd_tag_btn().click();
		
		String data1= f.getExcelData("tag", 7, 2);
		double data3=f.getExcelData2("tag", 7, 4);
		String data2=f.getExcelData("tag", 7, 3);
		
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
		
		
		
		String drpactive= t.getSelect_active_drpdwn().getAttribute("value");
		System.out.println(drpactive);
		String drpfeatured=t.getSelect_featured_drpdwn().getAttribute("value");
		System.out.println(drpfeatured);
		String drpimg=t.getSelect_img_size_drpdwn().getAttribute("value");
		System.out.println(drpimg);
		
		Thread.sleep(2000);
		
		Thread.sleep(3000);
		
		t.getCreate_tag_btn().click();
	  
	  Thread.sleep(4000);
	  
	  String errormsg= driver.findElement(By.xpath("//div[@id='swal2-content']")).getText();
	  
	 // Assert.assertEquals(errormsg, "Tag name exists for the company");
	  
	  WebElement ok_btn= driver.findElement(By.xpath("//button[normalize-space()='OK']"));
	  ok_btn.click();
	}
	
	@Test(priority=3)
	public void tagtestcase0903() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Actions a= new Actions(driver);
		tags t= new tags(driver);
		FileLib f= new FileLib();
		String data1= f.getExcelData("tag", 7, 2);
		Thread.sleep(2000);
		WebElement dots= driver.findElement(By.xpath("//*[text()='"+data1+"']/../*[@class='MuiTableCell-root MuiTableCell-body MuiTableCell-alignRight']/child::button"));
		a.moveToElement(dots).click().perform();
		
		a.moveToElement(t.getEdit_btn()).click().perform();
	
		t.getTag_name_textbox().clear();
		String data2= f.getExcelData("tag", 6, 2);
		t.getTag_name_textbox().sendKeys(data2);
		
		
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
	  
	
	  Thread.sleep(4000);
	  
	//  String errormsg= driver.findElement(By.xpath("//div[@id='swal2-content']")).getText();
	  
	 // Assert.assertEquals(errormsg, "Tag name exists for the company");
	  
	  WebElement ok_btn= driver.findElement(By.xpath("//button[normalize-space()='OK']"));
	  ok_btn.click();
	}
	
	@Test(priority = 4)
	public void tagtestcase0904() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Actions a= new Actions(driver);
		tags t= new tags(driver);
		FileLib f= new FileLib();
		String data1= f.getExcelData("tag", 7, 2);
		Thread.sleep(2000);
		WebElement dots= driver.findElement(By.xpath("//*[text()='"+data1+"']/../*[@class='MuiTableCell-root MuiTableCell-body MuiTableCell-alignRight']/child::button"));
		a.moveToElement(dots).click().perform();
		
		a.moveToElement(t.getEdit_btn()).click().perform();
	
		t.getTag_name_textbox().clear();
		String data2= f.getExcelData("tag", 6, 2);
		t.getTag_name_textbox().sendKeys(data2);
		
		double data3=f.getExcelData2("tag", 6, 4);
		String t2= Double.toString(data3);
		t.getDisplayorder_textbox().sendKeys(t2);
		
		Thread.sleep(3000);
		Select s= new Select(t.getSelect_active_drpdwn());
		s.selectByIndex(2);
		
		Select s1= new Select(t.getSelect_featured_drpdwn());
		s1.selectByIndex(2);
		
		Select s2= new Select(t.getSelect_img_size_drpdwn());
		s2.selectByIndex(2);
		
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
	  
	
	  Thread.sleep(4000);
	  
	//  String errormsg= driver.findElement(By.xpath("//div[@id='swal2-content']")).getText();
	  
	 // Assert.assertEquals(errormsg, "Tag name exists for the company");
	  
	  WebElement ok_btn= driver.findElement(By.xpath("//button[normalize-space()='OK']"));
	  ok_btn.click();
	}

}
