import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class appointment {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://katalon-demo-cura.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("btn-make-appointment")).click();
	String s =	driver.findElement(By.xpath("(//input[@placeholder='Username'])[1]")).getText();
	driver.findElement(By.xpath("(//input[@placeholder='Username'])[2]")).sendKeys("John Doe");
	String s1 = driver.findElement(By.xpath("(//input[@placeholder='Password'])[1]")).getText();
	driver.findElement(By.xpath("(//input[@placeholder='Password'])[2]")).sendKeys("ThisIsNotAPassword");
	driver.findElement(By.id("btn-login")).click();
	WebElement a= driver.findElement(By.id("combo_facility"));
	Select s3 = new Select(a);
	s3.selectByIndex(1);
//	Thread.sleep(10000);
//	driver.findElement(By.cssSelector("div.form-group")).click();
	driver.findElement(By.id("chk_hospotal_readmission")).click();
	driver.findElement(By.xpath("//input[@name='visit_date']")).click();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".datepicker"))));
	String month = driver.findElement(By.className("datepicker-switch")).getText();
	while(!(month.startsWith("Aug")))
	{
		driver.findElement(By.cssSelector("th.next")).click();
		month = driver.findElement(By.className("datepicker-switch")).getText();
	}
	List<WebElement> dates = driver.findElements(By.cssSelector("td.day"));
	for(WebElement date: dates)
	{
		if(date.getText().equals("19"))
		{
			date.click();
			break;
		}
	}
	driver.close();
	
	
	
	}

}
