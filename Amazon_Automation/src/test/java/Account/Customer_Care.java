package Account;

import org.testng.annotations.Test;

import Genric_Utility.BaseClass2;
import Object_Repo.Account_Page;
import Object_Repo.Contact_Us;
import Object_Repo.YourOrders;

@Test
public class Customer_Care extends BaseClass2
{
	
	
	@Test
	public void accDetails() throws InterruptedException {
	
	
	Account_Page acc=new Account_Page(driver);
	
	acc.Cus_AccDetails();
	
	Contact_Us contact=new Contact_Us(driver);
	
   contact.cus_Care(driver);
	Thread.sleep(10000);
	driver.close();
	
	
}

}
