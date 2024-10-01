package Account;

import org.testng.annotations.Test;

import Genric_Utility.BaseClass2;
import Object_Repo.Account_Page;
import Object_Repo.YourAddress;
import Object_Repo.YourOrders;

@Test
public class Add_Remove_Location extends BaseClass2
{
	
	
	@Test
	public void accDetails() throws InterruptedException {
	
	
	Account_Page acc=new Account_Page(driver);
	
	acc.Cus_AccDetails();
	
	YourAddress choose=new YourAddress(driver);
	
     choose.New_Adress(driver);
	Thread.sleep(3000);
	
	choose.removeAddress();
	Thread.sleep(3000);
	


	
	//driver.close();
	
	
}

}
