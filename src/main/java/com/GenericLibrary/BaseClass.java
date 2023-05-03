package com.GenericLibrary;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	public ExcelFileLibrary excelFileLibrary=new ExcelFileLibrary();
	public JavaLibrary javaLibrary=new JavaLibrary();
	public PropertiesFileLibrary propertyFileLibrary=new PropertiesFileLibrary();
	public WebDriverLibrary  webDriverLibrary=new WebDriverLibrary();
	public WebDriver driver;
	public static  WebDriver sDriver;
	
	@BeforeSuite
	public void bsConfig()
	{
		
	}
	
	
	@BeforeClass
	public void bcConfig() throws IOException
	{
		String BROWSER=propertyFileLibrary.readDatafromPropertyFile("browser");
		String URL=propertyFileLibrary.readDatafromPropertyFile("url");
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			Reporter.log(BROWSER+" browser launched Successfuly",true);
		}
		else if(BROWSER.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
			Reporter.log(BROWSER+" browser launched Successfuly",true);
		}
		else {Reporter.log("Invaid Browser",true);}
		sDriver=driver;
		webDriverLibrary.maximizeWindow(driver);
		webDriverLibrary.waitForPageLoad(driver);
		driver.get(URL);
	}
	
	@BeforeMethod
	public void  bConfiig()
	{
		
	}
	
	@AfterMethod
	public void amConfig()
	{
		
	}
	
	@AfterClass
	public void acConfig()
	{
		driver.quit();
		Reporter.log("Browser closed Successfully");
	}
	
	@AfterSuite
	public void assSuite()
	{
		
	}
	
	

}
