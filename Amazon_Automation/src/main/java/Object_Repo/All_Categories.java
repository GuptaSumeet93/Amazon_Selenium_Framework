package Object_Repo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
@Test
public class All_Categories 
{

	 public All_Categories(WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
	}
	
//	 @FindBy(xpath ="//*[@id=\"nav-hamburger-menu\"]/i[1]")
//      private WebElement All;
//	 
//	 
//	 @FindBy(xpath ="//*[@id=\"hmenu-content\"]/ul[1]/li[2]/a[1]")
//	 private WebElement Best_Seller;
//	 
//	 @FindBy(xpath ="//*[@id=\"hmenu-content\"]/ul[1]/li[3]/a[1]")
//	 private WebElement New_Release;
//	 
//	 @FindBy(xpath ="//*[@id=\"hmenu-content\"]/ul[1]/li[4]/a[1]")
//	 private WebElement Movers;
//	 @FindBy(xpath ="//*[@id=\"hmenu-content\"]/ul[1]/li[7]/a[1]")
//	 private WebElement Echo_Alexa;
//	 @FindBy(xpath ="//*[@id=\"hmenu-content\"]/ul[1]/li[8]/a[1]")
//	 private WebElement Fire_Tv;
//	 @FindBy(xpath ="//*[@id=\"hmenu-content\"]/ul[1]/li[9]/a[1]")
//	 private WebElement Kindle;
//	 @FindBy(xpath ="//*[@id=\"hmenu-content\"]/ul[1]/li[10]/a[1]")
//	 private WebElement Audio_Book;
//	 @FindBy(xpath ="//*[@id=\"hmenu-content\"]/ul[1]/li[11]/a[1]")
//	 private WebElement Prime_Video;
//	 
//	 @FindBy(xpath ="//*[@id=\"hmenu-content\"]/ul[1]/li[12]/a[1]")
//	 private WebElement Prime_Music;
//	 @FindBy(xpath ="//*[@id=\"hmenu-content\"]/ul[1]/li[15]/a[1]")
//	 private WebElement Mobile_Computer;
//	 @FindBy(xpath ="//*[@id=\"hmenu-content\"]/ul[1]/li[16]/a[1]")
//	 private WebElement TV_Electronics;
//	 @FindBy(xpath ="//*[@id=\"hmenu-content\"]/ul[1]/li[17]/a[1]")
//	 private WebElement Men_Fashion;
//	 @FindBy(xpath ="//*[@id=\"hmenu-content\"]/ul[1]/li[18]/a[1]")
//	 private WebElement Women_Fashion;
//	 
//	 @FindBy(xpath ="//*[@id=\"hmenu-content\"]/ul[1]/ul[1]/li[2]/a[1]/div[1]")
//	 private WebElement Home;
//	 
//	 
//	 private WebElement Beauty;
//	 @FindBy(xpath ="//*[@id=\"hmenu-content\"]/ul[1]/ul[1]/li[3]/a[1]")
//	 private WebElement Sports;
//	 @FindBy(xpath ="//*[@id=\"hmenu-content\"]/ul[1]/ul[1]/li[4]/a[1]")
//	 private WebElement Toy;
//	 @FindBy(xpath ="//*[@id=\"hmenu-content\"]/ul[1]/ul[1]/li[5]/a[1]")
//	 private WebElement Cars;
//	 @FindBy(xpath ="//*[@id=\"hmenu-content\"]/ul[1]/ul[1]/li[6]/a[1]")
//	 private WebElement Books;
//	 @FindBy(xpath ="//*[@id=\"hmenu-content\"]/ul[1]/ul[1]/li[7]/a[1]")
//	 private WebElement Movie;
//	 @FindBy(xpath ="//*[@id=\"hmenu-content\"]/ul[1]/li[22]/a[1]")
//	 private WebElement Amazon_Pay;
//	 @FindBy(xpath ="//*[@id=\"hmenu-content\"]/ul[1]/li[23]/a[1]")
//	 private WebElement Gift;
//	 @FindBy(xpath ="//*[@id=\"hmenu-content\"]/ul[1]/li[24]/a[1]")
//	 private WebElement Launchpad;
//	 @FindBy(xpath ="//*[@id=\"hmenu-content\"]/ul[1]/li[25]/a[1]")
//	 private WebElement Business;
//	 
//	 
//	 @FindBy(xpath ="//*[@id=\"hmenu-content\"]/ul[1]/ul[2]/li[2]/a[1]")
//	 private WebElement Handloom;
//	 @FindBy(xpath ="//*[@id=\"hmenu-content\"]/ul[1]/ul[2]/li[3]/a[1]")
//	 private WebElement Saheli;
//	 
//	 @FindBy(xpath ="//*[@id=\"hmenu-content\"]/ul[1]/ul[2]/li[4]/a[1]")
//	 private WebElement Combos;
//	 @FindBy(xpath ="//*[@id=\"hmenu-content\"]/ul[1]/ul[2]/li[5]/a[1]")
//	 private WebElement Costumes;
//	 @FindBy(xpath ="//*[@id=\"hmenu-content\"]/ul[1]/ul[2]/li[6]/a[1]")
//	 private WebElement Tickets;
//	 @FindBy(xpath ="//*[@id=\"hmenu-content\"]/ul[1]/ul[2]/li[7]/a[1]")
//	 private WebElement Buy_More;
//	 @FindBy(xpath ="//*[@id=\"hmenu-content\"]/ul[1]/ul[2]/li[8]/a[1]")
//	 private WebElement Clearence;
//	 @FindBy(xpath ="//*[@id=\"hmenu-content\"]/ul[1]/ul[2]/li[9]/a[1]")
//	 private WebElement Int_Brand;
//	 
//	 @FindBy(xpath =" //*[@id=\"hmenu-content\"]/ul[1]/li[29]/a[1]")
//	 private WebElement Your_Acc;
//	 @FindBy(xpath =" //*[@id=\"hmenu-content\"]/ul[1]/li[30]/a[1]")
//	 private WebElement Customer_Service;
//	 @FindBy(xpath =" //*[@id=\"hmenu-content\"]/ul[1]/li[31]/a[1]")
//	 private WebElement Sign_Out;
//	 
//
//
////Getters Method
//
//public WebElement getAll() {
//	return All;
//}
//	 
//
//public WebElement getBest_Seller() {
//	return Best_Seller;
//}
//
//
//public WebElement getNew_Release() {
//	return New_Release;
//}
//
//public WebElement getgetMovers() {
//		return Movers;
//}
//		public WebElement getEcho_Alexa() {
//			return Echo_Alexa;
//		}
//		
//		
//		
//public WebElement getFire_Tv() {
//				return Fire_Tv;
//}
//
//
//
//public WebElement getKindle() {
//	return Kindle;
//}
//					
//public WebElement getAudio_Book() {
//		return Audio_Book;
//}
//
//	public WebElement getPrime_Video() {
//	return Prime_Video;
//	}
//	
//	
//	
//
//	public WebElement getPrime_Music() {
//	return Prime_Music;
//	}
//	
//	
//					
//	public WebElement getMobile_Computer() {
//	return Mobile_Computer;
//	}
//	
//	
//	public WebElement getTV_Electronics() {
//		return TV_Electronics;	
//	}
//	
//	
//	
//	public WebElement getMen_Fashion() {
//	return Men_Fashion;
//	}
//	
//	
//		public WebElement getWomen_Fashion() {
//		return Women_Fashion;
//		}
//		
//
//		public WebElement getHome() {
//		return Home;
//		}
//		
//		
//						
//		public WebElement getBeauty() {
//		return Beauty;
//		}
//		
//		
//		public WebElement getSports() {
//			return Sports;		
//		}
//		
//		
//		
//		
//		public WebElement  getToy() {
//		return  Toy;
//		}
//		
//		
//		
//		
//		
//		
//			public WebElement  getCars() {
//			return  Cars;
//			}
//			
//			
//			
//
//			public WebElement getBooks() {
//			return Books;
//			}
//			
//			
//			
//			
//			
//			
//							
//			public WebElement getMovie() {
//			return Movie;
//			}
//			
//			
//			
//			public WebElement getAmazon_Pay() {
//				return Amazon_Pay;	
//			}
//			
//			
//public WebElement getGift() 
//{
//	return Gift;
//		
//
//}
//			
//			
//public WebElement getLaunchpad()
//{
//	return Launchpad;
//}	
//
//
//public WebElement getBusiness()
//{
//return Business;
//}
//
//public WebElement getHandloom()
//{
//return Handloom;
//}	
//
//
//public WebElement getSaheli()
//{
//return Saheli;
//}	
//
//
//
//public WebElement getComb()
//{
//return Combos;
//}	
//
//
//public WebElement getCostumes()
//{
//return Costumes;
//}	
//
//
//public WebElement getTickets()
//{
//return Tickets;
//}	
//
//
//public WebElement getBuy_More()
//{
//return Buy_More;
//}
//
//public WebElement getClearence()
//{
//return Clearence;
//}	
//
//
//
//public WebElement getInt_Brand()
//{
//return Int_Brand;
//}	
//
//
//public WebElement getYour_Acc()
//{
//return Your_Acc;
//}	
//
//
//public WebElement getCustomer_Service()
//{
//return Customer_Service;
//}	
//
//
//public WebElement getSign_Out()
//{
//return Sign_Out;
//}
//								

	public void Go_Through_All_Option(WebDriver driver) throws InterruptedException 
	
	
	{ // Create an instance of the Actions class
        Actions actions = new Actions(driver);

        // Example 1: Interact with the "All" (hamburger) menu
        try {
            WebElement allMenu = driver.findElement(By.id("nav-hamburger-menu"));
            actions.moveToElement(allMenu).click().perform(); // Open the "All" menu
            
            // Wait for the menu to be visible and find all items in the menu
            List<WebElement> allMenuItems = driver.findElements(By.cssSelector(".hmenu-visible .hmenu-item"));

            System.out.println("All Menu Items:");
            for (WebElement menuItem : allMenuItems) {
                System.out.println(menuItem.getText());  // Print each menu item text  .hm-icon-label  //
                
                // Example action: Clicking the menu item (You may need further logic to handle navigation)
                if (menuItem.getText().equals("Your Account")) {  // Modify as per the menu text you want to interact with
                    menuItem.click();
                    
                    Thread.sleep(3000);
                    break;
                }
                    
                    else if (menuItem.getText().equals("Fresh")) {  // Modify as per the menu text you want to interact with
                        menuItem.click();
                        
                        Thread.sleep(3000);
                       // break;
                    }                        
                    else  if (menuItem.getText().equals("Buy Again")) {  // Modify as per the menu text you want to interact with
                            menuItem.click();
                            
                            Thread.sleep(3000);
                           // break; // Break after clicking to avoid stale element exception
                }
                    else  if (menuItem.getText().equals("Flights")) {  // Modify as per the menu text you want to interact with
                        menuItem.click();
                        
                        Thread.sleep(3000);
                        break; // Break after clicking to avoid stale element exception
            }
                                        // Break after clicking to avoid stale element exception

            }
        }
         catch (Exception e) {
            System.out.println("Failed to interact with the 'All' menu: " + e.getMessage());
        }

        // Example 2: Interact with the top navigation menus
        try {
            List<WebElement> topNavMenus = driver.findElements(By.cssSelector("#nav-xshop a"));

            System.out.println("\nTop Navigation Menu Items:");
            for (WebElement topNavMenu : topNavMenus) {
                String menuText = topNavMenu.getText();
                System.out.println(menuText);  // Print each top navigation menu item

                // Example action: Hover over the top navigation menu item
                actions.moveToElement(topNavMenu).perform();
                
                // Optional: Click on specific menu items
                if (menuText.equalsIgnoreCase("Best Sellers")) {
                    topNavMenu.click();
                    Thread.sleep(3000);
                    break;
                }
            }
        }
        
        catch (Exception e)
        {
            System.out.println("Failed to interact with the top navigation menu: " + e.getMessage());
        }
   }

	       
}
		
		
		
//		All.click();
//		Best_Seller.click();
//       New_Release.click();		
//		
	
	


