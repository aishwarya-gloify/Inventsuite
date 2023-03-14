package com.inventsuite.testscript.dashboard;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.inventsuite.generics.profilepage;
import com.inventsuite.generics.storebaseclass;
import com.inventsuite.pom.Store;
import com.inventsuite.pom.profile;
@Listeners(com.inventsuite.generics.Listenerstore.class)
public class dashboardtestcase06 extends storebaseclass{
	
	
	@Test
	public void dashboardtestcase06() throws InterruptedException
	{
		String storename2 ="testingchetan";
Store s= new Store(driver);     
		
		Actions a= new Actions(driver);
		 profile p= new profile(driver);
		

		    Thread.sleep(3000);
// Implementing the profilebaseclass here 
		    Thread.sleep(2000);
			 WebElement ul = driver.findElement(By.xpath("//ul[@class='MuiList-root jss31 MuiList-padding']"));
				List<WebElement> listAll = ul.findElements(By.tagName("li"));
				
				//listing of all webelements
				/*for (int i = 0; i < listAll.size(); i++) {
					String text = listAll.get(i).getText();
					System.out.println(text);

				}*/
				//Actions a=new Actions(driver);
				String storename = "chetan20";
				//String searchStore = "zepto";
				//clicking on particular store
				for (WebElement option : listAll) {
					
					if(option.getText().equals(storename)) 
					{
						System.out.println("Located element and clicked");
						a.moveToElement(option).perform();
						Thread.sleep(8000);
						a.moveToElement(option).click().perform();
						Thread.sleep(3000);
						break;
					}
				}
				
				// completed
		
		    
		  a.moveToElement(s.getStore_name()).click().perform();
		  
		  Thread.sleep(6000);
		//clicking on edit button
		  a.moveToElement(s.getStore_editicon()).click().perform();
		  Thread.sleep(6000);
		  
		  s.getCmpname().sendKeys(Keys.CONTROL+"a");
		  Thread.sleep(2000);
		    s.getCmpname().sendKeys(Keys.DELETE);
		  Thread.sleep(3000);
		  s.getCmpname().sendKeys("testingchetan");
		  
		  s.getDomainname().sendKeys(Keys.CONTROL+"a");
		  Thread.sleep(2000);
		    s.getDomainname().sendKeys(Keys.DELETE);
		  Thread.sleep(2000);
		  s.getDomainname().sendKeys("Interior");
		  
		  Thread.sleep(3000);
		  
		 a.moveToElement(s.getUpdate_btn()).click().perform();
		 
		 WebElement success= driver.findElement(By.xpath("//div[@id='swal2-content']"));
         WebElement ok_btn= driver.findElement(By.xpath("//button[normalize-space()='OK']"));
         
          Thread.sleep(3000);
          
          Assert.assertEquals(success.getText(), "Company updated successfully");
          
          Thread.sleep(2000);
          
          ok_btn.click();
          
          Thread.sleep(4000);
          
          char first = Character.toUpperCase(storename2.charAt(0));
  		Object betterIdea = first + storename2.substring(1);
  		
  		System.out.println(betterIdea);
          Assert.assertEquals(s.getStore_name().getText(), betterIdea);
          
          System.out.println(s.getStore_name().getText());
           
          Thread.sleep(3000);
          
          a.moveToElement(s.getStore_name()).click().perform();
          Thread.sleep(3000);
          
          a.moveToElement(s.getStore_editicon()).click().perform();
          
          Thread.sleep(3000);
          
          System.out.println(s.getCmpname().getAttribute("value"));
          System.out.println(s.getDomainname().getAttribute("value"));
          
          Assert.assertEquals(s.getCmpname().getAttribute("value"), "testingchetan");
          Assert.assertEquals(s.getDomainname().getAttribute("value"), "Interior");
          
          
		 
		  
		
	}

}
