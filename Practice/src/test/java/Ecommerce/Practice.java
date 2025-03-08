package Ecommerce;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Ecommerce.components.Basetest;
import Ecommerce.data.datareader;
import Ecommerce.page.Confirmation;
import Ecommerce.page.LandingPage;
import Ecommerce.page.mycart;
import Ecommerce.page.payment;
import Ecommerce.page.product;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Practice extends Basetest {

	@Test(dataProvider="getdata",groups="purchase")
	public void submitorder(HashMap<String,String> Input) throws IOException
	{
		//WebDriverManager
	//	WebDriver driver = new ChromeDriver();
		
	//	LandingPage landing = launch();
		product p = landing.login(Input.get("username"),Input.get("password") ); 
		//product p = new product(driver);
	//	p.AddToCart();
		mycart my = p.AddToCart();

	//	driver.findElement(By.xpath("(//button[@class= 'btn btn-custom'])[3]")).click();
//		mycart my = new mycart(driver);
		payment pay = my.submit();
		//payment pay = new payment(driver);
		Confirmation c= pay.paymentpage("India");	
//		Confirmation c = new Confirmation(driver);
		c.confirm();
			}
	
	@DataProvider
	public Object[][] getdata() throws IOException
	{
/*		HashMap<String,String> map = new HashMap<String,String>();
		map.put("username", "shashank19agrawal@gmail.com");
		map.put("password", "258369Qp@");
		HashMap<String,String> map1 = new HashMap<String,String>();
		map1.put("username", "s19@gmail.com");
		map1.put("password","258369Qp@");
		
		*/
		
		datareader d = new datareader();
		HashMap<String,String> data = d.readdata();
		return new Object[][] {{data}};

		
	}

}
