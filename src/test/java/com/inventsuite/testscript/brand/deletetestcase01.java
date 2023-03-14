package com.inventsuite.testscript.brand;

import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.inventsuite.generics.FileLib;
import com.inventsuite.generics.brandbaseclass;
import com.inventsuite.pom.brand;

public class deletetestcase01 extends brandbaseclass{
	@Test
	public void deletetestcase01() throws EncryptedDocumentException, IOException, InterruptedException
	{
		brand b= new brand(driver);
		Actions a= new Actions(driver);
		FileLib f= new FileLib();
		
		String data1= f.getExcelData("brand", 3, 2);

		
		WebElement dots= driver.findElement(By.xpath("//*[text()='"+data1+"']/../*[@class='MuiTableCell-root MuiTableCell-body MuiTableCell-alignRight']/child::button"));
		
		
		
		a.moveToElement(dots).perform();
		a.moveToElement(dots).click().perform();
		Thread.sleep(2000);
		
		a.moveToElement(b.getDelete_btn()).click().perform();
		Thread.sleep(2000);
		
		b.getDelete_cancel_btn().click();
		Thread.sleep(3000);
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
				System.out.println("Brand with name "+data1+" displayed in the list");
			}
	}

		
	}

}
