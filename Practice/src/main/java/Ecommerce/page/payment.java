package Ecommerce.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Ecommerce.abstractclass.Abstractclass;

public class payment extends Abstractclass {
	WebDriver driver;
	public payment(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className="payment")
	WebElement payment1;
	@FindBy(xpath="(//input[@class='input txt text-validated'])[2]")
	WebElement submit;
	
	public Confirmation paymentpage(String country)
	{
		payment p = new payment(driver);
		p.wait2(payment1);
		submit.sendKeys(country);
List<WebElement> a = driver.findElements(By.xpath("//section[@class='ta-results list-group ng-star-inserted']"));
		
		for(WebElement b: a)
		{
			String c= b.getText();
			if(c.contains(country))
			{
			b.click();
			}
		}
		driver.findElement(By.xpath("//a[@class='btnn action__submit ng-star-inserted']")).click();
		Confirmation c = new Confirmation(driver);
		return c;
		
		
	}


}
