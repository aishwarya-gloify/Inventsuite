package com.inventsuite.testscript.variants;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inventsuite.generics.baseclass;
import com.inventsuite.generics.baseclass2;

import com.inventsuite.pom.variants;

public class variantstestcase04 extends baseclass2{
	@Test
	public void variantstestcase04() throws InterruptedException, EncryptedDocumentException, IOException
	{
		variants v= new variants(driver);
		validlogindata();
		storeclick();
		clickonvariant();
		Thread.sleep(3000);
		v.getAdd_variant_btn().click();
		Thread.sleep(3000);
		
		v.getCreate_variant_btn().click();
		
		Thread.sleep(3000);
		Assert.assertEquals(v.getVariant_name_validation().getText(), "Name Cannot be empty");
		
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		Select s= new Select(v.getMedia_type());
		s.selectByVisibleText("Need Media");
		
		Thread.sleep(3000);
		
        v.getCreate_variant_btn().click();
		assert driver.findElement(By.xpath("//p[normalize-space()='Variant Images']")).isDisplayed();
		Thread.sleep(3000);
		Assert.assertEquals(v.getVariant_name_validation().getText(), "Name Cannot be empty");
	}

}
