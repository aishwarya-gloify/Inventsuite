package com.inventsuite.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class brand {

	
	@FindBy(xpath = "//a[@class='jss53 activeTab']//span[@class='MuiTypography-root MuiListItemText-primary MuiTypography-body1 MuiTypography-displayBlock']")
	private WebElement brand_btn;
	
	
	@FindBy(xpath = "//h6[normalize-space()='Brands']")
	private WebElement brands_text;
	
	@FindBy(xpath = "//span[normalize-space()='Add Brand']")
	private WebElement add_brand_btn;
	
	@FindBy(xpath = "//input[@placeholder='Search…']")
	private WebElement search_textbox;
	
	@FindBy(xpath = "//span[normalize-space()='Search']")
	private WebElement search_btn;
	
	@FindBy(xpath = "//h6[normalize-space()='Create Brand']")
	private WebElement create_brand_text;
	
	@FindBy(xpath = "//h6[normalize-space()='Brand Details']")
	private WebElement branddetails_text;
	
	@FindBy(xpath = "//input[@placeholder='Enter Name']")
	private WebElement brandname_textbox;
	
	@FindBy(xpath = "//input[@placeholder='Enter Description']")
	
	private WebElement description_textbox;
	
	@FindBy(xpath = "//img[@alt='imageUploadIcon']")
	private WebElement image_upload;
	
	@FindBy(xpath = "//p[normalize-space()='Image Not Available']")
	private WebElement image_not_availabletext;
	
	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text submitBtn px-5']")
	private WebElement create_brand_btn;
	
	@FindBy(xpath = "//p[normalize-space()='Name Cannot be empty']")
	private WebElement brand_name_validation;
	
	@FindBy(xpath = "//div[@id='swal2-content']")
	private WebElement brand_created_success_msg;
	
	@FindBy(xpath = "//button[normalize-space()='OK']")
	private WebElement brand_created_success_ok_btn;
	
	@FindBy(xpath = "(//div[normalize-space()='Product Brand exists for the company']/parent::div)[2]")
	private WebElement brand_exist_validation;
	
	@FindBy(xpath = "//button[normalize-space()='OK']")
	private WebElement brand_exist_ok_btn;
	
	@FindBy(xpath = "//span[normalize-space()='Edit']")
	private WebElement edit_btn;
	
	@FindBy(xpath = "//span[normalize-space()='Delete']")
	private WebElement delete_btn;
	
	@FindBy(xpath = "//span[normalize-space()='Update']")
	private WebElement update_btn;
	
	@FindBy(xpath = "//h6[normalize-space()='Edit Brand']")
	private WebElement edit_brand_text;
	
	@FindBy(xpath = "//button[normalize-space()='Yes, delete it!']")
	private WebElement yes_delete_btn;
	
	@FindBy(xpath = "//button[normalize-space()='Cancel']")
	private WebElement delete_cancel_btn;
	
	@FindBy(xpath = "//div[@id='swal2-content']")
	private WebElement delete_success_msg;
	
	@FindBy(xpath = "//button[normalize-space()='OK']")
	private WebElement delete_ok_btn;
	
	public WebElement getBranddetails_text() {
		return branddetails_text;
	}

	public WebElement getEdit_btn() {
		return edit_btn;
	}

	public WebElement getDelete_btn() {
		return delete_btn;
	}

	public WebElement getUpdate_btn() {
		return update_btn;
	}

	public WebElement getEdit_brand_text() {
		return edit_brand_text;
	}

	public WebElement getYes_delete_btn() {
		return yes_delete_btn;
	}

	public WebElement getDelete_cancel_btn() {
		return delete_cancel_btn;
	}

	public WebElement getDelete_success_msg() {
		return delete_success_msg;
	}

	public WebElement getDelete_ok_btn() {
		return delete_ok_btn;
	}

	public brand(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getBrand_btn() {
		return brand_btn;
	}

	public WebElement getBrands_text() {
		return brands_text;
	}

	public WebElement getAdd_brand_btn() {
		return add_brand_btn;
	}

	public WebElement getSearch_textbox() {
		return search_textbox;
	}

	public WebElement getSearch_btn() {
		return search_btn;
	}

	public WebElement getCreate_brand_text() {
		return create_brand_text;
	}

	public WebElement getBranddetaild_text() {
		return branddetails_text;
	}

	public WebElement getBrandname_textbox() {
		return brandname_textbox;
	}

	public WebElement getDescription_textbox() {
		return description_textbox;
	}

	public WebElement getImage_upload() {
		return image_upload;
	}

	public WebElement getImage_not_availabletext() {
		return image_not_availabletext;
	}

	public WebElement getCreate_brand_btn() {
		return create_brand_btn;
	}

	public WebElement getBrand_name_validation() {
		return brand_name_validation;
	}

	public WebElement getBrand_created_success_msg() {
		return brand_created_success_msg;
	}

	public WebElement getBrand_created_success_ok_btn() {
		return brand_created_success_ok_btn;
	}

	public WebElement getBrand_exist_validation() {
		return brand_exist_validation;
	}

	public WebElement getBrand_exist_ok_btn() {
		return brand_exist_ok_btn;
	}
	

	
	
}
