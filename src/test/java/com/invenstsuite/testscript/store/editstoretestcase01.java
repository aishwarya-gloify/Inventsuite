package com.invenstsuite.testscript.store;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.inventsuite.generics.storebaseclass;
import com.inventsuite.pom.Store;

public class editstoretestcase01 extends storebaseclass{
	
	@Test
	public void esittestcase01() throws InterruptedException
	{
		
		Store s= new Store(driver);
		
		//Clicking on edit button
		
		WebElement name_store= driver.findElement(By.xpath("//span[.='Aishwarya1']"));
		Actions act= new Actions(driver);
		act.moveToElement(name_store).perform();
		Thread.sleep(4000);
		act.moveToElement(driver.findElement(By.xpath("//span[text()='Aishwarya1']/../../*[name()='svg' and @focusable='false']"))).click().perform();
        Thread.sleep(4000);
       // String cmpName = s.getCmpname().getText();
       //System.out.println(cmpName);
      // Assert.assertEquals(s.getCmpname().getText(), "Aishwarya1");
       // act.moveToElement(s.getCmpname()).click().perform();
       // System.out.println(s.getCmpname().getText());
        /*String cmp=s.getCmpname().getAttribute("value");
        System.out.println(cmp);
        */
        Assert.assertEquals(s.getCmpname().getAttribute("value"), "Aishwarya1");
        Assert.assertEquals(s.getDomainname().getAttribute("value"), "Interior");
        
        
	}

}
