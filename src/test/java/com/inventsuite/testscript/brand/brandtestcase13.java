package com.inventsuite.testscript.brand;

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

public class brandtestcase13 extends brandbaseclass{
	@Test
	public void brandtestcase13() throws InterruptedException, EncryptedDocumentException, IOException
	{
		// clicking on 3 dots, but need to write dynamic xpath
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
		
		assert b.getEdit_brand_text().isDisplayed();
		
		System.out.println(b.getBrandname_textbox().getAttribute("value"));
		System.out.println(b.getDescription_textbox().getAttribute("value"));
		
		b.getBrandname_textbox().sendKeys(Keys.CONTROL+"a");
		b.getBrandname_textbox().sendKeys(Keys.DELETE);
		
		Thread.sleep(4000);
		
		b.getUpdate_btn().click();
		
		Thread.sleep(2000);
		
		Assert.assertEquals(b.getBrand_name_validation(), "Name Cannot be empty");
	}

}
