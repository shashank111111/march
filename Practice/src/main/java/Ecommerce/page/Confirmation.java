package Ecommerce.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Confirmation {


		WebDriver driver;
		public Confirmation(WebDriver driver) 
		{
			this.driver=driver;
		}
		
		public void confirm()
		
		{
			String a1= driver.findElement(By.className("hero-primary")).getText();
			Assert.assertEquals(a1, "THNKYOU FOR THE ORDER.");
			driver.close();
		}

	}

