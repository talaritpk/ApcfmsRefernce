package com.GenericLibrary;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenerImplementationClass implements ITestListener{
	
	ExtentReports reports;
	ExtentTest test;
	JavaLibrary javaLibrary=new JavaLibrary();

	public void onTestStart(ITestResult result) {
		String methhodName=result.getMethod().getMethodName();
		test=reports.createTest(methhodName);
		test.log(Status.INFO, "Execution Of Test Started");
	}

	public void onTestSuccess(ITestResult result) {
		String methhodName=result.getMethod().getMethodName();
		test.log(Status.PASS, methhodName+" is Passed");
	}

	public void onTestFailure(ITestResult result) {
		WebDriverLibrary webDriverLibrary=new WebDriverLibrary();
		String methhodName=result.getMethod().getMethodName()+" "+javaLibrary.getSystemDateIFormat();
		try {
			String path=webDriverLibrary.takeScreensot(BaseClass.sDriver, methhodName);
			test.addScreenCaptureFromPath(path);
			test.log(Status.FAIL, result.getThrowable());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		ExtentSparkReporter htmlReport=new ExtentSparkReporter(".\\target\\ExtentReports\\" +"Report"+javaLibrary.getSystemDateIFormat()+".html");
		htmlReport.config().setDocumentTitle("Execution Reports For APCFMS");
		htmlReport.config().setTheme(Theme.STANDARD);
		htmlReport.config().setReportName("APCFMS  Execution Reports");
		reports =new ExtentReports();
		reports.attachReporter(htmlReport);
		reports.setSystemInfo("Base Browser", "Chrome");
		reports.setSystemInfo("Base Environment", "Testing");
		reports.setSystemInfo("Base URL", "");
		reports.setSystemInfo("Base Platform", "Windows");
		reports.setSystemInfo("Reporter Name", "Pavan Kumar T");
	}

	public void onFinish(ITestContext context) {
		Reporter.log("Execution is Finished",true);
		reports.flush();
	}

	

}
