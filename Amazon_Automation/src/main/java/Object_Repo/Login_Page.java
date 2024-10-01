package Object_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Genric_Utility.BaseClass;
import Genric_Utility.BaseClass2;

public class Login_Page extends BaseClass2

{
	

		
		
		public Login_Page(WebDriver driver)
		{
			
			PageFactory.initElements(driver,this);
		}
		
		
		

		@FindBy(id="nav-link-accountList-nav-line-1")
	    private WebElement ClickOnSign;

		    @FindBy(id="ap_email")
		    private WebElement UserTextField; 		    
		    
		    @FindBy(id="continue")
		    private WebElement Continue;  //secondaryLoginClai
		    
		   
		    @FindBy(id="signInSubmit")
		    private WebElement submit;
		    
		   

		    @FindBy(id="ap_password")
		    private WebElement PasswordTextField;
		    
		    
//		    @FindBy(id="input-box-otp")
//		    private WebElement Otp;
//		    
//		    @FindBy(id="cvf-submit-otp-button-announce")
//
//		    private WebElement submitCode;
//		    
		    
//		    @FindBy(name="secondaryLoginClaim")
//		    private WebElement EmailId;
		  
			//Getters Method
			
			public WebElement getClickOnSign() {
				return ClickOnSign;
			}
			public WebElement getUserTextField() {
				return UserTextField;
			}

			public WebElement proceed() {
				return Continue;
			}
			
			
			public WebElement getPassword() {
				return PasswordTextField;
			}
			public WebElement submitButton() {
				return submit;
			}
//
//			public WebElement getOtp() {
//				return Otp;
//			}
//			public WebElement CodeSubmitted() {
//				return submitCode;
//			}
//			

//			public WebElement getEmailId() {
//				return EmailId;
//			}
//			

			
			public void Login_To_Web(String email, String pwd) throws InterruptedException
			{
				ClickOnSign.click();
				UserTextField.sendKeys(email);

				Continue.click();
				PasswordTextField.sendKeys(pwd);
				submit.click();
				//EmailId.sendKeys(Email);
            Thread.sleep(5000);
				
				
				
			}
			
			
	 
		
	 
	}
