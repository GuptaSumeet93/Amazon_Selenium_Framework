package Object_Repo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Genric_Utility.WebDriver_File;

public class Amazon_Pay {
	
	


	 public Amazon_Pay(WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
	}
	
	
	

		
		@FindBy(xpath="//h2[contains(text(),' Amazon Pay balance')] ")
		private WebElement AmazonPay_Bal;
		 
		
		@FindBy(xpath="//*[@id=\"balanceDetail\"] ")
	    private WebElement Bal_Detail;

		   
		  
		   
		    @FindBy(xpath="//*[@id=\"balanceDetail\"]")
		    private WebElement Gift_Bal;
		    
		    @FindBy(xpath="//*[@id=\"loadMoney\"]")
		    private WebElement Load_Money;
		
		
		

		public WebElement getAmazonPay_Bal() {
			return AmazonPay_Bal;
		}

		

		public WebElement getBal_Detail() {
			return Bal_Detail;
		}

		

		public WebElement getGift_Bal() {
			return Gift_Bal;
		}
		public WebElement getLoad_Money() {
			return Load_Money;
		}
		
	
	
	public void Pay_Balance(WebDriver driver) throws InterruptedException
	{
		AmazonPay_Bal.click();
		
		
		
		//WebDriver_File file=new WebDriver_File();
		
		//file.ExplicitWaitExample(driver);
	Gift_Bal.click();
	//Gift_Bal.sendKeys("2000");
	
//		Load_Money.click();
		Thread.sleep(3000);	

		
		
	}

	
	}


