package com.inventsuite.testscript.dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.inventsuite.generics.profilepage;
import com.inventsuite.pom.Store;
import com.inventsuite.pom.profile;
@Listeners(com.inventsuite.generics.Listenerprofile.class)
public class dashboardtestcase04 extends profilepage{
	
	@Test
	public void dashboardtestcase04() throws InterruptedException
	{
		Store s= new Store(driver);
        Actions a=new Actions(driver);



     profile p= new profile(driver);
// WebElement list= driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[1]"));
//   Thread.sleep(10000);
//    a.moveToElement(list).click().perform();
     a.moveToElement(s.getStore_name()).click().perform();
        Thread.sleep(5000);
    Thread.sleep(3000);

//clicking on edit button
//  WebElement edit=driver.findElement(By.xpath("(//div[@class='MuiBox-root jss171 jss32'])[1]"));
//  a.moveToElement(edit).click().perform();
    a.moveToElement(s.getStore_editicon()).click().perform();
    Thread.sleep(4000);
    
    s.getDomainname().sendKeys(Keys.CONTROL+"a");
    s.getDomainname().sendKeys(Keys.DELETE);
    
    Thread.sleep(3000);
    a.moveToElement(s.getUpdate_btn()).click().perform();
    Thread.sleep(3000);
    
   assert s.getDomainvalidation().isDisplayed();
    
	}

}
