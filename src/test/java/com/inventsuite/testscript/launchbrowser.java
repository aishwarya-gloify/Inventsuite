package com.inventsuite.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchbrowser {
	static
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\gloif\\eclipse-workspace\\Inventsuite\\src\\main\\resources\\driver\\chromedriver.exe");
	}
	public void launch()
	{
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\gloif\\eclipse-workspace\\Inventsuite\\src\\main\\resources\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	}

}
