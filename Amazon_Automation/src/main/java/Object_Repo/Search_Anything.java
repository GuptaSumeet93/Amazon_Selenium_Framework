package Object_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Anything {
	
	


	 public Search_Anything(WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
	}
	
	
	

		
		@FindBy(id="twotabsearchtextbox")
		private WebElement Search;
		 
		
		@FindBy(id="nav-search-submit-button")
	    private WebElement Find_Anything;

		   
		  
		
		   
		@FindBy(xpath="//button[contains(text(),'Add to cart')][1]")
	    private WebElement Adding_To_Cart;

		@FindBy(id="nav-cart")
	    private WebElement View_Cart;

		@FindBy(xpath="//input[@value='Delete'][1]")
	    private WebElement Delete;
		
	

		

		public WebElement getSearch() {
			return Search;
		}

		

		public WebElement getFind_Anything() {
			return Find_Anything;
		}
	
		public WebElement getAdding_To_Cart() {
			return Adding_To_Cart;
		}

		public WebElement getView_Cart() {
			return View_Cart;
		}
		

	
	public void Get_Search(WebDriver driver) throws InterruptedException
	{
		Search.sendKeys("HP LITKEYBOARD i3 ");;
		
		
		
		//WebDriver_File file=new WebDriver_File();
		
		//file.ExplicitWaitExample(driver);
		Find_Anything.click();
		
		Adding_To_Cart.click();
		
		View_Cart.click();
		
	//Gift_Bal.sendKeys("2000");
	
//		Load_Money.click();
		Thread.sleep(3000);	

		
		
	}
	
	public void Delete_Item()
	{
		
		Delete.click();
	}

	
	}


