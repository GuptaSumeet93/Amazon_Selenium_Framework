package Object_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
@Test
public class YourOrders 
{

	 public YourOrders(WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
	}
	
	 @FindBy(partialLinkText ="Subscribe & Save")
private WebElement subscribe_Save;


@FindBy(partialLinkText="Orders")
private WebElement Orders;

@FindBy(partialLinkText ="Buy Again")
private WebElement Buy_Again;


@FindBy(partialLinkText ="Not Yet Shipped")
private WebElement NotYetShipped;



@FindBy(partialLinkText ="Cancelled Orders")
 WebElement Cancelled_Order;

//Getters Method

public WebElement getOrders() {
	return Orders;
}
public WebElement getBuy_Again() {
	return Buy_Again;
}


public WebElement getsubscribe_Save() {
	return subscribe_Save;
}
public WebElement getNotYetShipped() {
	return NotYetShipped;
}

public WebElement getCancelled_Order() {
	return Cancelled_Order;
}







/**
 * @throws InterruptedException 
 * 
 */

public void Orders_Detail(WebDriver driver) throws InterruptedException
{
	Buy_Again.click();
	
	Thread.sleep(2000);	
	
	subscribe_Save.click();
	
	driver.navigate().back();

	NotYetShipped.click();
	Thread.sleep(2000);	

	Cancelled_Order.click();
	Thread.sleep(2000);	


	Orders.click();
	
}
}
