package Ecommerce.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Ecommerce.abstractclass.Abstractclass;

public class product extends Abstractclass {

	
		WebDriver driver;
		public product(WebDriver driver)
		{
			super(driver);
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="(//button[@class = 'btn w-10 rounded'])[1]")
		WebElement submit;
		@FindBy(css="#toast-container")
		WebElement element;
		
		public mycart AddToCart()
		{
			product p = new product(driver);
			p.wait2(submit);
			submit.click();
			p.wait1(element);
			p.cart();
			mycart my = new mycart(driver);
		//	my.submit();
			return my;
		}

	}
