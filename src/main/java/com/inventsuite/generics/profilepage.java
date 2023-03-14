package com.inventsuite.generics;

import java.io.IOException;import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.inventsuite.pom.LoginPage;
import org.openqa.selenium.StaleElementReferenceException;
public class profilepage {
	static {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\gloif\\eclipse-workspace\\Inventsuite\\src\\main\\resources\\driver\\chromedriver.exe");
	}
	public static WebDriver driver;
	@BeforeClass
	public void openBrowser() {
		driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.close();
	}
	@BeforeMethod
	public void login() throws IOException, InterruptedException
	{
		
		
		FileLib f=new FileLib();
		
		String data1= f.getExcelData("loginpage", 1, 2);
		String data2=f.getExcelData("loginpage", 1, 3);
		driver.get("https://admin.gloify.co/login");
		
		LoginPage login= new LoginPage(driver);
		
		login.getUntbx().sendKeys(data1);
		login.getPwtbx().sendKeys(data2);
		
		login.getLgbtn().click();
		
		Thread.sleep(2000);
		 WebElement ul = driver.findElement(By.xpath("//ul[@class='MuiList-root jss32 MuiList-padding']"));
			List<WebElement> listAll = ul.findElements(By.tagName("li"));
			
			//listing of all webelements
			/*for (int i = 0; i < listAll.size(); i++) {
				String text = listAll.get(i).getText();
				System.out.println(text);

			}*/
			Actions a=new Actions(driver);
			String storename = "Aj";
			//String searchStore = "zepto";
			//clicking on particular store
			for (WebElement option : listAll) {
				
				if(option.getText().equals(storename)) 
				{
					//System.out.println("Located element and clicked");
					a.moveToElement(option).perform();
					Thread.sleep(8000);
					a.moveToElement(option).click().perform();
					Thread.sleep(3000);
					break;
				}
			}
		///PageFactory.initElements(driver, this);
	}
	

}

