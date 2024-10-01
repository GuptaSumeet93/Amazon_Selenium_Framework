package Cart;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Genric_Utility.BaseClass2;

@Test
public class YourItems extends BaseClass2
{
	
	@Test
	public void BuyItAgain() throws InterruptedException
	{
		
		
		driver.findElement(By.id("nav-cart")).click();

		driver.findElement(By.xpath("//*[@id=\"sc-buy-it-again-caption\"]/a[1]")).click();
		
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"sc-saved-cart-caption\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"activeCartViewForm\"]/div[1]/p[1]/a[1]")).click();

		
		
		driver.close();

	}
	
	
}

