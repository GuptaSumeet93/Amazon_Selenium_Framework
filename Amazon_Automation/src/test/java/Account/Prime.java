package Account;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Genric_Utility.BaseClass2;
import Genric_Utility.WebDriver_File;
import Object_Repo.Account_Page;

@Test
public class Prime extends BaseClass2
{
	
	
	@Test
	void prime() throws InterruptedException
	{
		WebDriver_File file=new WebDriver_File();
		
		file.maximizeScreen(driver);

		Account_Page acc=new Account_Page(driver);
		acc.Cus_AccDetails();

		
		
		driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[1]/div[1]/div[2]/div[3]/a[1]/div[1]/div[1]")).click();
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		driver.close();

		
	}
	
}

