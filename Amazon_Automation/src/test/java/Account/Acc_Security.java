package Account;

import org.testng.annotations.Test;

import Genric_Utility.BaseClass2;
import Object_Repo.Account_Page;
import Object_Repo.Login_Security;
import Object_Repo.YourOrders;

@Test
public class Acc_Security extends BaseClass2
{
	
	
	@Test
	public void accDetails() throws InterruptedException {
	
	
	Account_Page acc=new Account_Page(driver);
	acc.Cus_AccDetails();

	acc.Security();
	
	Thread.sleep(5000);

	
	Login_Security secure=new Login_Security(driver);
	
	secure.Security(driver);

	Thread.sleep(3000);
	
	
}

}
