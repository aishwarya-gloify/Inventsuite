package com.inventsuite.generics;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.util.Constants;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.inventsuite.pom.LoginPage;
import com.inventsuite.pom.profile;

import io.github.bonigarcia.wdm.WebDriverManager;


/**
 * This is base class
 * @author Aishwarya
 *
 */

public class baseclass {

	static {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\gloif\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");
		//		ChromeOptions options = new ChromeOptions();
		//
		//		options.addExtensions(new File("C:\\Users\\gloif\\eclipse-workspace\\Inventsuite\\src\\main\\resources\\driver\\chromedriver.exe"));
		//
		//		ChromeDriver driver = new ChromeDriver(options);
		//WebDriverManager.chromedriver().setup();
		//WebDriverManager.chromedriver().setup();
		//driver = new ChromeDriver();
		//		WebDriverManager.chromedriver().setup();
		//		ChromeOptions options = new ChromeCapabilities().setChromeOptions();

		//		WebDriverManager.chromedriver().setup();
		//		WebDriver driver=new ChromeDriver();

		//	ChromeOptions chromeOptions= new ChromeOptions();
		//
		//	
		//
		//	chromeOptions.setBinary("C:\\Users\\gloif\\eclipse-workspace\\Inventsuite\\src\\main\\resources\\driver\\chromedriver.exe");
		//		System.setProperty("webdriver.chrome.driver","C:\\Users\\gloif\\eclipse-workspace\\Inventsuite\\src\\main\\resources\\driver\\chromedriver.exe");
		//		ChromeDriver driver = new ChromeDriver(chromeOptions);
		//	driver=new ChromeDriver(chromeOptions);
		//		
		//WebDriverManager.chromedriver().setup();
		//		capabilities: {
		//			  browserName: "chrome",
		//			   chromeOptions:'binary': 'C:\Users\gloif\eclipse-workspace\Inventsuite\src\main\resources\driver\chromedriver.exe'}, 
		//			},
		//options = Options() options.binary_location = "C:\\Program Files\\Chrome\\chrome64_55.0.2883.75\\chrome.exe"driver = webdriver.Chrome(chrome_options = options, executable_path=r'C:\path\to\chromedriver.exe');
		//		ChromeOptions options = new ChromeOptions();options.addExtensions(new File("C:\\Users\\gloif\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe"));
		//		ChromeDriver driver = new ChromeDriver(options);
		//		chromeOptions = WebDriverException.ChromeOptions();
		//				ChromeOptions.binary_location = "C:\\\\Users\\\\gloif\\\\AppData\\\\Local\\\\Google\\\\Chrome\\\\Application" chromeDriver = "/chromedriver.exe";
		//				driver = WebDriverException.Chrome(chromeDriver, options=chromeOptions);

		//		ChromeOptions chromeOptions= new ChromeOptions(); 
		//		chromeOptions.setBinary("C:\\Users\\gloif\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe"); 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\gloif\\eclipse-workspace\\Inventsuite\\src\\main\\resources\\driver\\chromedriver.exe");
	
//		DesiredCapabilities capabilities = new DesiredCapabilities();
//		capabilities.setAcceptInsecureCerts(true); // dedicated method

	}
	
	/*static 
	{
		ChromeOptions chromeOptions= new ChromeOptions(); 
		chromeOptions.setBinary("C:\\Users\\gloif\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe"); 
		
			
			
	}*/
public static WebDriver driver;
	
	@BeforeClass
	public void openBrowser() {
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver=new ChromeDriver();
		ChromeOptions chromeOptions= new ChromeOptions(); 
		chromeOptions.setBinary("C:\\Users\\gloif\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe"); 
		driver=new ChromeDriver(chromeOptions);
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setAcceptInsecureCerts(true); // dedicated method
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

//	@BeforeTest
//	  @Parameters("browser")
//    public void testSetup(String browser) throws Exception {
//        //Check if parameter passed from TestNG is 'firefox'
//        if (browser.equalsIgnoreCase("chrome")) {
//        	driver= "C:\\\\Users\\\\gloif\\\\eclipse-workspace\\\\Inventsuite\\\\src\\\\main\\\\resources\\\\driver\\\\chromedriver.exe";
//        	//  driver = WebBrowsers.browserAl("Chrome");
//        } else {
//            //If no browser passed throw exception
//            throw new Exception("Browser is not correct");
//        }
//    }
//	@AfterClass
//	public static void closeBrowser() {
//		//driver.close();
//		if (driver != null) {
//            driver.quit();
//		}
//	}
	@BeforeMethod
	public void login() throws IOException {
		//driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://admin.gloify.co/login");

	}
//	@AfterTest
//	public void clean()
//	{
//		if (driver != null) {
//        driver.quit();
//		}
////		}
//	}
	public static WebDriver getDriver() {
        return driver;
    }
	//	@AfterMethod
	//	public void logout() throws InterruptedException
	//	{
	//		profile p= new profile(driver);
	//		p.getUserimg().click();
	//		Thread.sleep(3000);
	//		p.getLogout().click();
	//		Thread.sleep(3000);
	//	}

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
		WebElement vendor= driver.findElement(By.xpath("//a[@href='/vendor-list']//div[@role='button']"));
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


