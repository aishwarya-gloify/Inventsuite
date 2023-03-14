package com.inventsuite.testscript.dashboard;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.inventsuite.generics.storebaseclass;
import com.inventsuite.pom.Store;
import com.inventsuite.pom.profile;
@Listeners(com.inventsuite.generics.Listenerstore.class)
public class dashboardtestcase08 extends storebaseclass{
	
	@Test
	public void dashboardtestcase08() throws InterruptedException
	{
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
					String storename = "chetan19";
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
				
				Thread.sleep(3000);
				
				a.moveToElement(s.getStore_editicon()).click().perform();
				
				Thread.sleep(6000);
				
				 s.getCmpname().sendKeys(Keys.CONTROL+"a");
				  Thread.sleep(2000);
				    s.getCmpname().sendKeys(Keys.DELETE);
				    Thread.sleep(4000);
				    
				    a.moveToElement(s.getUpdate_btn()).click();
				    Thread.sleep(4000);
				    
				    a.moveToElement(s.getClose()).click().perform();
				    
				    Thread.sleep(4000);
				    
				    //a.moveToElement(s.getStore_name()).click().perform();
					
					//Thread.sleep(3000);
					
					a.moveToElement(s.getStore_editicon()).click().perform();
					
					Thread.sleep(6000);
					
					Assert.assertEquals(s.getCmpname().getAttribute("value"), "chetan19");
	}

}
