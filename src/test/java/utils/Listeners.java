package utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listeners implements ITestListener {
	
	ExtentTest test;
	WebDriver driver;
	
	ExtentReports extent = GetExtentReportObj.getExtentReporter();
	
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		 test= extent.createTest(result.getMethod().getMethodName());
		 System.out.println(result.getMethod().getMethodName()+" Started");
		 
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		test.log(Status.PASS, "Test Passed");
		System.out.println(result.getMethod().getMethodName()+" Passed");
		
	}
	
	public void onTestFailure(ITestResult result,WebDriver driver) {
		// TODO Auto-generated method stub
		test.log(Status.FAIL, "Test Failed");

        // Capture screenshot on failure
        driver = (WebDriver) result.getTestContext().getAttribute("WebDriver");
        String screenshotPath = takeScreenshot(result.getMethod().getMethodName(), driver);

        try {
            // Attach screenshot to Extent Report
            test.addScreenCaptureFromPath(screenshotPath);
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }


	public String takeScreenshot(String methodName,WebDriver driver) {
        String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);;
        String destination = System.getProperty("user.dir") +"//target//screenshots//" + methodName + "_" + dateName + ".png";
        File finalDestination = new File(destination);
        try {
            Files.copy(src.toPath(), finalDestination.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return destination;
    }


@Override
public void onFinish(ITestContext context) {
    // Flush the reports to generate the report file
    extent.flush();
}
}
