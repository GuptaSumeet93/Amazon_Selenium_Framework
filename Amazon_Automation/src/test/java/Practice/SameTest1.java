package Practice;

import org.testng.annotations.Test;

@Test //Here we don't write @Test to all method to reduce the no. of line and for time saving
public class SameTest1 {


	
	public void createCustomer()
	{
		
		System.out.println("Customer Created");
	}
	
	
	public void modifyCustomer()
	{
		
		System.out.println("Customer Modified");
	}
	
	
	public void deleteCustomer()
	{
		
		System.out.println("Customer Deleted");
	}

}
