package com.inventsuite.testscript.tags;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inventsuite.generics.tagbaseclass;
import com.inventsuite.pom.tags;

public class tagstestcase01 extends tagbaseclass 
{
		
	
//	@Test(priority = 0)
	
//	public void tagtestcase01()
//	{
//		
//		tags t= new tags(driver);
//		String expected_url="https://admin.gloify.co/tag-list";
//		String current_url= driver.getCurrentUrl();
//		
//		Assert.assertEquals(current_url, expected_url);
//		
//	}
	
	@Test (priority=1)
	public void testcase02() throws InterruptedException 
	{
		tags t= new tags(driver);
		Actions a= new Actions(driver);
	     a.moveToElement(t.getSelect_status()).click().perform();
	     a.moveToElement(t.getSelect_status()).sendKeys("Inactive").perform();
		a.moveToElement(t.getSelect_status()).sendKeys(Keys.ENTER).perform();
		Thread.sleep(3000);
		
		List <WebElement> list= driver.findElements(By.xpath("//td[@class='MuiTableCell-root MuiTableCell-body'][2] "));
		System.out.println(list.size());
		for(int i=0;i<=list.size();i++)
		{
			System.out.println("testing");
			
			if(list.size()>0)
			{
				System.out.println("if condition");
			String text = list.get(i).getText();
			String status= driver.findElement(By.xpath("//td[@class='MuiTableCell-root MuiTableCell-body'][3] ")).getText();
			System.out.println(text +" " +status);
			Assert.assertEquals(status, "Active");
			}
			else
			{				
				System.out.println("No record found");
			}
		}
		
		
	
	}

}
