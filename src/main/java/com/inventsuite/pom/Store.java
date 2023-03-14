package com.inventsuite.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Store {
		
	@FindBy (xpath = "//p[contains(text(),'Select Store*')]")
			private WebElement selectstoretext;
	
	@FindBy(xpath = "//span[contains(text(),'+ Add New Store')]")
	     private WebElement addstore;
	
	
	@FindBy(xpath = "//h6[contains(text(),'Create New Store')]")
	private WebElement createstore;
	
	@FindBy(xpath = "//input[@placeholder='Enter Company Name']")
	private WebElement cmpname;
	
	@FindBy (xpath = "//input[@placeholder='Enter Company Domain']")
	private WebElement domainname;
	
	@FindBy(xpath = "//input[@placeholder='Enter Company Permalink']")
	private WebElement permalink;
	
	@FindBy(xpath = "(//i[@class='fa fa-upload'])[1]")
	private WebElement uploadlogo;
	
	@FindBy(xpath = "//span[contains(text(),'Cancel')]")
	private WebElement cancel;
	
	@FindBy(xpath = "//span[contains(text(),'Create')]")
	private WebElement create_btn;
	
	
	 
	@FindBy(xpath = "//button[@aria-label='close']//span[@class='MuiIconButton-label']//*[name()='svg']")
	private WebElement close;

	@FindBy(xpath = "//p[contains(text(),'Name Cannot be empty')]")
	private WebElement companynamevalidation;
	
	@FindBy(xpath = "//p[contains(text(),'Company Domain Cannot be empty')]")
	private WebElement domainvalidation;
	
	@FindBy(xpath = "//p[contains(text(),'Company Permalink Cannot be empty')]")
	private WebElement permalinkvalidation;
	
	@FindBy(xpath = "//p[@id='logo-text']")
	private WebElement logovalidation;
	
	@FindBy(xpath = "(//span[@class='MuiButton-label'])[1]")
	private WebElement store_name;
	
	@FindBy(xpath = "(//*[name()='svg' and @class='MuiSvgIcon-root jss33'])")
	private WebElement store_editicon;
	
	public WebElement getStore_name() {
		return store_name;
	}



	public WebElement getStore_editicon() {
		return store_editicon;
	}



	public WebElement getEdittext() {
		return edittext;
	}



	public WebElement getUpdate_btn() {
		return update_btn;
	}

	@FindBy(xpath = "//h6[normalize-space()='Edit Store']")
	private WebElement edittext;
	
	@FindBy(xpath = "//span[normalize-space()='Update']")
	private WebElement update_btn;
	
	public Store(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	

	public WebElement getSelectstoretext() {
		return selectstoretext;
	}

	public WebElement getAddstore() {
		return addstore;
	}

	public WebElement getCreatestore() {
		return createstore;
	}

	public WebElement getCmpname() {
		return cmpname;
	}

	public WebElement getDomainname() {
		return domainname;
	}

	public WebElement getPermalink() {
		return permalink;
	}

	public WebElement getUploadlogo() {
		return uploadlogo;
	}

	public WebElement getCancel() {
		return cancel;
	}

	public WebElement getCreate_btn() {
		return create_btn;
	}

	public WebElement getClose() {
		return close;
	}

	public WebElement getCompanynamevalidation() {
		return companynamevalidation;
	}

	public WebElement getDomainvalidation() {
		return domainvalidation;
	}

	public WebElement getPermalinkvalidation() {
		return permalinkvalidation;
	}

	public WebElement getLogovalidation() {
		return logovalidation;
	}
	

}
