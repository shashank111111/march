package Resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportNG {
	
	public static ExtentReports report()
	{
	String path = "../Practice/report/index.html";
	ExtentSparkReporter reporter = new ExtentSparkReporter(path);
	reporter.config().setDocumentTitle("Test Automation");
	reporter.config().setReportName("Shashank");
	ExtentReports extent = new ExtentReports();
	extent.attachReporter(reporter);
	return extent;
	
	
	

}}
