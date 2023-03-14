package com.inventsuite.testscript.brand;

import java.io.IOException;
import java.util.List;

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

public class brandtestcase14 extends brandbaseclass{
	
	@Test
	public void brandtestcase14() throws InterruptedException, EncryptedDocumentException, IOException
	{
		// clicking on 3 dots, but need to write dynamic xpath
				brand b= new brand(driver);
				Actions a= new Actions(driver);
				FileLib f= new FileLib();
				
				String data1= f.getExcelData("brand", 3, 2);

				
				WebElement dots= driver.findElement(By.xpath("//*[text()='"+data1+"']/../*[@class='MuiTableCell-root MuiTableCell-body MuiTableCell-alignRight']/child::button"));
				
				
				
				a.moveToElement(dots).perform();
				a.moveToElement(dots).click().perform();
				Thread.sleep(2000);
				
				a.moveToElement(b.getEdit_btn()).click().perform();
				Thread.sleep(2000);
				
			
				
				
				
			b.getDescription_textbox().sendKeys(Keys.CONTROL+"a");
			b.getDescription_textbox().sendKeys(Keys.DELETE);
			
			Thread.sleep(2000);
			
			b.getUpdate_btn().click();
			Thread.sleep(3000);
			b.getBrand_created_success_ok_btn().click();
			
			Thread.sleep(4000);
//			WebElement product_btn= driver.findElement(By.xpath("//span[contains(text(),'Products')]"));
//			
//			//clicking on product
//			a.moveToElement(product_btn).click().perform();
//			
//			Thread.sleep(5000);
//			
//			WebElement list2= driver.findElement(By.xpath("//div[@class='MuiCollapse-root MuiCollapse-entered']"));
//			List<WebElement> listAll2 = list2.findElements(By.tagName("a"));
//			//System.out.println(listAll2.size());
//			for (int i = 0; i < listAll2.size(); i++) {
//				WebElement text = listAll2.get(i);
//				System.out.println(text.getText());
//				
//
//			}
//			
//			Thread.sleep(4000);
//			for (WebElement option : listAll2) {
//				
//				String name= "Brands";
//				
//				if(option.getText().equals(name))
//				{
//					//System.out.println("Located element and clicked");
//					a.moveToElement(option).perform();
//					Thread.sleep(8000);
//					a.moveToElement(option).click().perform();
//					Thread.sleep(3000);
//					break;
//				}
//			}
			
			WebElement dots1= driver.findElement(By.xpath("//*[text()='"+data1+"']/../*[@class='MuiTableCell-root MuiTableCell-body MuiTableCell-alignRight']/child::button"));
			
			
			
			a.moveToElement(dots1).perform();
			a.moveToElement(dots1).click().perform();
			Thread.sleep(2000);
			
			a.moveToElement(b.getEdit_btn()).click().perform();
			Thread.sleep(2000);
			
			
			List<WebElement> list= driver.findElements(By.xpath("//td[@class='MuiTableCell-root MuiTableCell-body'][2]"));
			
			for(int i=0;i<list.size();i++)
			{
				WebElement text= list.get(i);
				System.out.println(text.getText());
				
			}
	         for (WebElement option : list) {
				
				
				if(option.getText().equals(data1))
				{
					option.click();
				}
		}
		
	        Thread.sleep(3000);
	        
	        Assert.assertEquals(b.getDescription_textbox().getAttribute("value"), "");
	}

}
