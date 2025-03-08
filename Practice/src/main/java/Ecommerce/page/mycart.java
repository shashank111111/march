package Ecommerce.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Ecommerce.abstractclass.Abstractclass;

public class mycart extends Abstractclass{

	WebDriver driver;
	public mycart(WebDriver driver) {
		super(driver);
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="(//button[@class= 'btn btn-primary'])[3]")
	WebElement wait;
	@FindBy(xpath="(//button[@class= 'btn btn-primary'])[3]")
	WebElement submit;
	
	public payment submit() {
		mycart my= new mycart(driver);
		my.wait2(wait);
		submit.click();
		payment pay = new payment(driver);
		return pay;
	}
}
