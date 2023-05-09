package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApcfmsHomePage {

	@FindBy(xpath = "//div[@id='alertmsgonload']//button[.='Close']")
	private WebElement clsoeAlertBtn;

	@FindBy(xpath = "//div[@id='alertmsgonload']//button[.='×']")
	private WebElement xcloseBtn;

	@FindBy(xpath = "//a[.='  AP Budget Portal ']")
	private WebElement budgetPortalLink;

	@FindBy(xpath = "//a[.='  AP Finance ']")
	private WebElement financePortalLink;

	public ApcfmsHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getClsoeAlertBtn() {
		return clsoeAlertBtn;
	}

	public WebElement getXcloseBtn() {
		return xcloseBtn;
	}
	
	public WebElement getBudgetPortalLink() {
		return budgetPortalLink;
	}

	public WebElement getFinancePortalLink() {
		return financePortalLink;
	}
	
	
	
	
	
	
	
	
	

	

	public void closeAlert() {
		xcloseBtn.click();
	}

}
