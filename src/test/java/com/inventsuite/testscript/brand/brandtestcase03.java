package com.inventsuite.testscript.brand;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inventsuite.generics.brandbaseclass;
import com.inventsuite.pom.brand;

public class brandtestcase03 extends brandbaseclass{
	
	@Test
	public void brandtestcase03() throws InterruptedException
	{
		brand b= new brand(driver);
		
		b.getAdd_brand_btn().click();
		Thread.sleep(3000);
		
		String current_url= driver.getCurrentUrl();
		String expected_url= "https://admin.gloify.co/add-Brand";
		Assert.assertEquals(current_url, expected_url);
		
		Assert.assertEquals(b.getCreate_brand_text().getText(), "Create Brand");
		
		assert b.getBranddetaild_text().isDisplayed();
		assert b.getBrandname_textbox().isDisplayed();
		assert b.getDescription_textbox().isDisplayed();
		assert b.getImage_upload().isDisplayed();
		assert b.getCreate_brand_btn().isDisplayed();
		
	}

}
