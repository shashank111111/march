package package1;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Ecommerce {
	@Test
	public void ecommerce()
	{
		String email ="shashank19agrawal@gmail.com";
		String password = "258369Qp@";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ecommerce-playground.lambdatest.io/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//span[@class='title'])[32]")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("(//input[@type='text' or @name='search'])[1]")).sendKeys("iphone");
		driver.findElement(By.xpath("//button[@type='submit' and @class='type-text']")).click();
		driver.findElement(By.xpath("(//img[@class='lazy-load'])[1]")).click();
		String price = driver.findElement(By.xpath("//h3[@data-update='price']")).getText();
		System.out.println(price);

	}

}
