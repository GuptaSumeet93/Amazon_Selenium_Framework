package Account;

import org.testng.annotations.Test;

import Genric_Utility.BaseClass2;
import Object_Repo.Account_Page;
import Object_Repo.Amazon_Pay;
import Object_Repo.Contact_Us;
import Object_Repo.YourOrders;

@Test
public class Amazon_Pay_Balance extends BaseClass2
{
	
	
	@Test
	public void accDetails() throws InterruptedException {
	
	
	Account_Page acc=new Account_Page(driver);
	
	acc.Cus_AccDetails();
	
	Amazon_Pay pay=new Amazon_Pay(driver);
	
   pay.Pay_Balance(driver);
	Thread.sleep(10000);
	//driver.close();
	
	
}

}
