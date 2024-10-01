package Object_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Account_Page {
	
	


	 public Account_Page(WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
	}
	
	
	
	
	@FindBy(xpath="//*[@id=\"nav-link-accountList-nav-line-1\"]")
	private WebElement Cus_Acc;
	 
	
	@FindBy(xpath="//*[@id=\"a-page\"]/div[1]/div[1]/div[2]/div[1]/a[1]/div[1]")
    private WebElement Your_Order;

	    @FindBy(xpath="//*[@id=\"a-page\"]/div[1]/div[1]/div[2]/div[2]/a[1]/div[1]/div[1]")
	    private WebElement Login_Security; 		    
	    
	  
	   
	    @FindBy(xpath="//*[@id=\"a-page\"]/div[1]/div[1]/div[3]/div[1]/a[1]/div[1]")
	    private WebElement Ur_Add;
	    
	   

	    @FindBy(xpath="//*[@id=\"a-page\"]/div[1]/div[1]/div[4]/div[1]/a[1]/div[1]")
	    private WebElement AmazPayBal;
	    
	    @FindBy(xpath="//*[@id=\"a-page\"]/div[1]/div[1]/div[4]/div[2]/a[1]/div[1]/div[1]")
	    private WebElement Contact_Us;
	    
	    @FindBy(xpath="//*[@id=\"a-page\"]/div[1]/div[1]/div[3]/div[2]/a[1]/div[1]/div[1]")
	    private WebElement UrBuss_Acc;
	
	    @FindBy(xpath="//*[@id=\"a-page\"]/div[1]/div[1]/div[2]/div[3]/a[1]/div[1]/div[1]")
	    private WebElement Prime;
	
	    @FindBy(xpath="//*[@id=\"a-page\"]/div[1]/div[1]/div[3]/div[3]/a[1]/div[1]")
	    private WebElement Pay_Opt;
	
	
	    
	    public WebElement Customer() {
			return Cus_Acc;
		}
	 
		public WebElement getLogin_Security() {
			return Your_Order;
		}
	 
	

	public WebElement Get_Security() {
		return Login_Security;
	}

	
	public WebElement getUr_Add() {
		return Ur_Add;
	}

	

	public WebElement getAmazPayBal() {
		return AmazPayBal;
	}



	public WebElement getContact_Us() {
		return Contact_Us;
	}

	

	public WebElement getUrBuss_Acc() {
		return UrBuss_Acc;
	}

	

	public WebElement getPrime() {
		return Prime;
	}

	

	public WebElement getPay_Opt() {
		return Pay_Opt;
	}

	
	public void Cus_AccDetails() {
		Cus_Acc.click();
		
	}
	
	public void UrOrder()
	{
		Your_Order.click();
		
	}


	public void Security()
	{
		Login_Security.click();
		
	}
	

	public void PrimeUser()
	{
		Prime.click();
		
	}
	

	public void Address()
	{
		Ur_Add.click();
		
	}

	public void Bussiness()
	{
		UrBuss_Acc.click();
		
	}

	public void Payment()
	{
		Pay_Opt.click();
		
	}

	public void AmazonPay()
	{
		AmazPayBal.click();
		
	}

	public void Contact()
	{
		Contact_Us.click();
		
	}


}
