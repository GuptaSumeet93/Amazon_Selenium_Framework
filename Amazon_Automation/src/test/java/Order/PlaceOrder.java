package Order;

import java.io.IOException;
import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Genric_Utility.BaseClass;
import Genric_Utility.WebDriver_File;
import Object_Repo.Vtiger.Home_Page;

public class PlaceOrder extends BaseClass 
{
	@Test
	public void PlaceOrder() throws IOException, InterruptedException
	{
	WebDriver_File wlib= new WebDriver_File();
	wlib.waitForPageLoad(driver);
	wlib.maximizeScreen(driver);
	
	
	Home_Page home=new Home_Page(driver);
	
	home.ProductName();
	
	driver.findElement(By.xpath("(//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal'])[1]")).click();
	Set <String> child = driver.getWindowHandles();
    for(String b:child)
    {
  	  
  	  driver.switchTo().window(b);
    }

	driver.findElement(By.id("add-to-cart-button")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//span[@class='a-button a-button-primary attach-primary-button attach-button-large attach-checkout-button']")).click();
	//driver.findElement(By.xpath("(//input[@name='proceedToRetailCheckout']")).click();
	driver.findElement(By.xpath("(//input[@class='a-button-input'])[6]")).click();  
	driver.findElement(By.xpath("(//input[@name='ppw-instrumentRowSelection'])[3]")).click();

	driver.findElement(By.xpath("//input[@name='__sif_encryptedVPA_collect']")).sendKeys("7903447390@ybl");
	
	driver.findElement(By.name("ppw-widgetEvent:ValidateUpiIdEvent")).click();
	
	WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(10));
	  
	    
	 WebElement ele= driver.findElement(By.xpath("//span[@id='orderSummaryPrimaryActionBtn-announce']"));
	   w.until(ExpectedConditions.elementToBeClickable(ele)).click();
	
		 WebElement ele1= driver.findElement(By.xpath("(//span[text()='Place Your Order and Pay'])[3]"));
		   w.until(ExpectedConditions.elementToBeClickable(ele1)).click();

	
//	driver.findElement(By.xpath("//span[@id='orderSummaryPrimaryActionBtn-announce']")).click();
	


	//driver.findElement(By.xpath("//span[@id='submitOrderButtonId-announce']")).click();


	
	}
}

