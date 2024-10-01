package Genric_Utility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Object_Repo.Login_Page;
import Object_Repo.SignUp_Page;
import Object_Repo.Vtiger.Home_Page;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass2 {

	public WebDriver driver;
	@BeforeSuite
	public void BS()
	{
		
		System.out.println("Database connection");
	}
	
	@BeforeTest
	public void BT()
	{
		
		System.out.println("Parrallel execution");
	}
	@BeforeClass
	public void BC() throws IOException
	
	{
		
		Property_File3 plib1=new Property_File3();
		String BROWSER = plib1.getPropertyKeyValue("browser");

		
		
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();			
			
			driver=new ChromeDriver();
		}
		
		else if(BROWSER.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		
		else if(BROWSER.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		
		else
		{
			driver=new ChromeDriver();
		}
		
		
		System.out.println("LAUNCHING BROWSER");
		
	}
	@BeforeMethod
	public void BM() throws IOException, InterruptedException
	{
		WebDriver_File wlib= new WebDriver_File();
		wlib.waitForPageLoad(driver);
		wlib.maximizeScreen(driver);

		Property_File3 plib1=new Property_File3();

        String URL=plib1.getPropertyKeyValue("url");

       // String FirstName=plib1.getPropertyKeyValue("fname");
     //   String MobileNumber=plib1.getPropertyKeyValue("mobile");
        String EmailId=plib1.getPropertyKeyValue("email");
        String PASSWORD=plib1.getPropertyKeyValue("password");
		 driver.get(URL);

        Login_Page	log=new Login_Page(driver);		
		 
        log.Login_To_Web(EmailId,PASSWORD);
		 
		
		System.out.println("sign in  to application");
	}
	
	@AfterMethod
	public void AM()
	{
		
		
		System.out.println("lOGOUT FROM THE APPLN");
	}
	@AfterTest
	public void AT()
	{
		
		System.out.println("Close the browser");
	}
	
	@AfterClass
	public void AC()
	{
		
		System.out.println("Parallel execution ");
	}
		
		@AfterSuite
		public void AS()
		{
			
			System.out.println("Database connection closed");
		}
	
}
