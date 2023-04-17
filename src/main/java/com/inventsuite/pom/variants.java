package com.inventsuite.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class variants {
	
	@FindBy(xpath = "//h6[normalize-space()='Variants']")
	private WebElement variant_text;
	
	@FindBy(xpath = "//span[normalize-space()='Add Variant']")
	private WebElement add_variant_btn;
	
	@FindBy(xpath = "//input[@placeholder='Search…']")
	private WebElement search_textbox;
	
	@FindBy(xpath = "//span[normalize-space()='Search']")
	private WebElement search_btn;
	
	@FindBy(xpath = "//h6[normalize-space()='Create Variant']")
	private WebElement create_variant_text;
	
	@FindBy(xpath = "//h6[normalize-space()='Variant Details']")
	private WebElement variant_details_text;
	
	@FindBy(xpath = "//input[@placeholder='Enter Name*']")
	private WebElement variant_name_textbox;
	
	@FindBy(xpath = "//select[@class='custom-select']")
	private WebElement media_type;
	
	@FindBy(xpath = "//button[normalize-space()='Choose images']")
	private WebElement upload_image;
	
	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text submitBtn px-5']")
	private WebElement create_variant_btn;
	
	@FindBy(xpath = "//p[@id='email-text']")
	private WebElement variant_name_validation;
	
	@FindBy(xpath = "//div[@id='swal2-content']")
	private WebElement variant_created_success_msg;
	
	@FindBy(xpath = "//button[normalize-space()='OK']")
	private WebElement variant_created_ok_btn;
	
	@FindBy(xpath = "//div[@id='swal2-content']")
	private WebElement variant_exists_validation;
	
	@FindBy(xpath = "//button[normalize-space()='OK']")
	private WebElement variant_exists_ok_btn;
	
	@FindBy(xpath = "//span[normalize-space()='Add Variant Option']")
	private WebElement add_variant_optn_btn;
	
	@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1']//h6")
	private WebElement create_variant_optn_txt;
	
	@FindBy(xpath = "//input[@placeholder='Enter Value']")
	private WebElement sub_variant_textbox;
	
	@FindBy(xpath = "//input[@placeholder='Enter Unit']")
	private WebElement unit_textbox;
	
	@FindBy(xpath = "//span[normalize-space()='Create']")
	private WebElement create_variant_optn_btn;
	
	@FindBy(xpath = "//span[normalize-space()='Update']")
	private WebElement variant_update_btn;
	
	@FindBy(xpath = "//h6[normalize-space()='Edit Variant']")
	private WebElement edit_variant_text;
	
	@FindBy(xpath = "//a[normalize-space()='Edit']")
	private WebElement edit_variant_txt;
	
	@FindBy(xpath = "//span[normalize-space()='Edit']")
	private WebElement edit_btn;
	
	@FindBy(xpath = "//span[normalize-space()='Delete']")
	private WebElement delete_btn;
	@FindBy(xpath = "//button[normalize-space()='Yes, delete it!']")
	private WebElement yes_delete_it_btn;
	
	@FindBy(xpath = "//button[normalize-space()='OK']")
	private WebElement delete_ok_btn;
	
	@FindBy(xpath = "//div[@class='errorMessage ']")
	private WebElement max_image_limit;
	
	@FindBy(xpath = "//a[@class='linkButton float-right']")
	private WebElement variant_details_edit_btn;
	
	@FindBy(id = "swal2-content")
	private WebElement variantname_exit_validation;
	
	@FindBy(xpath = "//img[@alt='variant image']")
	private WebElement variantdetails_imgpresent;
	
	@FindBy(xpath = "//h6[normalize-space()='Variant Options']")
	private WebElement variant_option_txt;
	
	@FindBy(xpath = "//span[@class='noData']")
	private WebElement nodata_txt;
	
	@FindBy(xpath = "//span[normalize-space()='Add Variant Option']")
	private WebElement add_variant_option_btn;
	
	@FindBy(xpath = "//button[@aria-label='close']//span[@class='MuiIconButton-label']//*[name()='svg']")
	private WebElement variant_optn_close_icon;
	

	@FindBy(xpath = "//div[@class='MuiBox-root jss227']//p[@id='name-text']")
	private WebElement sub_variant_textbox_validation;
	
	@FindBy(xpath = "//div[@class='MuiBox-root jss102']//p")
	private WebElement unit_textbox_validation;
	
	
	public WebElement getSub_variant_textbox_validation() {
		return sub_variant_textbox_validation;
	}

	public WebElement getUnit_textbox_validation() {
		return unit_textbox_validation;
	}

	public WebElement getVariant_option_txt() {
		return variant_option_txt;
	}

	public WebElement getNodata_txt() {
		return nodata_txt;
	}

	public WebElement getAdd_variant_option_btn() {
		return add_variant_option_btn;
	}

	public WebElement getVariant_optn_close_icon() {
		return variant_optn_close_icon;
	}

	public WebElement getVariantdetails_imgpresent() {
		return variantdetails_imgpresent;
	}

	public WebElement getVariantname_exit_validation() {
		return variantname_exit_validation;
	}

	public WebElement getVariant_details_edit_btn() {
		return variant_details_edit_btn;
	}

	public WebElement getMax_image_limit() {
		return max_image_limit;
	}

	public WebElement getYes_delete_it_btn() {
		return yes_delete_it_btn;
	}

	public WebElement getDelete_ok_btn() {
		return delete_ok_btn;
	}

	public WebElement getEdit_btn() {
		return edit_btn;
	}

	public WebElement getDelete_btn() {
		return delete_btn;
	}

	public variants(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getVariant_text() {
		return variant_text;
	}

	public WebElement getAdd_variant_btn() {
		return add_variant_btn;
	}

	public WebElement getSearch_textbox() {
		return search_textbox;
	}

	public WebElement getSearch_btn() {
		return search_btn;
	}

	public WebElement getCreate_variant_text() {
		return create_variant_text;
	}

	public WebElement getVariant_details_text() {
		return variant_details_text;
	}

	public WebElement getVariant_name_textbox() {
		return variant_name_textbox;
	}

	public WebElement getMedia_type() {
		return media_type;
	}

	public WebElement getUpload_image() {
		return upload_image;
	}

	public WebElement getCreate_variant_btn() {
		return create_variant_btn;
	}

	public WebElement getVariant_name_validation() {
		return variant_name_validation;
	}

	public WebElement getVariant_created_success_msg() {
		return variant_created_success_msg;
	}

	public WebElement getVariant_created_ok_btn() {
		return variant_created_ok_btn;
	}

	public WebElement getVariant_exists_validation() {
		return variant_exists_validation;
	}

	public WebElement getVariant_exists_ok_btn() {
		return variant_exists_ok_btn;
	}

	public WebElement getAdd_variant_optn_btn() {
		return add_variant_optn_btn;
	}

	public WebElement getCreate_variant_optn_txt() {
		return create_variant_optn_txt;
	}

	public WebElement getSub_variant_textbox() {
		return sub_variant_textbox;
	}

	public WebElement getUnit_textbox() {
		return unit_textbox;
	}

	public WebElement getCreate_variant_optn_btn() {
		return create_variant_optn_btn;
	}

	public WebElement getVariant_update_btn() {
		return variant_update_btn;
	}

	public WebElement getEdit_variant_text() {
		return edit_variant_text;
	}

	public WebElement getEdit_variant_txt() {
		return edit_variant_txt;
	}
	

}
