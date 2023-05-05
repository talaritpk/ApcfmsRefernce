package genericLibrary;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public ExcelFileLibrary excelFileLibrary=new ExcelFileLibrary();
	public JavaLibrary javaLibrary=new JavaLibrary();
	public PropertiesFileLibrary propertyFileLibrary=new PropertiesFileLibrary();
	public WebDriverLibrary  webDriverLibrary=new WebDriverLibrary();
	public WebDriver driver=null;
	public static  WebDriver sDriver;
	
	@BeforeSuite
	public void bsConfig()
	{
		
	}
	
	//@Parameters("browser")
	@BeforeClass
	public void bcConfig(/*String BROWSER*/) throws IOException
	{
		String BROWSER=propertyFileLibrary.readDatafromPropertyFile("browser");//
		String URL=propertyFileLibrary.readDatafromPropertyFile("url");
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			ChromeOptions chomeOptions=new ChromeOptions();
			chomeOptions.addArguments("--remote-allow-origins=*");
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver(chomeOptions);
			Reporter.log(BROWSER+" browser launched Successfuly",true);
		}
		else if(BROWSER.equalsIgnoreCase("edge"))
		{
			EdgeOptions edgeOptions=new EdgeOptions();
			edgeOptions.addArguments("--remote-allow-origins=*");
			driver=new EdgeDriver(edgeOptions);
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
	public void asSuite()
	{
		
	}
	
	

}
