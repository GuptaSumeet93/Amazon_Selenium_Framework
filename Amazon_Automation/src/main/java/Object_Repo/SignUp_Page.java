package Object_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Genric_Utility.BaseClass;
import Genric_Utility.BaseClass2;

public class SignUp_Page extends BaseClass2

{
	

		
		
		public SignUp_Page(WebDriver driver)
		{
			
			PageFactory.initElements(driver,this);
		}
		
		
		

		@FindBy(id="nav-link-accountList-nav-line-1")
	    private WebElement ClickOnSign;

		    @FindBy(id="createAccountSubmit")
		    private WebElement CreateAmazonAcc; 		    
		    
		    
		    @FindBy(name="customerName")
		    private WebElement CusName;
		    
		    
		    
		   
		    @FindBy(id="ap_password")
		    private WebElement EnterPassword;
		    
		    @FindBy(id="ap_phone_number")
		    private WebElement Phone;  //secondaryLoginClaim

		    
//		    @FindBy(name="secondaryLoginClaim")
//		    private WebElement EmailId;
		  
			//Getters Method
			
			public WebElement getClickOnSign() {
				return ClickOnSign;
			}
			public WebElement getCreateAmazonAcc() {
				return CreateAmazonAcc;
			}

			public WebElement getCusName() {
				return CusName;
			}
			
			public WebElement getEnterPassword() {
				return EnterPassword;
			}
	

			public WebElement getPhone() {
				return Phone;
			}
		
//			public WebElement getEmailId() {
//				return EmailId;
//			}
//			

			
			public void Signup(String FirstName,String MobileNumber, String Password)
			{
				ClickOnSign.click();
				CreateAmazonAcc.click();
				CusName.sendKeys(FirstName);
				Phone.sendKeys(MobileNumber);

				//EmailId.sendKeys(Email);

				EnterPassword.sendKeys(Password);

				
				
			}
	 
		
	 
	}
