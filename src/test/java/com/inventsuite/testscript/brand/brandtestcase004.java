package com.inventsuite.testscript.brand;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inventsuite.generics.brandbaseclass;
import com.inventsuite.pom.brand;

public class brandtestcase004 extends brandbaseclass{
	@Test
	public void brandtestcase04() throws InterruptedException
	{
		brand b= new brand(driver);
		b.getAdd_brand_btn().click();
		Thread.sleep(4000);
		b.getCreate_brand_btn().click();
		Thread.sleep(4000);
		
		assert b.getBrand_name_validation().isDisplayed();
		
		Assert.assertEquals(b.getBrand_name_validation().getText(), "Name Cannot be empty");
	}

}
