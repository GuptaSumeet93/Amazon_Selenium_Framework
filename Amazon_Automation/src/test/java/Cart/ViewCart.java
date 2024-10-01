package Cart;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Genric_Utility.BaseClass2;

@Test
public class ViewCart extends BaseClass2
{
	
	@Test
	public void ViewYourCart()
	{
		driver.findElement(By.id("nav-cart")).click();
		driver.close();


	}
	
	
}

