package com.inventsuite.testscript.brand;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inventsuite.generics.FileLib;
import com.inventsuite.generics.brandbaseclass;
import com.inventsuite.pom.brand;
import com.inventsuite.pom.fileupload;

public class brandtestcase05 extends brandbaseclass{
	@Test
	public void brandtestcase05() throws InterruptedException, EncryptedDocumentException, IOException, AWTException
	{
		brand b= new brand(driver);
		FileLib f= new FileLib();
		
		b.getAdd_brand_btn().click();
		Thread.sleep(3000);
		
		String data2= f.getExcelData("brand", 1, 3);
		
		b.getDescription_textbox().sendKeys(data2);
		
		Thread.sleep(3000);
		b.getCreate_brand_btn().click();
		Thread.sleep(3000);
		Assert.assertEquals(b.getBrand_name_validation().getText(), "Name Cannot be empty");
		
		driver.navigate().refresh();
		Thread.sleep(5000);
		
		b.getDescription_textbox().sendKeys(data2);
		
		fileupload file= new fileupload();
		
		b.getImage_upload().click();
		file.uploadfile();
		Thread.sleep(4000);
		
		WebElement crop= driver.findElement(By.xpath("//span[normalize-space()='Select without crop']"));
		crop.click();
		Thread.sleep(2000);
		b.getCreate_brand_btn().click();
		Thread.sleep(3000);
		Assert.assertEquals(b.getBrand_name_validation().getText(), "Name Cannot be empty");
		
	}

}
