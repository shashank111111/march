package Ecommerce.abstractclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Abstractclass {
	WebDriver driver;
	public Abstractclass(WebDriver driver)
	{
		this.driver = driver;
	}

	public void wait1(WebElement ele)
	{
		WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(10));
		wait.until(ExpectedConditions.invisibilityOf(ele));
	}
	
	public void wait2(WebElement elet)
	{
		WebDriverWait wait= new WebDriverWait(driver , Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(elet));
	}
	public void cart()
	{
		driver.findElement(By.xpath("(//button[@class= 'btn btn-custom'])[3]")).click();

	}

}
