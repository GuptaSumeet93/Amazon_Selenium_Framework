package All_Category;

import org.testng.annotations.Test;

import Genric_Utility.BaseClass2;
import Object_Repo.All_Categories;

@Test
public class Explore_All extends BaseClass2
{
	
	
	@Test
	public void accDetails() throws InterruptedException {
	
	
		
		All_Categories opt=new All_Categories(driver);
		
		opt.Go_Through_All_Option(driver);
		
	

	Thread.sleep(3000);
	driver.close();
	
	
}

}
