package Object_Repo.Vtiger;

import java.awt.event.ActionEvent;
import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Genric_Utility.Property_File;
import Genric_Utility.WebDriver_File;

public class Home_Page {

	public Home_Page(WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
	}
		
	//Declaration
	
	    @FindBy(id="twotabsearchtextbox")
	    private WebElement ProductName;
	
		@FindBy(id="nav-hamburger-menu")
		private WebElement Categories;
		
		
		@FindBy(name="Campaigns")
		private WebElement campaignLinkText;
		
		@FindBy(linkText="Organizations")
		private WebElement organizationLinkText;
		
		@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
		private WebElement signoutImg;


		@FindBy(linkText="Sign Out")
		private WebElement signoutLinkText;
		
		
		
		

				
				//Getters Method

				public WebElement getProductName() {
					return ProductName;
				}
				
                                 
				public WebElement getCategories() {
					return Categories;
				}

				public WebElement getCampaignLinkText() {
					return campaignLinkText;
				}

				public WebElement getOrganizationLinkText() {
					return organizationLinkText;
				}

//				public WebElement getSignoutImg() {
//					return signoutImg;
//				}

				public WebElement getSignoutLinkText() {
					return signoutLinkText;
				}
				
				
				//Business Logic For Categories
				
				public void Categories(WebDriver driver)
				{
					WebDriver_File wlib=new WebDriver_File();
					wlib.mouseOverOnElement(driver, Categories);
				}
				
				//Search
				public void ProductName() {

					ProductName.sendKeys("Mobile",Keys.ENTER);
			    }

				
				
				//Campaigns
						public void campaignLinkText()
						{
							campaignLinkText.click();
						}
						
			//Organizations
						public void clickOrganizationLinkText()
						{
							organizationLinkText.click();
						}
						
						
						//signOut
						
//
//						public void clickOnSignOutImg(WebDriver driver)
//						{
//							
//			                Actions act=new Actions( driver);
//			                   act.moveToElement(signoutImg).perform();
//
//							signoutImg.click();
//						}

		
						
						
						
						public void signOutLink(WebDriver driver)
						{
		                   Actions act=new Actions(driver);	
		                   act.moveToElement(signoutLinkText).perform();
							signoutLinkText.click();

						}
						
						
				
				
				
		
		
}

