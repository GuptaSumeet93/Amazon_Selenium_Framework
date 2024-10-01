package Object_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
@Test
public class Login_Security 
{

	 public Login_Security(WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
	}
	
	 
	 
	 @FindBy(partialLinkText ="Your account"
	 		+ "")
     private WebElement Your_Acc;

	 

	    @FindBy(name="cvf_email")
	    private WebElement Entermail;

	  //*[@id="a-autoid-0"]/span[1]/input[1]
	    
	    @FindBy(xpath="//*[@id=\"a-autoid-0\"]/span[1]/input[1]\r\n")
		private WebElement ContniueEmail;
	    
	    @FindBy(xpath="//input[@name='cvf_action'][1]")
		private WebElement VerifyEmail	;
	    
	  //input[@name='cvf_action'][1]
		 
		@FindBy(xpath="//*[@id=\"NAME_BUTTON\"]/span[1]/a[1]")
		private WebElement Name;
		 
		
		@FindBy(id="cnep_1C_submit_button")
	    private WebElement Save_Change;

		@FindBy(name="customerName")
	    private WebElement EnterName;

		
		@FindBy(xpath="//*[@id=\"EMAIL_BUTTON\"]/span[1]/a[1]")
	    private WebElement Email;

		    @FindBy(xpath="//*[@id=\"MOBILE_NUMBER_BUTTON\"]/span[1]/a[1]")
		    private WebElement Pri_Mobile_Key; 		    
		    
		  
		   
		    @FindBy(xpath="//*[@id=\"PASSKEY_BUTTON\"]/span[1]/a[1]")
		    private WebElement Passkey;
		    
		   

		    @FindBy(xpath="//*[@id=\"PASSWORD_BUTTON\"]/span[1]/a[1]")
		    private WebElement Password;
		    
		    @FindBy(xpath="//*[@id=\"TWO_STEP_VERIFICATION_BUTTON\"]/span[1]/a[1]")
		    private WebElement Two_Step_Veification;
		    
		    @FindBy(xpath="//*[@id=\"SECURE_YOUR_ACCOUNT_BUTTON\"]/span[1]/a[1]\r\n"
		    		+ "")
		    private WebElement Compromised_Acc;
		    
		
		    
		    
		   
		 
			public WebElement getName()
		    {
				return Name;
			}
		 
		    public WebElement getEnterName()
		    {
				return EnterName;
			}
		    
		    
		    public WebElement getSave_Change() {
				return Save_Change;
			}
		    
		    public WebElement getEntermail()
		    {
				return Entermail;
			}

		public WebElement getEmail() {
			return Email;
		}

		public WebElement getContniueEmail() {
			return ContniueEmail;
		}
		
		
		public WebElement getVerifyEmail() {
			return VerifyEmail;
		}
		
		public WebElement getPri_Mobile_Key() {
			return Pri_Mobile_Key;
		}

		

		public WebElement getPassword() {
			return Password;
		}



		public WebElement getTwo_Step_Veification() {
			return Two_Step_Veification;
		}

		

		public WebElement getCompromised_Acc() {
			return Compromised_Acc;
		}

		public WebElement getYour_Acc() {
			return Your_Acc;
		}

		


		

public void Security(WebDriver driver) throws InterruptedException
{
	
	Thread.sleep(2000);	
	Name.click();
	EnterName.clear();
	
	EnterName.sendKeys("Sumit Kumar");
	Save_Change.click();
	
	Email.click();
	Thread.sleep(2000);	
	
	
	Entermail.clear();
	driver.navigate().back();

//	Entermail.sendKeys("sk98100@gmail.com");

   //  ContniueEmail.click();
	
    
   //  Thread.sleep(10000);
   //  VerifyEmail.click();
	Pri_Mobile_Key.click();
	Thread.sleep(2000);	

	driver.navigate().back();


	Password.click();
	driver.navigate().back();

	
	Two_Step_Veification.click();
	driver.navigate().back();


	Compromised_Acc.click();
	driver.navigate().back();
	
	Your_Acc.click();
	
	Thread.sleep(3000);
driver.close();
	
}
}
