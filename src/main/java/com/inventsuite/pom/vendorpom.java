package com.inventsuite.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class vendorpom {
	
	@FindBy(xpath = "//h6[normalize-space()='Vendors']")
	private WebElement vendor_text;
	
	@FindBy(xpath="//span[normalize-space()='Add Vendor']")
	private WebElement add_vendor_btn;
	
	@FindBy(xpath = "//h6[normalize-space()='Create vendor Details']")
	private WebElement create_vendor_details_textbox;
	
	@FindBy(xpath = "//input[@placeholder='Enter first name*']")
	private WebElement vendor_first_name;
	
	@FindBy(xpath = "//input[@placeholder='Enter last name']")
	private WebElement vendor_last_name;
	
	@FindBy(xpath = "//input[@placeholder='Enter nickname']")
	private WebElement nick_name;
	
	@FindBy(xpath = "//input[@placeholder='Enter email*']")
	private WebElement email_textbox;
	
	@FindBy(xpath = "//input[@placeholder='Enter country code']")
	private WebElement country_code;
	
	@FindBy(xpath = "//input[@placeholder='Enter phone*']")
	private WebElement mobile_no_textbox;
	
	@FindBy(xpath = "//img[@alt='imageUploadIcon']")
	private WebElement upload_image;
	
	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text submitBtn px-5']")
	private WebElement tag_create_btn;
	
	@FindBy(xpath = "//p[normalize-space()='First Name Cannot be empty']")
	private WebElement first_name_validation;
	
	@FindBy(xpath = "(//p[@id='email-text'])[1]")
	private WebElement emain_tex_validation;
	
	@FindBy(xpath = "(//p[@id='email-text'])[2]")
	private WebElement phone_no_validation;
	
	@FindBy(xpath = "//h2[@id='swal2-title']")
	private WebElement invali_email_address_text;
	
	@FindBy(xpath = "//button[normalize-space()='OK']")
	private WebElement ok_btn;
	
	@FindBy(xpath = "//div[@id='swal2-content']")
	private WebElement vendor_created_success_msg;
	
	@FindBy(xpath = "//button[normalize-space()='OK']")
	private WebElement success_ok_btn;
	
	@FindBy(xpath = "//div[@id='swal2-content']")
	private WebElement user_exist_validation;
	
	@FindBy(xpath = "//button[normalize-space()='OK']")
	private WebElement user_exists_ok_btn;
	
	@FindBy(xpath = "//span[normalize-space()='Edit']")
	private WebElement edit_btn;
	
	@FindBy(xpath = "//span[normalize-space()='Delete']")
	private WebElement delete_btn;
	
	@FindBy(xpath = "//span[normalize-space()='Update']")
	private WebElement update_btn;
	
	@FindBy(xpath = "//div[@id='swal2-content']")
	private WebElement delete_text;
	
	@FindBy(xpath = "//button[normalize-space()='Yes, delete it!']")
	private WebElement yes_deleteit_btn;
	
	@FindBy(xpath = "//button[normalize-space()='Cancel']")
	private WebElement cancel_delete_btn;
	
	@FindBy(xpath = "//button[normalize-space()='OK']")
	private WebElement delete_ok_btn;
	
	@FindBy(xpath = "//h6[normalize-space()='Edit vendor Details']")
	private WebElement edit_vendor_details;
	
	public vendorpom(WebDriver driver) {
		PageFactory.initElements(driver, this) ;
	}

	public WebElement getVendor_text() {
		return vendor_text;
	}

	public WebElement getAdd_vendor_btn() {
		return add_vendor_btn;
	}

	public WebElement getCreate_vendor_details_textbox() {
		return create_vendor_details_textbox;
	}

	public WebElement getVendor_first_name() {
		return vendor_first_name;
	}

	public WebElement getVendor_last_name() {
		return vendor_last_name;
	}

	public WebElement getNick_name() {
		return nick_name;
	}

	public WebElement getEmail_textbox() {
		return email_textbox;
	}

	public WebElement getCountry_code() {
		return country_code;
	}

	public WebElement getMobile_no_textbox() {
		return mobile_no_textbox;
	}

	public WebElement getUpload_image() {
		return upload_image;
	}

	public WebElement getTag_create_btn() {
		return tag_create_btn;
	}

	public WebElement getFirst_name_validation() {
		return first_name_validation;
	}

	public WebElement getEmain_tex_validation() {
		return emain_tex_validation;
	}

	public WebElement getPhone_no_validation() {
		return phone_no_validation;
	}

	public WebElement getInvali_email_address_text() {
		return invali_email_address_text;
	}

	public WebElement getOk_btn() {
		return ok_btn;
	}

	public WebElement getVendor_created_success_msg() {
		return vendor_created_success_msg;
	}

	public WebElement getSuccess_ok_btn() {
		return success_ok_btn;
	}

	public WebElement getUser_exist_validation() {
		return user_exist_validation;
	}

	public WebElement getUser_exists_ok_btn() {
		return user_exists_ok_btn;
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

	public WebElement getDelete_text() {
		return delete_text;
	}

	public WebElement getYes_deleteit_btn() {
		return yes_deleteit_btn;
	}

	public WebElement getCancel_delete_btn() {
		return cancel_delete_btn;
	}

	public WebElement getDelete_ok_btn() {
		return delete_ok_btn;
	}

	public WebElement getEdit_vendor_details() {
		return edit_vendor_details;
	}
	
	
	

}
