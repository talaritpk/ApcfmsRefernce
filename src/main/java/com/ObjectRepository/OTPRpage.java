package com.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.github.javafaker.Faker;

import genericLibrary.WebDriverLibrary;

public class OTPRpage {
	@FindBy(name="candidateName")
	private WebElement  canndidateNameTb;
	
	@FindBy(name="fatherName")
	private WebElement  fatherNameTb;
	
	@FindBy(name="imageUpload")
	private WebElement  imageUploadBtn;

	@FindBy(name="mothersName")
	private WebElement  motherNameTb;
	
	@FindBy(xpath="//label[.='Male']/../input")
	private WebElement maleRadioBtn;
	
	@FindBy(xpath="//label[.='Female']/../input")
	private WebElement femaleRadioBtn;
	
	@FindBy(xpath="//label[.='Transgender']/../input")
	private WebElement transgenderRadioBtn;
	
	@FindBy(xpath="//select[@name='communityId']")
	private WebElement communityDD;
	
	@FindBy(name="mobile")
	private WebElement mobileNoTb;
	
	@FindBy(name="email")
	private WebElement emailTb;
	
	@FindBy(name="maritalSattusCode")
	private WebElement maritalStatusCodeTb;
	
	@FindBy(name="uidNo")
	private WebElement adharNoTb;
	
	@FindBy(name="religionCode")
	private WebElement religionCodeDD;
	
	//String xpathSportsMan="//label[text()='Are You Ex-Service Men']/following-sibling::div//label[text()='Yes']";
	@FindBy(xpath="//label[.='Are You Meritorious Sportsman ']/following-sibling::div//label[text()='Yes']/../input")
	private WebElement sportsManYesRb;
	
	@FindBy(xpath="//label[text()='Are You Meritorious Sportsman ']/following-sibling::div//label[text()='No']/../input")
	private WebElement sportsManNoRb;
	
	@FindBy(xpath="//label[contains(text(),'Ex-Service')]/following-sibling::div//label[text()='Yes']/../input")
	private WebElement exServiceManYesRb;
	
	@FindBy(xpath="//label[contains(text(),'Ex-Service')]/following-sibling::div//label[text()='No']/../input")
	private WebElement exServiceManNoRb;
	
	@FindBy(xpath="//label[contains(text(),'NCC')]/following-sibling::div//label[text()='Yes']/../input")
	private WebElement NccYesRb;
	
	@FindBy(xpath="//label[contains(text(),'NCC')]/following-sibling::div//label[text()='No']/../input")
	private WebElement NccNoRb;
	
	@FindBy(xpath="//label[text()='Are You Employed  ']/following-sibling::div//label[text()='Yes']/../input")
	private WebElement employedYesRb;
	
	@FindBy(xpath="//label[text()='Are You Employed  ']/following-sibling::div//label[text()='No']/../input")
	private WebElement employedNoRb;
	
	@FindBy(xpath="//label[contains(text(),'Temporary Employee')]/following-sibling::div//label[text()='Yes']/../input")
	private WebElement temporaryEmpYesRb;
	
	@FindBy(xpath="//label[contains(text(),'Temporary Employee')]/following-sibling::div//label[text()='No']/../input")
	private WebElement temporaryEmpNoRb;
	
	@FindBy(xpath="//label[contains(text(),'Abled(PH)')]/following-sibling::div//label[text()='Yes']/../input")
	private WebElement diffAbledYesRb;
	
	@FindBy(xpath="//label[contains(text(),'Abled(PH)')]/following-sibling::div//label[text()='No']/../input")
	private WebElement diffAbledNoRb;
	
	@FindBy(xpath="//label[.='Regular']/../input")
	private WebElement RegularRb;
	
	@FindBy(xpath="//label[.='Private']/../input")
	private WebElement PrivatRb;
	
	@FindBy(xpath="//div[contains(text(),'4')]/../select")
	private WebElement forthClassDD;
	
	@FindBy(xpath="//div[contains(text(),'5')]/../select")
	private WebElement fifthClassDD;
	
	
	@FindBy(xpath="//div[contains(text(),'6')]/../select")
	private WebElement sixthClassDD;
	
	@FindBy(xpath="//div[contains(text(),'7')]/../select")
	private WebElement seventhClassDD;
	
	@FindBy(xpath="//div[contains(text(),'8')]/../select")
	private WebElement eightClassDD;
	
	@FindBy(xpath="//div[contains(text(),'9')]/../select")
	private WebElement ninthClassDD;
	
	@FindBy(xpath="//div[contains(text(),'10')]/../select")
	private WebElement tenthClassDD;
	
	@FindBy(xpath="//div[text()='Local District']/../select")
	private WebElement localDistrictDD;
	
	@FindBy(xpath="//label[contains(text(),'G.O No. 171')]/following-sibling::div//label[text()='Yes']/../input")
	private WebElement GO171YesRb;
	
	@FindBy(xpath="//label[contains(text(),'G.O No. 171')]/following-sibling::div//label[text()='NO']/../input")
	private WebElement GO171NoRb;
	
	@FindBy(xpath="//label[contains(text(),'G.O No. 104')]/following-sibling::div//label[text()='Yes']/../input")
	private WebElement GO104YesRb;
	
	@FindBy(xpath="//label[contains(text(),'G.O No. 104')]/following-sibling::div//label[text()='NO']/../input")
	private WebElement GO104NoRb;
	
	@FindBy(name="address.doorNo")
	private WebElement AddressDnoTb;
	
	@FindBy(name="address.street")
	private WebElement AddressStreetTb;
	
	@FindBy(name="address.city")
	private WebElement cityTb;
	
	@FindBy(name="address.district")
	private WebElement districtDD;
	
	@FindBy(name="address.mandal")
	private WebElement mandalDD;
	
	@FindBy(name="address.pincode")
	private WebElement pincodeTb;
	
	@FindBy(name="sscBoard")
	private WebElement sscBoardDD;
	
	@FindBy(name="sscHallticketNo")
	private WebElement sscHallTicketNoTb;
	
	@FindBy(name="sscDateOfPass")
	private WebElement sscDateOfPassDD;
	
	@FindBy(name="examCenterCode1")
	private WebElement examCentre1DD;
	
	@FindBy(name="examCenterCode2")
	private WebElement examCentre2DD;
	
	@FindBy(name="examCenterCode3")
	private WebElement examCentre3DD;
	
	@FindBy(xpath="//button[.='Update OTPR']")
	private WebElement updateOtprBtn;
	
	public OTPRpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getCanndidateNameTb() {
		return canndidateNameTb;
	}

	public WebElement getFatherNameTb() {
		return fatherNameTb;
	}

	public WebElement getImageUploadBtn() {
		return imageUploadBtn;
	}

	public WebElement getMotherNameTb() {
		return motherNameTb;
	}

	public WebElement getMaleRadioBtn() {
		return maleRadioBtn;
	}

	public WebElement getFemaleRadioBtn() {
		return femaleRadioBtn;
	}

	public WebElement getTransgenderRadioBtn() {
		return transgenderRadioBtn;
	}

	public WebElement getCommunityDD() {
		return communityDD;
	}

	public WebElement getMobileNoTb() {
		return mobileNoTb;
	}

	public WebElement getEmailTb() {
		return emailTb;
	}

	public WebElement getMaritalStatusCodeTb() {
		return maritalStatusCodeTb;
	}

	public WebElement getAdharNoTb() {
		return adharNoTb;
	}

	public WebElement getReligionCodeDD() {
		return religionCodeDD;
	}

	public WebElement getSportsManYesRb() {
		return sportsManYesRb;
	}

	public WebElement getSportsManNoRb() {
		return sportsManNoRb;
	}

	public WebElement getExServiceManYesRb() {
		return exServiceManYesRb;
	}

	public WebElement getExServiceManNoRb() {
		return exServiceManNoRb;
	}

	public WebElement getNccYesRb() {
		return NccYesRb;
	}

	public WebElement getNccNoRb() {
		return NccNoRb;
	}

	public WebElement getEmployedYesRb() {
		return employedYesRb;
	}

	public WebElement getEmployedNoRb() {
		return employedNoRb;
	}

	public WebElement getTemporaryEmpYesRb() {
		return temporaryEmpYesRb;
	}

	public WebElement getTemporaryEmpNoRb() {
		return temporaryEmpNoRb;
	}

	public WebElement getDiffAbledYesRb() {
		return diffAbledYesRb;
	}

	public WebElement getDiffAbledNoRb() {
		return diffAbledNoRb;
	}

	public WebElement getRegularRb() {
		return RegularRb;
	}

	public WebElement getPrivatRb() {
		return PrivatRb;
	}

	public WebElement getForthClassDD() {
		return forthClassDD;
	}

	public WebElement getFifthClassDD() {
		return fifthClassDD;
	}

	public WebElement getSixthClassDD() {
		return sixthClassDD;
	}

	public WebElement getSeventhClassDD() {
		return seventhClassDD;
	}

	public WebElement getEightClassDD() {
		return eightClassDD;
	}

	public WebElement getNinthClassDD() {
		return ninthClassDD;
	}

	public WebElement getTenthClassDD() {
		return tenthClassDD;
	}

	public WebElement getLocalDistrictDD() {
		return localDistrictDD;
	}

	public WebElement getGO171YesRb() {
		return GO171YesRb;
	}

	public WebElement getGO171NoRb() {
		return GO171NoRb;
	}

	public WebElement getGO104YesRb() {
		return GO104YesRb;
	}

	public WebElement getGO104NoRb() {
		return GO104NoRb;
	}

	public WebElement getAddressDnoTb() {
		return AddressDnoTb;
	}

	public WebElement getCityTb() {
		return cityTb;
	}

	public WebElement getDistrictDD() {
		return districtDD;
	}

	public WebElement getMandalDD() {
		return mandalDD;
	}

	public WebElement getPincodeTb() {
		return pincodeTb;
	}

	public WebElement getSscBoardDD() {
		return sscBoardDD;
	}

	public WebElement getSscHallTicketNoTb() {
		return sscHallTicketNoTb;
	}

	public WebElement getSscDateOfPassDD() {
		return sscDateOfPassDD;
	}

	public WebElement getExamCentre1DD() {
		return examCentre1DD;
	}

	public WebElement getExamCentre2DD() {
		return examCentre2DD;
	}

	public WebElement getExamCentre3DD() {
		return examCentre3DD;
	}

	public WebElement getUpdateOtprBtn() {
		return updateOtprBtn;
	}
	
	@FindBy(xpath="//button[.='OK']")
	private WebElement oKBtn;
	
	
	public WebElement getoKBtn() {
		return oKBtn;
	}
	
	public WebElement getAdressStreet() {
		return AddressStreetTb;
	}

	@FindBy(xpath="//input[@name='dateOfBirth']")
	private WebElement dateOfBirhCalender;
	
	@FindBy(xpath="//div[@class='ant-picker-header-view']/button[2]")
	private WebElement yearDob;
	
	@FindBy(xpath="//div[@class='ant-picker-header-view']/button[1]")
	private WebElement monthDob;

	@FindBy(xpath="//button[@class='ant-picker-header-super-prev-btn']")
	private WebElement yearPreviousBtnDob;
	
	@FindBy(xpath="//button[@class='ant-picker-header-prev-btn']")
	private WebElement monthPreviousBtnDob;
	
	
	public WebElement getDateOfBirhCalender() {
		return dateOfBirhCalender;
	}

	public WebElement getYearDob() {
		return yearDob;
	}

	public WebElement getMonthDob() {
		return monthDob;
	}

	public WebElement getYearPreviousBtnDob() {
		return yearPreviousBtnDob;
	}

	public WebElement getMonthPreviousBtnDob() {
		return monthPreviousBtnDob;
	}

	Faker fk=new Faker();
	WebDriverLibrary wl=new WebDriverLibrary();
	//BusinessLibrary
	public void enterOTPRDetailsandSubmit(WebDriver driver) throws InterruptedException
	{
		canndidateNameTb.sendKeys(fk.name().firstName());
		fatherNameTb.sendKeys(fk.name().fullName());
		imageUploadBtn.sendKeys("C:\\Users\\TRINING-23\\IMG-20180426-WA0000_50.jpg");
		oKBtn.click();
		motherNameTb.sendKeys(fk.name().fullName());
		
//		String monthex="Apr";
//		String yearex="1996";
//		String  date="19";
		
//		WebElement dob=driver.findElement(By.xpath("//input[@name='dateOfBirth']"));
		wl.mouseHoverOn(driver, dateOfBirhCalender);
		dateOfBirhCalender.click();
		
//		WebElement year=driver.findElement(By.xpath("//div[@class='ant-picker-header-view']/button[2]"));
//		wl.waitForElementToBeVisible(driver, year);
//		
//		String Year=year.getText();
//		String Month=driver.findElement(By.xpath("//div[@class='ant-picker-header-view']/button[1]")).getText();
//		
//		while(!Year.equals(""+yearex+"")){
//			
//				WebElement elearrBtn=driver.findElement(By.xpath("//button[@class='ant-picker-header-super-prev-btn']"));
//				elearrBtn.click();
//				Year=driver.findElement(By.xpath("//div[@class='ant-picker-header-view']/button[2]")).getText();
//				while(!Month.equals(""+monthex+"")) 
//				{
//					driver.findElement(By.xpath("//button[@class='ant-picker-header-prev-btn']")).click();
//					Month=driver.findElement(By.xpath("//div[@class='ant-picker-header-view']/button[1]")).getText();
//				}
//		}
//		System.out.println(Year+Month);
//		driver.findElement(By.xpath("//td/div[.='"+date+"']")).click();
		selectDobInCalendar("29", "Feb", "2000", driver);
		maleRadioBtn.click();
		wl.handleDropdown("BC-D", communityDD);
		mobileNoTb.sendKeys("9247100100");
		emailTb.sendKeys("abc@gmail.com");
		wl.handleDropdown(maritalStatusCodeTb, 1);
		adharNoTb.sendKeys("551563362541");
		wl.handleDropdown(religionCodeDD, 2);
		sportsManNoRb.click();
		exServiceManNoRb.click();
	
	wl.scrollAction(driver);
	Thread.sleep(1000);
		//wl.waitForElementToBeClickable(driver, NccNoRb);
		NccNoRb.click();	
		employedNoRb.click();
		temporaryEmpNoRb.click();
		diffAbledNoRb.click();
		RegularRb.click();
		wl.handleDropdown(forthClassDD, 2);
		wl.handleDropdown(fifthClassDD, 2);
		wl.handleDropdown(sixthClassDD, 2);
		wl.handleDropdown(seventhClassDD, 2);
		wl.handleDropdown(eightClassDD, 2);
		wl.handleDropdown(ninthClassDD, 2);
		wl.handleDropdown(tenthClassDD, 2);
	wl.scrollAction(driver);
	Thread.sleep(1000);
		GO171NoRb.click();
		GO104NoRb.click();
		AddressDnoTb.sendKeys(fk.number().digits(2));
		AddressStreetTb.sendKeys(fk.address().firstName());
		cityTb.sendKeys(fk.address().cityName());
		wl.handleDropdown(districtDD, 2);
		wl.handleDropdown(mandalDD, 2);
		pincodeTb.sendKeys("500062");
		wl.handleDropdown(sscBoardDD, 2);
		sscHallTicketNoTb.sendKeys(fk.number().digits(5));
		wl.handleDropdown("2011", sscDateOfPassDD);
		wl.handleDropdown(examCentre1DD, 1);
		wl.handleDropdown(examCentre2DD, 2);
		wl.handleDropdown(examCentre3DD, 3);
	wl.scrollAction(driver);
	Thread.sleep(1000);
	
		updateOtprBtn.click();
	}
	
	
	public void selectDobInCalendar(String exDate,String exMonth,String exYear,WebDriver driver) throws InterruptedException
	{
		String year=yearDob.getText();
		String month=monthDob.getText();
		while(!year.equals(exYear)) {
			yearPreviousBtnDob.click();
			year=yearDob.getText();
		}
		while(!month.equals(exMonth)) {
			monthPreviousBtnDob.click();
			month=monthDob.getText();
		}
		driver.findElement(By.xpath("//td/div[.='"+exDate+"']")).click();
	}
	
}
