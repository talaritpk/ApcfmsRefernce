package genericLibrary;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
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
		test.log(Status.PASS,MarkupHelper.createLabel(methhodName+" is Passed"+" ", ExtentColor.GREEN));
	}

	public void onTestFailure(ITestResult result) {
		WebDriverLibrary webDriverLibrary=new WebDriverLibrary();
		 String methodName=result.getMethod().getMethodName()+" "+javaLibrary.getSystemDateInFormat();
		try {
			String path=webDriverLibrary.takeScreensot(BaseClass.sDriver, methodName);
			test.addScreenCaptureFromPath(path);
			test.log(Status.FAIL, MarkupHelper.createLabel(methodName+" Test case FAILED due to below isssues", ExtentColor.RED));
			test.fail(result.getThrowable());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, result.getMethod().getMethodName()+" go Skipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		ExtentSparkReporter htmlReport=new ExtentSparkReporter(".\\target\\ExtentReports\\"+"Test Report -"+javaLibrary.getSystemDateInFormat()+".html");
		htmlReport.config().setDocumentTitle("Execution Reports For APCFMS");
		htmlReport.config().setTheme(Theme.STANDARD);
		htmlReport.config().setReportName("APCFMS  Execution Reports");
		
		reports =new ExtentReports();
		reports.attachReporter(htmlReport);
		reports.setSystemInfo("Base Browser", "Chrome");
		reports.setSystemInfo("Base Environment", "QA Testing");
		reports.setSystemInfo("Base URL", "");
		reports.setSystemInfo("OS", "Windows");
		reports.setSystemInfo("Base Platform", "Windows");
		reports.setSystemInfo("Reporter Name", "Pavan Kumar T");
	}

	public void onFinish(ITestContext context) {
		Reporter.log("Execution is Finished",true);
		reports.flush();
	}

	

}
