package com.inventsuite.testscript.dashboard;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.inventsuite.generics.profilepage;
import com.inventsuite.pom.Store;
import com.inventsuite.pom.profile;
@Listeners(com.inventsuite.generics.Listenerprofile.class)
public class dashboardtestcase02 extends profilepage{
	
	@Test
	public void dashboardtestcase02() throws InterruptedException
	{
                     Store s= new Store(driver);
                   Actions a=new Actions(driver);
		


                profile p= new profile(driver);
            WebElement list= driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[1]"));
	          Thread.sleep(10000);
	           a.moveToElement(list).click().perform();
	               Thread.sleep(5000);
               Thread.sleep(3000);

// clicking on edit button
             WebElement edit=driver.findElement(By.xpath("(//div[@class='MuiBox-root jss171 jss32'])[1]"));
             a.moveToElement(edit).click().perform();
               Thread.sleep(4000);
               
             WebElement img= driver.findElement(By.xpath("(//img[@alt='logo'])[1]"));
             
          
      System.out.println(s.getCmpname().getAttribute("value"));
      System.out.println(s.getDomainname().getAttribute("value"));
      
      
      assert img.isDisplayed();
      
      Assert.assertEquals(s.getCmpname().getAttribute("value"), "Aishwarya1");
      Assert.assertEquals(s.getDomainname().getAttribute("value"), "Interior");
      
      
}

        
	

}
