package Practice;

import org.testng.annotations.Test;

public class SameTest2 {

	@Test                                //Here all test will be passed But
	public void createCustomer()
	{
		
		System.out.println("Customer Created");
	}
	
	@Test(dependsOnMethods ="createCustomer")
	public void modifyCustomer()
	{
		
		System.out.println("Customer Modified");
	}
	
	@Test(dependsOnMethods ="createCustomer")
	public void deleteCustomer()
	{
		
		System.out.println("Customer Deleted");
	}

}