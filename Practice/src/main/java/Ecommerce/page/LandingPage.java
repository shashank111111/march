package Ecommerce.page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

	WebDriver driver;
	public LandingPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="input#userEmail")
	WebElement user;
	
	@FindBy(css="input#userPassword")
	WebElement password;
	
	@FindBy(css="input#login")
	WebElement submit;
	
	public product login(String email, String pass)
	{
		user.sendKeys(email);
		password.sendKeys(pass);
		submit.click();
	//	product p = new product(driver);
		product p = new product(driver);
	//	p.AddToCart();
		return p;

	}
	
	public void land()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://rahulshettyacademy.com/client");
		driver.manage().window().maximize();
		
	}
}
