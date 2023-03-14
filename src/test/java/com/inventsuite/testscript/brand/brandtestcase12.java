package com.inventsuite.testscript.brand;

import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inventsuite.generics.FileLib;
import com.inventsuite.generics.brandbaseclass;
import com.inventsuite.pom.brand;

public class brandtestcase12 extends brandbaseclass{
	@Test
	public void brandtestcase12() throws InterruptedException, EncryptedDocumentException, IOException
	{
		brand b= new brand(driver);
		FileLib f= new FileLib();
		Actions a= new Actions(driver);
		
		b.getAdd_brand_btn().click();
		Thread.sleep(3000);
		String data1=f.getExcelData("brand", 3, 2);
		String data2= f.getExcelData("brand", 3, 3);
		
		b.getBrandname_textbox().sendKeys(data1);
		b.getDescription_textbox().sendKeys(data2);
		
		Thread.sleep(3000);
		b.getCreate_brand_btn().click();
		Thread.sleep(3000);
		
		Assert.assertEquals(b.getBrand_exist_validation().getText(), "Product Brand exists for the company");
		b.getBrand_created_success_ok_btn();
		
		Thread.sleep(4000);
		WebElement product_btn= driver.findElement(By.xpath("//span[contains(text(),'Products')]"));
		
		//clicking on product
		a.moveToElement(product_btn).perform();
		a.moveToElement(product_btn).click().perform();
		
		Thread.sleep(5000);
		
		WebElement list2= driver.findElement(By.xpath("//div[@class='MuiCollapse-root MuiCollapse-entered']"));
		List<WebElement> listAll2 = list2.findElements(By.tagName("a"));
		//System.out.println(listAll2.size());
		for (int i = 0; i < listAll2.size(); i++) {
			WebElement text = listAll2.get(i);
			System.out.println(text.getText());
			

		}
		
		Thread.sleep(4000);
		for (WebElement option : listAll2) {
			
			String name= "Brands";
			
			if(option.getText().equals(name))
			{
				//System.out.println("Located element and clicked");
				a.moveToElement(option).perform();
				Thread.sleep(8000);
				a.moveToElement(option).click().perform();
				Thread.sleep(3000);
				break;
			}
		}
		
    List<WebElement> list= driver.findElements(By.xpath("//td[@class='MuiTableCell-root MuiTableCell-body'][2]"));
		
		for(int i=0;i<list.size();i++)
		{
			WebElement text= list.get(i);
			System.out.println(text.getText());
			
		}
         for (WebElement option : list) {
			
        	 System.out.println("inside for loop");
			
			
			if(option.getText().equals(data1))
			{
				System.out.println("Brand with name "+data1+" already exist and displayed in brand list");
			}
	}
//		List<WebElement> list= driver.findElements(By.xpath("//td[@class='MuiTableCell-root MuiTableCell-body'][2]"));
//		
//		for(int i=0;i<list.size();i++)
//		{
//			WebElement text= list.get(i);
//			System.out.println(text.getText());
//			
//		}
		
	}

}
