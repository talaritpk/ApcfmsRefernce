package com.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OTPRpage {
	@FindBy(name="candidateName")
	private WebElement  canndidateNameTb;
	
	@FindBy(name="fatherName")
	private WebElement  fatherNameTb;

	@FindBy(name="motherName")
	private WebElement  motherName;
	
	
}
