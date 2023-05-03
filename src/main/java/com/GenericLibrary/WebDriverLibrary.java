package com.GenericLibrary;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * This class contains generic methods related to web driver actions
 * @author T Pavan Kumar
 *
 */
public class WebDriverLibrary {

	/**
	 * This method is used to maximize the window
	 * 
	 * @param driver
	 */
	public void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}

	/**
	 * This method is used to minimize the window
	 * 
	 * @param driver
	 */
	public void minimizeWindow(WebDriver driver) {
		driver.manage().window().minimize();
	}

	/**
	 * This method will wait for 10 seconds to load the page
	 * 
	 * @param driver
	 */
	public void waitForPageLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	/**
	 * This method will wait 10 seconds for an element to be visible
	 * 
	 * @param driver
	 * @param element
	 */
	public void waitForElementToBeVisible(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElements(element));
	}

	/**
	 * This method will wait 10 seconds for an element to be clickable
	 * 
	 * @param driver
	 * @param element
	 */
	public void waitForElementToBeClickable(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	/**
	 * This method is used to select drop-down by the index value
	 * 
	 * @param element
	 * @param index
	 */
	public void handleDropdown(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	/**
	 * This method is used to select drop-down by the text value
	 * 
	 * @param element
	 * @param index
	 */
	public void handleDropdown(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByValue(text);
	}

	/**
	 * This method is used to select drop-down by the Visible text value
	 * 
	 * @param element
	 * @param index
	 */
	public void handleDropdown(String text, WebElement element) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}

	/**
	 * The method is used to hover the cursor on a given element.
	 * 
	 * @param driver
	 * @param element
	 */
	public void mouseHoverOn(WebDriver driver, WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		;
	}

	/**
	 * The method is used to perform right click action on the given element.
	 * 
	 * @param driver
	 * @param element
	 */
	public void rightClickOn(WebDriver driver, WebElement element) {
		Actions action = new Actions(driver);
		action.contextClick(element).perform();
		;
	}

	/**
	 * The method is used to perform right click action.
	 * 
	 * @param driver
	 * @param element
	 */
	public void rightClick(WebDriver driver) {
		Actions action = new Actions(driver);
		action.contextClick().perform();
		;
	}

	/**
	 * The method is used to perform double click action on the given element.
	 * 
	 * @param driver
	 * @param element
	 */
	public void doubleClick(WebDriver driver, WebElement element) {
		Actions action = new Actions(driver);
		action.doubleClick(element).perform();
	}

	/**
	 * The method is used to perform double click action.
	 * 
	 * @param driver
	 * @param element
	 */
	public void doubleClick(WebDriver driver) {
		Actions action = new Actions(driver);
		action.doubleClick().perform();
	}

	/**
	 * The method is used to perform right click action on the given element.
	 * 
	 * @param driver
	 * @param element
	 */
	public void dragAndDrop(WebDriver driver, WebElement sourceElement, WebElement destinationElement) {
		Actions action = new Actions(driver);
		action.dragAndDrop(sourceElement, destinationElement);
	}

	/**
	 * This method is will mouse hover using offset values for x and y coordinates
	 * 
	 * @param driver
	 * @param xOff
	 * @param yOff
	 */
	public void mouseHoverOn(WebDriver driver, int xOff, int yOff) {
		Actions actions = new Actions(driver);
		actions.moveByOffset(xOff, yOff);
	}

	/**
	 * This method is for switching to a frame by index value of frame
	 * 
	 * @param driver
	 * @param index
	 */
	public void switchToFrame(WebDriver driver, int index) {
		driver.switchTo().frame(index);
	}

	/**
	 * This method is for switching to a frame by name or id of frame
	 * 
	 * @param driver
	 * @param index
	 */
	public void switchToFrame(WebDriver driver, String nameOrId) {
		driver.switchTo().frame(nameOrId);
	}

	/**
	 * This method is for switching to a frame based on frame
	 * 
	 * @param driver
	 * @param index
	 */
	public void switchToFrame(WebDriver driver, WebElement element) {
		driver.switchTo().frame(element);
	}

	/*
	 * This method is for switching to the parent frame.
	 */
	public void swithToParentFrame(WebDriver driver) {
		driver.switchTo().parentFrame();
	}

	/**
	 * This method is for switching to the default frame.
	 * 
	 * @param driver
	 */
	public void switchTooDefaultFrame(WebDriver driver) {
		driver.switchTo().defaultContent();
	}

	/**
	 * This method is used to accept the the alert.
	 */
	public void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}

	/**
	 * This method is used to dismiss the the alert.
	 */
	public void dismissAlert(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}

	/**
	 * This method will return the text of alert pop up to the caller
	 * 
	 * @param driver
	 * @return
	 */
	public String getAlertText(WebDriver driver) {
		return driver.switchTo().alert().getText();
	}

	/**
	 * This method is for press the enter key.
	 * 
	 * @throws AWTException
	 */
	public void pressEnter() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	/**
	 * This method will switch from parent window to any child window or from any
	 * child window to parent window based on the partial window title.
	 * 
	 * @param driver
	 * @param partialWindowTitle
	 */
	public void switchToWindow(WebDriver driver, String partialWindowTitle) {
		Set<String> windowIds = driver.getWindowHandles();
		Iterator<String> iterator = windowIds.iterator();
		while (iterator.hasNext()) {
			String windowId = iterator.next();
			String currentwindowTitle = driver.switchTo().window(windowId).getTitle();
			if (currentwindowTitle.contains(partialWindowTitle))
				break;
		}
	}

	/**
	 * This method is for taking the screenshot
	 * 
	 * @param driver
	 * @param screeenshotName
	 * @throws IOException
	 */
	public String takeScreensot(WebDriver driver, String screeenshotName) throws IOException {
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destination = new File(".\\target\\ScreenShots\\" + screeenshotName + ".png");
		FileUtils.copyFile(source, destination);
		return destination.getAbsolutePath();
	}

	/**
	 * This method is used for scrolling action based on element.
	 * 
	 * @param driver
	 * @param element
	 */
	public void scrollTillElement(WebDriver driver, WebElement element) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
	}

}
