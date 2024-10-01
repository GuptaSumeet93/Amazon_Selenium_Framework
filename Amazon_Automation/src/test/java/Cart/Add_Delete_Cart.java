package Cart;

import org.testng.annotations.Test;

import Genric_Utility.BaseClass2;
import Object_Repo.Search_Anything;

@Test
public class Add_Delete_Cart extends BaseClass2
{
	
	
	@Test
	public void accDetails() throws InterruptedException {
	
	
		
	
	Search_Anything any=new Search_Anything(driver);
   any.Get_Search(driver);
   
   any.Delete_Item();
   

	Thread.sleep(3000);
	driver.close();
	
	
}

}
