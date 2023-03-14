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
public class dashboardtestcase10 extends storebaseclass{
	
	@Test
	public void dashboardtestcase10() throws InterruptedException
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
				String storename = "cmpnametesting";
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
				Thread.sleep(5000);
				a.moveToElement(s.getStore_name()).click().perform();
				Thread.sleep(5000);
				
				a.moveToElement(s.getStore_editicon()).click().perform();
				Thread.sleep(5000);
				
				s.getCmpname().sendKeys(Keys.CONTROL+"a");
				  Thread.sleep(2000);
				    s.getCmpname().sendKeys(Keys.DELETE);
				    Thread.sleep(4000);
				    s.getCmpname().sendKeys("cmp");
				    
				    Thread.sleep(4000);
				    
				    a.moveToElement(s.getUpdate_btn()).click().perform();
				    
				    Thread.sleep(5000);
				    String errormsg= driver.findElement(By.xpath("//div[@id='swal2-content']")).getText();
				    WebElement ok_btn2= driver.findElement(By.xpath("//button[normalize-space()='OK']"));
					
					Assert.assertEquals(errormsg, "Unique link is already taken");
					
					ok_btn2.click();
				
			}

}
