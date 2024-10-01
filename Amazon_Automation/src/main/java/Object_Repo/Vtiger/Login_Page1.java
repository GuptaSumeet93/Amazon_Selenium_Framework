package Object_Repo.Vtiger;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page1 {

	
	
	public Login_Page1(WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
	}
	
	
	
	
		@FindBy(id="nav-link-accountList-nav-line-1")
	    private WebElement ClickOnSign;

	    @FindBy(name="email")
	    private WebElement UserTextField;
	    
	    @FindBy(id="continue")
	    private WebElement Proceed;
	
		@FindBy(id="ap_password")
		private WebElement PasswordTextField;
		
		
		@FindBy(id="signInSubmit")
		private WebElement SignIn;
		
		//Getters Method
		
		public WebElement getClickOnSign() {
			return ClickOnSign;
		}
		public WebElement getUserTextField() {
			return UserTextField;
		}

		public WebElement getProceed() {
			return Proceed;
		}

		public WebElement getUserPassword() {
			return PasswordTextField;
		}

		
		

		public WebElement getSignIn() {
			return SignIn;
		}

		
		/**
		 * 
		 */
		
		public void loginToApp(String Email,String Password)
		{
			ClickOnSign.click();
			UserTextField.sendKeys(Email);
			Proceed.click();
			
			PasswordTextField.sendKeys(Password);
			SignIn.click();
		}
 
}
