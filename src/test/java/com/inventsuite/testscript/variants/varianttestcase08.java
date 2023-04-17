package com.inventsuite.testscript.variants;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inventsuite.generics.FileLib;
import com.inventsuite.generics.baseclass2;
import com.inventsuite.pom.fileupload;
import com.inventsuite.pom.variants;

public class varianttestcase08 extends baseclass2 {
	
//	@Test(priority = 0)
//	public void varianttestcase0801() throws EncryptedDocumentException, IOException, InterruptedException, AWTException 
//	{
//		
//		variants v= new variants(driver);
//		validlogindata();
//		storeclick();
//		clickonvariant();
//		Thread.sleep(3000);
//		v.getAdd_variant_btn().click();
//		
//		//v.getUpload_image().click();
//		fileupload upload= new fileupload();
//		v.getUpload_image().click();
//		upload.uploadvalidimage();
//		
//		Thread.sleep(2000);
//		FileLib f= new FileLib();
//		String data1= f.getExcelData("variants", 4, 2);
//			
//			v.getVariant_name_textbox().sendKeys(data1);
//			
//			v.getCreate_variant_btn().click();
//			v.getVariant_created_ok_btn().click();
//			Thread.sleep(2000);
//			clickonvariant();
//			List<WebElement> list= driver.findElements(By.xpath("//td[@class='MuiTableCell-root MuiTableCell-body'][2]"));
//			
//			for(int i=0;i<list.size();i++)
//			{
//				String text = list.get(i).getText();
//				System.out.println(text);
//				if(text.equals(data1))
//				{
//					System.out.println(data1 +" is listed in the variant listing page");
//					//a[normalize-space()='testvariant']
//					driver.findElement(By.xpath("//a[normalize-space()='"+data1+"']")).click();
//					Thread.sleep(3000);
//					break;
//				}
//				
//			}
//			
//			
//			assert v.getVariant_option_txt().isDisplayed();
//			assert v.getAdd_variant_optn_btn().isDisplayed();
//			assert v.getNodata_txt().isDisplayed();
//			
//			v.getAdd_variant_option_btn().click();
//			
//			Assert.assertEquals(v.getCreate_variant_optn_txt().getText(), "Create Variant Option");
//			
//			assert v.getSub_variant_textbox().isDisplayed();
//			assert v.getUnit_textbox().isDisplayed();
//			
//		Assert.assertEquals(v.getSub_variant_textbox().getText(), "");
//		Assert.assertEquals(v.getUnit_textbox().getText(), "");
//		//System.out.println("assertion passed");
//		
//		v.getCreate_variant_optn_btn().click();
//		
//		Assert.assertEquals(v.getSub_variant_textbox_validation().getText(), "Value Cannot be empty");
//		Assert.assertEquals(v.getUnit_textbox_validation().getText(), "Unit Cannot be empty");
//		
////		
//		
//		v.getVariant_optn_close_icon().click();
//		
//		
//	}
//	
//	@Test(priority = 1)
//	public void varianttestcase0802() throws EncryptedDocumentException, IOException, InterruptedException
//	{
//		variants v= new variants(driver);
//		validlogindata();
//		storeclick();
//		clickonvariant();
//		FileLib f= new FileLib();
//		String data1= f.getExcelData("variants", 4, 2);
//		List<WebElement> list= driver.findElements(By.xpath("//td[@class='MuiTableCell-root MuiTableCell-body'][2]"));
//		
//		for(int i=0;i<list.size();i++)
//		{
//			String text = list.get(i).getText();
//			System.out.println(text);
//			if(text.equals(data1))
//			{
//				System.out.println(data1 +" is listed in the variant listing page");
//				//a[normalize-space()='testvariant']
//				driver.findElement(By.xpath("//a[normalize-space()='"+data1+"']")).click();
//				Thread.sleep(3000);
//				break;
//			}
//			
//		}
//		
//		
//		assert v.getVariant_option_txt().isDisplayed();
//		assert v.getAdd_variant_optn_btn().isDisplayed();
//		assert v.getNodata_txt().isDisplayed();
//		
//		v.getAdd_variant_option_btn().click();
//		
//		String data2= f.getExcelData("variants", 2, 3);
//		
//		v.getSub_variant_textbox().sendKeys(data2);
//		v.getCreate_variant_optn_btn().click();
//		
//		Assert.assertEquals(v.getUnit_textbox_validation().getText(), "Unit Cannot be empty");
//		
//		v.getSub_variant_textbox().sendKeys(Keys.CONTROL+"a");
//		v.getUnit_textbox().sendKeys(Keys.DELETE);
//		
//		
//		String data3= f.getExcelData("variants", 3, 4);
//		v.getUnit_textbox().sendKeys(data3);
//		
//		v.getCreate_variant_optn_btn().click();
//		
//		Assert.assertEquals(v.getSub_variant_textbox_validation().getText(), "Value Cannot be empty");
//		
//		
//		v.getVariant_optn_close_icon().click();
//		
//	}

	@Test(priority = 2)
	public void varianttestcase0803() throws InterruptedException, EncryptedDocumentException, IOException
	{
		
		variants v= new variants(driver);
		validlogindata();
		storeclick();
		clickonvariant();
		FileLib f= new FileLib();
		String data1= f.getExcelData("variants", 4, 2);
		List<WebElement> list= driver.findElements(By.xpath("//td[@class='MuiTableCell-root MuiTableCell-body'][2]"));
		
		for(int i=0;i<list.size();i++)
		{
			String text = list.get(i).getText();
			System.out.println(text);
			if(text.equals(data1))
			{
				System.out.println(data1 +" is listed in the variant listing page");
				//a[normalize-space()='testvariant']
				driver.findElement(By.xpath("//a[normalize-space()='"+data1+"']")).click();
				Thread.sleep(3000);
				break;
			}
			
		}
		
		
		v.getAdd_variant_option_btn().click();
		
		String data2= f.getExcelData("variants", 2, 3);
		
		v.getSub_variant_textbox().sendKeys(data2);
		System.out.println(data2);
		v.getCreate_variant_optn_btn().click();
		System.out.println("test");
		
		// //div[@class='MuiDialogContent-root jss99']//div//div//div[2]//div//p
		System.out.println(v.getUnit_textbox_validation().getText());
		//System.out.println(v.getUnit_textbox_validation().getTagName());
//		Assert.assertEquals(v.getUnit_textbox_validation().getText(), "Unit Cannot be empty");
//		System.out.println("test2");
		
//		v.getSub_variant_textbox().sendKeys(Keys.CONTROL+"a");
//		v.getSub_variant_textbox().sendKeys(Keys.DELETE);
//	
//		//v.getSub_variant_textbox().clear();
//		
//		String data3= f.getExcelData("variants", 3, 4);
//		v.getUnit_textbox().sendKeys(data3);
//		
//		//v.getCreate_variant_optn_btn().click();
//		
//		Assert.assertEquals(v.getSub_variant_textbox_validation().getText(), "Value Cannot be empty");
		
		v.getVariant_optn_close_icon().click();
		
//		v.getAdd_variant_option_btn().click();
//		
//		Assert.assertEquals(v.getSub_variant_textbox().getText(), "");
	}
	
	
//	@Test(priority = 3)
//	public void varianttestcase0804() throws EncryptedDocumentException, IOException, InterruptedException
//	{
//		variants v= new variants(driver);
//		validlogindata();
//		storeclick();
//		clickonvariant();
//		FileLib f= new FileLib();
//		String data1= f.getExcelData("variants", 4, 2);
//		List<WebElement> list= driver.findElements(By.xpath("//td[@class='MuiTableCell-root MuiTableCell-body'][2]"));
//		
//		for(int i=0;i<list.size();i++)
//		{
//			String text = list.get(i).getText();
//			System.out.println(text);
//			if(text.equals(data1))
//			{
//				System.out.println(data1 +" is listed in the variant listing page");
//				
//				driver.findElement(By.xpath("//a[normalize-space()='"+data1+"']")).click();
//				Thread.sleep(3000);
//				break;
//			}
//			
//		}
//		
//		
//		assert v.getVariant_option_txt().isDisplayed();
//		assert v.getAdd_variant_optn_btn().isDisplayed();
//		assert v.getNodata_txt().isDisplayed();
//		
//		v.getAdd_variant_option_btn().click();
//		
//		
//		String data3= f.getExcelData("variants", 3, 4);
//		v.getUnit_textbox().sendKeys(data3);
//		
//	
//		
//		v.getVariant_optn_close_icon().click();
//		
//		v.getAdd_variant_option_btn().click();
//		
//		Assert.assertEquals(v.getUnit_textbox().getText(), "");
//	}
}
