package Ecommerce.components;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import Ecommerce.page.LandingPage;

public class Basetest {
	WebDriver driver;
	public LandingPage landing;
/*	public WebDriver initilize() throws IOException
	{
	
	Properties p = new Properties();
	File f = new File("../Practice/src/main/java/Globaldata.properties");
	FileReader fr = new FileReader(f);
	p.load(fr);
	String browsername = p.getProperty("browser");
	
	if(browsername.equalsIgnoreCase("chorme"))
	{
	//	WebDriver.ChromeDriver.setup();
		driver = new ChromeDriver();
	//	this.driver = driver;
	}
	
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().window().maximize();
	return driver;
	
	}
	
	*/
	
//		@BeforeMethod
	    public WebDriver setup() {
	        driver = new ChromeDriver();
	        return driver;
	    }

    
    @BeforeMethod(alwaysRun=true)
	public LandingPage launch() throws IOException
	
	{
		driver = setup();
		landing = new LandingPage(driver);
		landing.land();
		return landing;
	}
	
    public String getss(String tc) throws IOException
    {
    	TakesScreenshot ts = (TakesScreenshot)driver;
    	File source = ts.getScreenshotAs(OutputType.FILE);
    	File destination = new File("../Practice/report"+tc+".png");
    	
    	FileUtils.copyFile(source,destination);
    	return "../Practice/report\"+tc+\".png";
    }


	

}
