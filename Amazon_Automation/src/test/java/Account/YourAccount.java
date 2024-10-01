package Account;

import org.testng.annotations.Test;

import Genric_Utility.BaseClass2;
import Object_Repo.Account_Page;
import Object_Repo.YourOrders;

@Test
public class YourAccount extends BaseClass2
{
	
	
	@Test
	public void accDetails() throws InterruptedException {
	
	
	Account_Page acc=new Account_Page(driver);
	
	acc.Cus_AccDetails();
	acc.UrOrder();
	
	YourOrders details=new YourOrders(driver);
	
	details.Orders_Detail(driver);

	Thread.sleep(3000);
	driver.close();
	
	
}

}
