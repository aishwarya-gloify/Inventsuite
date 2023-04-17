package com.inventsuite.generics;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.inventsuite.pom.LoginPage;
import com.inventsuite.pom.profile;

public class baseclass2 {
	static {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\gloif\\eclipse-workspace\\Inventsuite\\src\\main\\resources\\driver\\chromedriver.exe");
//		ChromeOptions chromeOptions= new ChromeOptions(); 
	}
	
	
public static WebDriver driver;
	
	@BeforeClass
	public void openBrowser() {
		ChromeOptions chromeOptions= new ChromeOptions(); 
		chromeOptions.setBinary("C:\\Users\\gloif\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe"); 
		driver=new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	@AfterClass
	public static void closeBrowser() {
		driver.close();
		
	}
	@BeforeMethod
	public void login() throws IOException {
		//driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://admin.gloify.co/login");

	}

	public static WebDriver getDriver() {
        return driver;
    }
	
	@AfterMethod
		
		public void logout() throws InterruptedException
		{
			profile p= new profile(driver);
			p.getUserimg().click();
			Thread.sleep(3000);
			p.getLogout().click();
			Thread.sleep(3000);
		}

	/** 
	 * This is a actions method for mouse hover operation
	 * @param webElement
	 */
	public void Actions(WebElement webElement)
	{

		Actions act= new Actions(driver);
		act.moveToElement(webElement).click().perform();
		//return;
	}


	public void select(WebElement webElement, String value, int index, String value1)
	{
		Select s= new Select(webElement);
		s.selectByValue(value);
		s.selectByIndex(index);
		s.selectByVisibleText(value1);
		return;
	}
	/**
	 * 
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public void validlogindata() throws EncryptedDocumentException, IOException
	{
		FileLib f=new FileLib();
		String url=f.getProperty("url");
		String un= f.getProperty("username");
		String pwd= f.getProperty("password");

		LoginPage l= new LoginPage(driver);
		//			String data1= f.getExcelData("loginpage", 1, 2);
		//			String data2=f.getExcelData("loginpage", 1, 3);
		driver.get(url);

		LoginPage login= new LoginPage(driver);

		login.getUntbx().sendKeys(un);
		login.getPwtbx().sendKeys(pwd);

		Actions(l.getLgbtn());
	}

	public void storeclick() throws InterruptedException
	{
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
	}

	public void clickvendor()
	{
		WebElement vendor= driver.findElement(By.xpath("//span[contains(text(),'Vendors')]"));
		//a.moveToElement(vendor).click().perform();
		Actions(vendor);
		return;
	}

	public void clickonvariant() throws InterruptedException
	{Actions a= new Actions(driver);
	Thread.sleep(2000);
	WebElement product_btn= driver.findElement(By.xpath("//span[contains(text(),'Products')]"));

	//clicking on product
	a.moveToElement(product_btn).click().perform();

	Thread.sleep(3000);

	WebElement list2= driver.findElement(By.xpath("//div[@class='MuiCollapse-root MuiCollapse-entered']"));
	List<WebElement> listAll2 = list2.findElements(By.tagName("a"));
	//System.out.println(listAll2.size());
	//			for (int i = 0; i < listAll2.size(); i++) {
	//				WebElement text = listAll2.get(i);
	//				System.out.println(text.getText());
	//				
	//
	//			}

	Thread.sleep(2000);
	for (WebElement option : listAll2) {

		String name= "Variants";

		if(option.getText().equals(name))
		{
			//System.out.println("Located element and clicked");
			a.moveToElement(option).perform();
			Thread.sleep(3000);
			a.moveToElement(option).click().perform();
			Thread.sleep(2000);
			break;
		}
	}
	}



}
