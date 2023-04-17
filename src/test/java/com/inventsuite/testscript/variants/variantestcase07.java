package com.inventsuite.testscript.variants;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inventsuite.generics.FileLib;
import com.inventsuite.generics.baseclass2;
import com.inventsuite.pom.fileupload;
import com.inventsuite.pom.variants;

public class variantestcase07 extends baseclass2{
	
	@Test (priority = 0)
	public void varianttestcase07() throws EncryptedDocumentException, IOException, InterruptedException, AWTException
	{
		variants v= new variants(driver);
		validlogindata();
		storeclick();
		clickonvariant();
		Thread.sleep(3000);
		v.getAdd_variant_btn().click();
		
		v.getUpload_image().click();
		fileupload upload= new fileupload();
		
		upload.uploadfile6mb();
		
		//Assert.assertEquals(v.getMax_image_limit().getText(), "* 6mb.jpg file size is too big");		
		assert v.getMax_image_limit().getText().contains(".jpg file size is too big");
		Thread.sleep(3000);
		v.getUpload_image().click();
		upload.uploadvalidimage();
		
		Thread.sleep(2000);
		assert driver.findElement(By.xpath("//img[@alt='preview']")).isDisplayed();
		
		// clicking on closeicon of image
		
		driver.findElement(By.xpath("//img[@alt='closeIcon']")).click();
		
		WebElement image_not_available= driver.findElement(By.xpath("//p[normalize-space()='Image Not Available']"));
		image_not_available.isDisplayed();
		assert image_not_available.getText().equals("Image Not Available");
		
	}
	
	@Test (priority = 1)
	public void varianttestcase0701() throws EncryptedDocumentException, IOException, InterruptedException, AWTException
	{
		variants v= new variants(driver);
		validlogindata();
		storeclick();
		clickonvariant();
		Thread.sleep(3000);
		v.getAdd_variant_btn().click();
		
		//v.getUpload_image().click();
		fileupload upload= new fileupload();
		v.getUpload_image().click();
		upload.uploadvalidimage();
		
		Thread.sleep(2000);
		assert driver.findElement(By.xpath("//img[@alt='preview']")).isDisplayed();
		FileLib f= new FileLib();
		String data1= f.getExcelData("variants", 3, 2);
			
			v.getVariant_name_textbox().sendKeys(data1);
			
			v.getCreate_variant_btn().click();
			v.getVariant_created_ok_btn().click();
			Thread.sleep(2000);
			clickonvariant();
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
			
			//assert driver.findElement(By.xpath("//img[@alt='variant image']")).isDisplayed();
			//assert v.getVariantdetails_imgpresent().isDisplayed();
			
			WebElement editicon= driver.findElement(By.xpath("//a[@class='linkButton float-right']"));
			editicon.isDisplayed();
			editicon.click();
//			v.getVariant_details_edit_btn().isDisplayed();
//			v.getVariant_details_edit_btn().click();
			Thread.sleep(2000);
			
			assert v.getEdit_variant_text().isDisplayed();
			//Assert.assertEquals(v.getMedia_type().getText(), "Need Media");
			assert v.getMedia_type().getText().contains("Need Media");
			
			clickonvariant();
			Thread.sleep(3000);
			
		
		WebElement dots=driver.findElement(By.xpath("//*[text()='"+data1+"']/../../*[@class='MuiTableCell-root MuiTableCell-body MuiTableCell-alignRight']/child::button"));
		dots.click();
		
		
		Thread.sleep(2000);
		v.getDelete_btn().click();
		v.getYes_delete_it_btn().click();
		v.getDelete_ok_btn().click();
			
			
	}
	
	
	@Test (priority = 2)
	public void varianttestcase0702() throws EncryptedDocumentException, IOException, InterruptedException, AWTException
	{
		variants v= new variants(driver);
		validlogindata();
		storeclick();
		clickonvariant();
		Thread.sleep(3000);
		v.getAdd_variant_btn().click();
		
		//v.getUpload_image().click();
		fileupload upload= new fileupload();
		v.getUpload_image().click();
		upload.uploadvalidimage();
		
		Thread.sleep(2000);
		assert driver.findElement(By.xpath("//img[@alt='preview']")).isDisplayed();
		FileLib f= new FileLib();
		String data1= f.getExcelData("variants", 3, 2);
			
			v.getVariant_name_textbox().sendKeys(data1);
			
			v.getCreate_variant_btn().click();
			v.getVariant_created_ok_btn().click();
			Thread.sleep(2000);
			clickonvariant();
			
			WebElement dots1=driver.findElement(By.xpath("//*[text()='"+data1+"']/../../*[@class='MuiTableCell-root MuiTableCell-body MuiTableCell-alignRight']/child::button"));
			dots1.click();
			Thread.sleep(2000);
		v.getEdit_btn().click();
		assert v.getEdit_variant_text().isDisplayed();
		
		System.out.println(v.getVariant_name_textbox().getAttribute("value"));
		
		
		v.getVariant_name_textbox().sendKeys(Keys.CONTROL+"a");
		v.getVariant_name_textbox().sendKeys(Keys.DELETE);
		
		Thread.sleep(2000);
		v.getVariant_update_btn().click();
		
		Assert.assertEquals(v.getVariant_name_validation().getText(), "Name Cannot be empty");
		
		String updateedname= "testvariant05";
		v.getVariant_name_textbox().sendKeys(updateedname);
		v.getVariant_update_btn().click();
		v.getVariant_created_ok_btn().click();
		
		clickonvariant();
		
		List<WebElement> list= driver.findElements(By.xpath("//td[@class='MuiTableCell-root MuiTableCell-body'][2]"));
		
		for(int i=0;i<list.size();i++)
		{
			String text = list.get(i).getText();
			System.out.println(text);
			if(text.equals(updateedname))
			{
				System.out.println(updateedname +" variant name is update successfully");
				
				
			}
			
		}
		WebElement dots=driver.findElement(By.xpath("//*[text()='"+updateedname+"']/../../*[@class='MuiTableCell-root MuiTableCell-body MuiTableCell-alignRight']/child::button"));
		dots.click();
		
		
		Thread.sleep(2000);
		v.getDelete_btn().click();
		v.getYes_delete_it_btn().click();
		v.getDelete_ok_btn().click();
			
	}
	
	
	@Test(priority = 3)
	public void varianttestcase0703() throws EncryptedDocumentException, IOException, InterruptedException, AWTException
	{
		

		variants v= new variants(driver);
		validlogindata();
		storeclick();
		clickonvariant();
		Thread.sleep(3000);
		v.getAdd_variant_btn().click();
		
		//v.getUpload_image().click();
		fileupload upload= new fileupload();
		v.getUpload_image().click();
		upload.uploadvalidimage();
		
		Thread.sleep(2000);
		assert driver.findElement(By.xpath("//img[@alt='preview']")).isDisplayed();
		FileLib f= new FileLib();
		String data1= f.getExcelData("variants", 3, 2);
			
			v.getVariant_name_textbox().sendKeys(data1);
			
			v.getCreate_variant_btn().click();
			v.getVariant_created_ok_btn().click();
			Thread.sleep(2000);
			clickonvariant();

			WebElement dots1=driver.findElement(By.xpath("//*[text()='"+data1+"']/../../*[@class='MuiTableCell-root MuiTableCell-body MuiTableCell-alignRight']/child::button"));
			dots1.click();
			Thread.sleep(2000);
		v.getEdit_btn().click();
		
		
		//assert v.getMedia_type().getText().contains("")
		
		Select s= new Select(v.getMedia_type());
		s.selectByVisibleText("Media not required");
		Thread.sleep(2000);
		v.getVariant_update_btn().click();
		v.getVariant_created_ok_btn().click();
		
		
		WebElement dots2=driver.findElement(By.xpath("//*[text()='"+data1+"']/../../*[@class='MuiTableCell-root MuiTableCell-body MuiTableCell-alignRight']/child::button"));
		dots2.click();
		Thread.sleep(2000);
	v.getEdit_btn().click();
	
	Assert.assertEquals(v.getMedia_type().getAttribute("value"), "false");
	
	}
	
	@Test(priority = 4)
	public void voidvarianttestcase0704() throws EncryptedDocumentException, IOException, InterruptedException, AWTException
	{
		variants v= new variants(driver);
		validlogindata();
		storeclick();
		clickonvariant();
		Thread.sleep(3000);
		v.getAdd_variant_btn().click();
	

		FileLib f= new FileLib();
		String data1= f.getExcelData("variants", 3, 2);
			
			v.getVariant_name_textbox().sendKeys(data1);
			
			v.getCreate_variant_btn().click();
			
		Assert.assertEquals(v.getVariantname_exit_validation().getText(), "Vairant name exists for the company");
		v.getVariant_exists_ok_btn().click();
		
		clickonvariant();
		Thread.sleep(3000);
		
	
	WebElement dots=driver.findElement(By.xpath("//*[text()='"+data1+"']/../../*[@class='MuiTableCell-root MuiTableCell-body MuiTableCell-alignRight']/child::button"));
	dots.click();
	
	
	Thread.sleep(2000);
	v.getDelete_btn().click();
	v.getYes_delete_it_btn().click();
	v.getDelete_ok_btn().click();
	}
// need to handle the above scenario in edit page
	
	
}
