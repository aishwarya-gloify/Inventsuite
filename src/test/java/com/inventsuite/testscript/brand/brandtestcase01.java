package com.inventsuite.testscript.brand;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inventsuite.generics.brandbaseclass;
import com.inventsuite.generics.product;
import com.inventsuite.pom.brand;

public class brandtestcase01 extends brandbaseclass{
	
	@Test
	public void brandtestcase01() throws InterruptedException
	{
		brand b= new brand(driver);
		Actions a= new Actions(driver);
		
		String current_url= driver.getCurrentUrl();
		System.out.println(current_url);
		String expected_url= "https://admin.gloify.co/brand-list";
		
		Assert.assertEquals(current_url, expected_url);
		
		assert b.getBrands_text().isDisplayed();
		Assert.assertEquals(b.getBrands_text().getText(), "Brands");
		assert b.getAdd_brand_btn().isDisplayed();
		assert b.getSearch_textbox().isDisplayed();
		assert b.getSearch_btn().isDisplayed();
//		Actions a= new Actions(driver);
//		a.moveToElement(b.getBrand_btn()).perform();
//		a.moveToElement(b.getBrand_btn()).doubleClick().perform();
//		Thread.sleep(4000);
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		String current_url= driver.getCurrentUrl();
//		String expected_url= "https://admin.gloify.co/brand-list";
//		
		
		
	}

}
