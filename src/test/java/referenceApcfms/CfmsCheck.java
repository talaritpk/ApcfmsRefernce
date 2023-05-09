package referenceApcfms;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ObjectRepository.ApcfmsHomePage;

import genericLibrary.BaseClass;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;
@Listeners(genericLibrary.ListenerImplementationClass.class)
public class CfmsCheck extends BaseClass{
	@Test
	public void checkSite() throws IOException
	{
//		ApcfmsHomePage page=new ApcfmsHomePage(driver);
//		page.closeAlert();
//		page.getBudgetPortalLink().sendKeys("pavan");
//		webDriverLibrary.switchToWindowBasedOnUrl(driver, "budget");
//		System.out.println(driver.getTitle());
//		
//		webDriverLibrary.switchToWindowBasedOnTitle(driver, "CFMS");
//		page.getFinancePortalLink().click();
//		
//		webDriverLibrary.switchToWindowBasedOnUrl(driver, "finance");
//		System.out.println(driver.getTitle());
//		
//		webDriverLibrary.switchToWindowBasedOnTitle(driver, "CFMS");
		
		
		WebElement element = null;
		try {
			element=driver.findElement(By.xpath("//i[@class='fa fa fa-newspaper-o']"));
			element.sendKeys("kjdcjd");
			Assert.fail();
		}catch(Exception e) {
			takeScreenShotWhenFailed(driver,element);
		}
		
		
	}
	public void takeScreenShotWhenFailed(WebDriver driver, WebElement webElement ) throws IOException{
	    Screenshot screenshot = new AShot().coordsProvider(new WebDriverCoordsProvider()).takeScreenshot(driver, webElement);
	    ImageIO.write(screenshot.getImage(),"PNG",new File(System.getProperty("user.dir") +"\\Images\\googleLogo.png"));
	}

}
