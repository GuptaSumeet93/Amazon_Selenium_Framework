package Practice;

import org.testng.annotations.Test;

public class SameTest3 {


	@Test                                //Here all test will be passed But it skip he other two methods 
	public void createCustomer()
	{
		int []arr= {1,2,3};
		System.out.println(arr[5]);
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