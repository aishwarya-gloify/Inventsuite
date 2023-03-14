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

public class brandtestcase10 extends brandbaseclass{
	
	@Test
	public void brandtestcase10() throws InterruptedException, EncryptedDocumentException, IOException
	{
		
		// Need to check whether created data is displayed in list , and need to fetch only brand column data
		brand b= new brand(driver);
		FileLib f= new FileLib();
		Actions a= new Actions(driver);
		b.getAdd_brand_btn().click();
		Thread.sleep(3000);
		
		String data1=f.getExcelData("brand", 2, 2);
		//String data2= f.getExcelData("brand", 1, 3);
		
		/*b.getBrandname_textbox().sendKeys(data1);
		Thread.sleep(3000);
		b.getCreate_brand_btn().click();
		Thread.sleep(3000);
		
		Assert.assertEquals(b.getBrand_created_success_msg().getText(), "Brand details created successfully");
		b.getBrand_created_success_ok_btn().click();
		*/
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
		
		
//		WebElement list= driver.findElement(By.xpath("//tbody[@class='MuiTableBody-root']"));
//		List <WebElement> alllist= list.findElements(By.tagName("tr"));
//		
//		for(int i=0;i<alllist.size();i++)
//		{
//			WebElement text= alllist.get(i);
//			System.out.println(text.getText());
//		}
		
		List<WebElement> list= driver.findElements(By.xpath("//td[@class='MuiTableCell-root MuiTableCell-body'][2]"));
		
		for(int i=0;i<list.size();i++)
		{
			WebElement text= list.get(i);
			System.out.println(text.getText());
			
		}
         for (WebElement option : list) {
			
			//String brandname= "brand2";
			
			if(option.getText().equals(data1))
			{
				System.out.println("Brand with name "+data1+" created and displayed in the list");
			}
	}

}
}
