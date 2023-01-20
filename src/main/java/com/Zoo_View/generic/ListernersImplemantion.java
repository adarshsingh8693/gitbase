package com.Zoo_View.generic;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListernersImplemantion  implements ITestListener{
    
	
	ExtentReports report ;
	ExtentTest test;
	
	public void onTestStart(ITestResult result) {
		 String MethodName = result.getMethod().getMethodName(); 
        
          test=report.createTest(MethodName);//add test cases to report
          Reporter.log(MethodName+"------> Testscipt execution started");
		
	}


	public void onTestSuccess(ITestResult result) {
             String MethodName = result.getMethod().getMethodName();
             test.log(Status.PASS,MethodName+"----> Passed");
             Reporter.log(MethodName+"---->Testscript execution successful");
	}

	
	public void onTestFailure(ITestResult result) {
		
		//String currentTestName = result.getMethod().getMethodName();
		String date="screenshot"+new JavaUtility().getSystemDate();
		EventFiringWebDriver edriver=new EventFiringWebDriver(BaseClass.sdriver);
		File src=edriver.getScreenshotAs(OutputType.FILE);
		File path=new File("./Screenshot/"+date+".png");
		String filepath=path.getAbsolutePath();
		try {
			FileUtils.copyFile(src,path);
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		test.addScreenCaptureFromPath(filepath);
		test.log(Status.FAIL,result.getThrowable());
		Reporter.log("--TestScript Execution failed--");
		
	}

	
	public void onTestSkipped(ITestResult result) {
		String MethodName=result.getMethod().getMethodName();
		test.log(Status.SKIP,MethodName+"--Skipped");
		Reporter.log("--TestScript Execution skipped--");      		 
		
	}

	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
		
		
	}

	
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ExtentSparkReporter htmlreport=new ExtentSparkReporter("./ExtentReport/report.html");
		htmlreport.config().setDocumentTitle("SDET-45 Extent Report");
		htmlreport.config().setTheme(Theme.DARK);
		htmlreport.config().setReportName("VTiger Report");
		
		 report = new ExtentReports();
		 report.attachReporter(htmlreport);
		 report.setSystemInfo("Base Browser","Chrome");
		 report.setSystemInfo("OS","Windoiws");
		 report.setSystemInfo("Base-URL","https://localhost:8888");
		 report.setSystemInfo("Reporter Name","Adarsh");
		 
		
		
	}

	
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		report.flush();
		/*try {
			Desktop.getDesktop().browse(new File("./ExtentReport/report.html").toURI());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
	
	
	

}
