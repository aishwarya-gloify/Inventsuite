package com.inventsuite.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class tags 
{
	@FindBy(xpath = "//div[@class='customReactSelect__value-container css-1hwfws3']")
	private WebElement select_status;
	
	@FindBy(xpath = "//span[normalize-space()='Add Tag']")
	private WebElement add_tag_btn;
	
	@FindBy(xpath = "//input[@placeholder='Search…']")
	private WebElement search_textbox;
	
	@FindBy(xpath = "//span[normalize-space()='Search']")
	private WebElement search_btn;
	
	@FindBy(xpath = "//span[normalize-space()='Edit']")
	private WebElement edit_btn;
	
	@FindBy(xpath = "//span[normalize-space()='Delete']")
	private WebElement delete_btn;
	
	@FindBy(xpath="//h6[normalize-space()='Tags']")
	private WebElement tag_text;
	
	@FindBy(xpath="//h6[normalize-space()='Create Tag']")
	private WebElement create_tag_text;
	
	@FindBy(xpath = "//input[@placeholder='Enter Name*']")
	private WebElement tag_name_textbox;
	
	@FindBy(xpath = "//input[@placeholder='Enter Slug']")
	private WebElement slug_textbox;
	
	@FindBy(xpath = "//input[@placeholder='Enter Display Order*']")
	private WebElement displayorder_textbox;
	
	@FindBy(xpath = "(//select[@class='form-control'])[1]")
	private WebElement select_active_drpdwn;
	
	@FindBy(xpath="//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-6'][5]/child::select")
	private WebElement select_featured_drpdwn;
	
	@FindBy(xpath="//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-6'][6]/child::select")
	private WebElement select_img_size_drpdwn;
	
	@FindBy(xpath="//img[@alt='imageUploadIcon']")
	private WebElement image_upload_btn;
	
	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text submitBtn px-5']")
	private WebElement create_tag_btn;
	
	@FindBy(xpath="//p[normalize-space()='Name Cannot be empty']")
	private WebElement tag_name_validation;
	
	@FindBy(xpath = "//p[text()='Enter Display Order*']/parent::div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-6']/child::p[2]")
	private WebElement display_order_validation;
	
	@FindBy(xpath = "//p[text()='Select Active*']/parent::div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-6']/child::p[2]")
	private WebElement select_active_validation;
	
	@FindBy(xpath = "//p[text()='Select Featured*']/parent::div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-6']/child::p[2]")
	private WebElement select_featured_valudation;
	
	@FindBy(xpath = "//p[text()='Select Image Size*']/parent::div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-6']/child::p[2]")
	private WebElement image_size_validation;
	
	@FindBy(xpath = "//div[@id='swal2-content']")
	private WebElement created_success_msg;
	
	@FindBy(xpath = "//button[normalize-space()='OK']")
	private WebElement success_ok_btn;
	
	@FindBy(xpath = "//span[normalize-space()='Update']")
	private WebElement update_btn;
	
	@FindBy(xpath = "//div[@id='swal2-content']")
	private WebElement delet_msg;
	
	@FindBy(xpath= "//button[normalize-space()='Yes, delete it!']")
	private WebElement yes_delete_btn;
	
	@FindBy(xpath = "//button[normalize-space()='Cancel']")
	private WebElement cancel_delete_btn;
	
	@FindBy(xpath = "//div[@id='swal2-content']")
	private WebElement tag_delete_successmsg;
	
	@FindBy(xpath = "//button[normalize-space()='OK']")
	private WebElement delete_ok_btn;

	public tags(WebDriver driver) {
		PageFactory.initElements(driver, this) ;
	}
	public WebElement getSelect_status() {
		return select_status;
	}

	public WebElement getAdd_tag_btn() {
		return add_tag_btn;
	}

	public WebElement getSearch_textbox() {
		return search_textbox;
	}

	public WebElement getSearch_btn() {
		return search_btn;
	}

	public WebElement getEdit_btn() {
		return edit_btn;
	}

	public WebElement getDelete_btn() {
		return delete_btn;
	}

	public WebElement getTag_text() {
		return tag_text;
	}

	public WebElement getCreate_tag_text() {
		return create_tag_text;
	}

	public WebElement getTag_name_textbox() {
		return tag_name_textbox;
	}

	public WebElement getSlug_textbox() {
		return slug_textbox;
	}

	public WebElement getDisplayorder_textbox() {
		return displayorder_textbox;
	}

	public WebElement getSelect_active_drpdwn() {
		return select_active_drpdwn;
	}

	public WebElement getSelect_featured_drpdwn() {
		return select_featured_drpdwn;
	}

	public WebElement getSelect_img_size_drpdwn() {
		return select_img_size_drpdwn;
	}

	public WebElement getImage_upload_btn() {
		return image_upload_btn;
	}

	public WebElement getCreate_tag_btn() {
		return create_tag_btn;
	}

	public WebElement getTag_name_validation() {
		return tag_name_validation;
	}

	public WebElement getDisplay_order_validation() {
		return display_order_validation;
	}

	public WebElement getSelect_active_validation() {
		return select_active_validation;
	}

	public WebElement getSelect_featured_valudation() {
		return select_featured_valudation;
	}

	public WebElement getImage_size_validation() {
		return image_size_validation;
	}

	public WebElement getCreated_success_msg() {
		return created_success_msg;
	}

	public WebElement getSuccess_ok_btn() {
		return success_ok_btn;
	}

	public WebElement getUpdate_btn() {
		return update_btn;
	}

	public WebElement getDelet_msg() {
		return delet_msg;
	}

	public WebElement getYes_delete_btn() {
		return yes_delete_btn;
	}

	public WebElement getCancel_delete_btn() {
		return cancel_delete_btn;
	}

	public WebElement getTag_delete_successmsg() {
		return tag_delete_successmsg;
	}

	public WebElement getDelete_ok_btn() {
		return delete_ok_btn;
	}

	
}
