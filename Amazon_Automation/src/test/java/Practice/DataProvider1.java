package Practice;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Genric_Utility.Property_File;

public class DataProvider1 {
	
	
	@Test(dataProvider="dataProvider_Test")
	public void companyDetails(String name, String phone,String email ) throws InterruptedException, IOException
	{
	
	

	String Key="webdriver.chrome.driver";
	String Value="./chromedriver.exe";
	System.setProperty(Key, Value);
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	
	Property_File plib=new Property_File();
	String URL=plib.getPropertyKeyValue("url");
    String USERNAME=plib.getPropertyKeyValue("username");
	String PASSWORD=plib.getPropertyKeyValue("password");
	
	driver.get(URL);
	
	
     driver.findElement(By.name("user_name")).sendKeys("admin");
     driver.findElement(By.name("user_password")).sendKeys("admin");		
     driver.findElement(By.id("submitButton")).click();

     driver.findElement(By.linkText("Organizations")).click();
     driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
     
     driver.findElement(By.name("accountname")).sendKeys(name);
     driver.findElement(By.name("phone")).sendKeys(phone);

     driver.findElement(By.id("email1")).sendKeys(email);


 	driver.findElement(By.xpath("//input[@title='Save [Alt+S]'][1]")).click();
 	driver.quit();
 	Thread.sleep(2000);
     
}
	@DataProvider
public Object[][] dataProvider_Test()
{
	Object[][] objArr=new Object[3][3];
	
	
	objArr[0][0]="AAA";
    objArr[0][1]="8985658985";
    objArr[0][2]="SK87@gmail.com";
    
    
    objArr[1][0]="bbb";
    objArr[1][1]="897452145";
    objArr[1][2]="jkumar@gmail.com";
    
    objArr[2][0]="ccc";
    objArr[2][1]="9636256589";
    objArr[2][2]="bkgup@gmail.com";
   
    
    return objArr;
	
	
}
	
}