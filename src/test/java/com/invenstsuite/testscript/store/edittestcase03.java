package com.invenstsuite.testscript.store;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inventsuite.generics.storebaseclass;
import com.inventsuite.pom.Store;

public class edittestcase03 extends storebaseclass{
	
	@Test
	public void edittestcase03() throws InterruptedException
	{
		//checking by clearing domain data
		
Store s= new Store(driver);
		
		WebElement name_store= driver.findElement(By.xpath("//span[.='Aishwarya1']"));
		Actions act= new Actions(driver);
		act.moveToElement(name_store).perform();
		Thread.sleep(4000);
		act.moveToElement(driver.findElement(By.xpath("//span[text()='Aishwarya1']/../../*[name()='svg' and @focusable='false']"))).click().perform();
        Thread.sleep(4000);
        
        s.getDomainname().clear();
        
        Thread.sleep(2000);
        s.getUpdate_btn().click();
        
        assert s.getDomainvalidation().isDisplayed();
        
	}

}
