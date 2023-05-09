package Pract;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prac {
	@Test
	public void xpath() throws InterruptedException
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver(co);
		//driver.get("https://www.worldometers.info/world-population/");
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		int i=0;
//		while(true)
//		{
//			WebElement ele= driver.findElement(By.xpath("//div[@class='maincounter-number']/span"));
//			System.out.println(ele.getText());
//			i++;
//			//Thread.sleep(200);
//			//ele=driver.findElement(By.xpath("//div[@class='maincounter-number']/span"));
//		}
		
		
		
		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("pavan");
		Thread.sleep(3000);
		
		//System.out.println(driver.findElement(By.xpath("//div[@class='wM6W7d']/span[.='Pawan Kalyan']")).getText());
		List<WebElement> eles=driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
		Set<String>aList =new TreeSet();
		for(WebElement ele:eles)
		{
			 System.out.println(ele);
			aList.add(ele.getText());
		}
		System.out.println(aList);
//		Collections.sort(aList);
		
		
		
		
		
	}

}
