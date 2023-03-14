package com.invenstsuite.testscript.store;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inventsuite.generics.storebaseclass;
import com.inventsuite.pom.Store;

public class editstoretestcase02 extends storebaseclass{
	
	@Test
	
	public void edittestcase02() throws InterruptedException
	{
		
		Store s= new Store(driver);
		
		WebElement name_store= driver.findElement(By.xpath("//span[.='Aishwarya1']"));
		Actions act= new Actions(driver);
		act.moveToElement(name_store).perform();
		Thread.sleep(4000);
		act.moveToElement(driver.findElement(By.xpath("//span[text()='Aishwarya1']/../../*[name()='svg' and @focusable='false']"))).click().perform();
        Thread.sleep(4000);
        
        
        //clearing the company name
        s.getCmpname().clear();
        Thread.sleep(2000);
        
        //clicking on update button
        
        s.getUpdate_btn().click();
        Thread.sleep(2000);
        
        Assert.assertEquals(s.getCompanynamevalidation().getText(), "Name Cannot be empty");
		
	}

}
