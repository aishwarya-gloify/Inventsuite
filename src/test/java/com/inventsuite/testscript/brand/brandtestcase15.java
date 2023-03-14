package com.inventsuite.testscript.brand;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inventsuite.generics.FileLib;
import com.inventsuite.generics.brandbaseclass;
import com.inventsuite.pom.brand;
import com.inventsuite.pom.fileupload;

public class brandtestcase15 extends brandbaseclass{
	
	@Test
	public void brandtestcase15() throws InterruptedException, EncryptedDocumentException, IOException, AWTException
	{
		brand b= new brand(driver);
		Actions a= new Actions(driver);
		FileLib f= new FileLib();
		
		String data1= f.getExcelData("brand", 3, 2);
//		WebElement list= driver.findElement(By.xpath("//tr[@class='MuiTableRow-root MuiTableRow-hover'][1]"));
//		a.moveToElement(list).perform();
//		
//		WebElement dots= list.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text'][1]"));
//		
//		a.moveToElement(dots).click().perform();
		
		Thread.sleep(3000);
		// dynamic xpath= "//*[text()='test123']/../*[@class='MuiTableCell-root MuiTableCell-body MuiTableCell-alignRight']/child::button"
		
		WebElement dots= driver.findElement(By.xpath("//*[text()='"+data1+"']/../*[@class='MuiTableCell-root MuiTableCell-body MuiTableCell-alignRight']/child::button"));
		
		
		
		a.moveToElement(dots).perform();
		a.moveToElement(dots).click().perform();
		Thread.sleep(2000);
		
		a.moveToElement(b.getEdit_btn()).click().perform();
		Thread.sleep(2000);
		
		//Assert.assertEquals(driver.getCurrentUrl(), "")
		
		
		
		b.getBrandname_textbox().sendKeys(Keys.CONTROL+"a");
		b.getBrandname_textbox().sendKeys(Keys.DELETE);
		
		b.getEdit_brand_text().click();
		Thread.sleep(4000);
		a.moveToElement(b.getImage_upload()).perform();
		a.moveToElement(b.getImage_upload()).click().perform();
		
		System.out.println("test");
		Thread.sleep(3000);
		fileupload file=new fileupload();
		file.uploadfile();	
		
		Thread.sleep(2000);
		
		WebElement crop= driver.findElement(By.xpath("//span[normalize-space()='Select without crop']"));
		crop.click();
		Thread.sleep(3000);
		
		b.getUpdate_btn().click();
		
		Thread.sleep(2000);
		
		Assert.assertEquals(b.getBrand_name_validation().getText(), "Name Cannot be empty");
	}

}
