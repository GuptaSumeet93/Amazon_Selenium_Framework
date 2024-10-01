package Practice;

import org.testng.annotations.Test;

public class SampleTestInvok {


	@Test(invocationCount = 3)                       
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
