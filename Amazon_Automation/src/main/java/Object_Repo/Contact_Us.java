package Object_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Genric_Utility.WebDriver_File;

public class Contact_Us {
	
	


	 public Contact_Us(WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
	}
	
	
	
	
	@FindBy(xpath="//H2[contains(text(),'Contact Us')]  ")
	private WebElement Contact;
	 
	
	@FindBy(xpath="//a[contains(text(),'Call me')]")
    private WebElement call_Me;

	   
	  
	   
	    @FindBy(xpath="//input[@class='a-button-input']")
	    private WebElement Chat;
	    
	   

	
	
	

	public WebElement getContact() {
		return Contact;
	}

	

	public WebElement getcall_Me() {
		return call_Me;
	}

	

	public WebElement getChat() {
		return Chat;
	}


	
	
	
	public void cus_Care(WebDriver driver) throws InterruptedException
	{
		Contact.click();
		call_Me.click();
		
		driver.navigate().back();
		Thread.sleep(2000);		
		
		Chat.click();
		WebDriver_File file=new WebDriver_File();
		file.Win_Popup(driver);
	
		driver.navigate().back();

		
		
		
	}

	
	}


