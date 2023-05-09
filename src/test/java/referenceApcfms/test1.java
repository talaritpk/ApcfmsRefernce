package referenceApcfms;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ObjectRepository.OTPRpage;

import genericLibrary.BaseClass;

@Listeners(genericLibrary.ListenerImplementationClass.class)
public class test1 extends BaseClass {
	
	@Test(groups="smokeSuite")
	public void apcfss() throws InterruptedException
	{
		OTPRpage page=new OTPRpage(driver);
		page.enterOTPRDetailsandSubmit(driver);
//		webDriverLibrary.mouseHoverOn(driver, page.getDateOfBirhCalender());
		//page.getDateOfBirhCalender().click();
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		String js="arguments[0].setAttribute('value','19-04-1996')";
//		jse.executeScript(js,page.getDateOfBirhCalender());
		
//		page.selectDobInCalendar("29", "Feb", "2000", driver);
		
	}
	
//	@Test(groups={"regressionSuite","smokeSuite"})
//	public void appcffms1() throws InterruptedException
//	{
//		String month="May";
//		String year="1996";
//		driver.findElement(By.name("dateOfBirth")).click();
//		WebElement ele=driver.findElement(By.xpath("//button[text()='2005']"));
//		while(!ele.isDisplayed())
//		{
//			
//			WebElement elearrBtn=driver.findElement(By.xpath("//button[@class='ant-picker-header-super-prev-btn']"));
//			elearrBtn.click();
//		}
//		
//	}
	
	
	
	
	
//	JavascriptExecutor jsExecutor=(JavascriptExecutor)driver;
//	String toenable = "document.getElementsByName('dateOfBirth')[0].setValue('11-03-2005');";
//	jsExecutor.executeScript("document.getElementsByName('dateOfBirth')[0].setValue('11-03-2005');");
	
	
	

}
