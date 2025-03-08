package Ecommerce;

import java.io.File;
import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Ecommerce.components.Basetest;
import Resources.ExtentReportNG;

public class Listners extends Basetest implements ITestListener {
	ExtentReports extent = ExtentReportNG.report();
	ExtentTest test;
	  @Override
	    public void onTestStart(ITestResult result) {
		 test = extent.createTest(result.getMethod().getMethodName());
		 
	    }

	    @Override
	    public void onTestSuccess(ITestResult result) {
	        System.out.println("✅ Test Passed: ");
	        test.log(Status.PASS, "Test passed");
	    }
	    
	    @Override
	    public void onTestFailure(ITestResult result) {
//	      System.out.println(test.fail(result.getThrowable()));
	      try {
		String destination = getss(result.getMethod().getMethodName());
		test.addScreenCaptureFromPath(destination, "safsg");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      
	    }

	    @Override
	    public void onTestSkipped(ITestResult result) {
	        System.out.println("⚠️ Test Skipped: " + result.getName());
	    }
	    
	    @Override
	    public void onFinish(ITestContext context) {
	        extent.flush();

	    }
}
