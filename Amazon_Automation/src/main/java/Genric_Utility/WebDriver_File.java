package Genric_Utility;

import java.time.Duration;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriver_File 
{
//To maximize the screen
	
	public void maximizeScreen(WebDriver driver)
	{
		
		driver.manage().window().maximize();
	}
	
	
	/**
	 *  Wait for page to load before identifying any synchronised element in DOM
	 */

	public void waitForPageLoad(WebDriver driver)
	{
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);  Not support in selenium 4.4.0

		
		
		
    }

		
	//To close the browser
	
	public void closeBrowser(WebDriver driver)
	{
		driver.close();
	}
		
	//To close open all window tab 
		public void 	quitBrowser(WebDriver driver)
		{
	       driver.quit();
	       
		}
		
		
		//To get  current url
			public void 	getUrl(WebDriver driver)
			{
		       System.out.println(driver.getCurrentUrl());
		       
			}
			
			//To get  title
					public void 	getTitle(WebDriver driver)
					{
				       System.out.println(driver.getTitle());
				       
					}
	
	
	/**
	 * After every action it will for next action to perform
	 */

@SuppressWarnings("deprecation")
public void scriptTimeOut(WebDriver driver)
{

driver.manage().timeouts().setScriptTimeout(20,TimeUnit.SECONDS);
}

//Used to wait for element to be clickable in GUI and check foe specific 
//elements for every 5000 milliseconds

public void waitForElementCustomTimeout(WebDriver driver, WebElement Element, int pollingTime)
{
	FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
	
	wait.pollingEvery(Duration.ofSeconds(20));
	wait.until(ExpectedConditions.elementToBeClickable(Element));
	
	
}

/**
 * used to switch to any window based on window title
 *  
 *  PartialWindow Title
 */


public void switchToWindow(WebDriver driver, String PartialWindowTitle)
{
	  Set<String> allId=driver.getWindowHandles();
      Iterator<String> it=allId.iterator();
      while(it.hasNext())
      {
   	   String wid=it.next();
   	   driver.switchTo().window(wid);
   	   String title=driver.getTitle();
   	   
   	   System.out.println(""+title);

   	   
   	   if(driver.getTitle().contains(PartialWindowTitle))
   	   {
   		   break;
   	   }
   	   
   	  
      }
}
     //used to switch to AlertWindow and accept(click on OK button)
      
      public void switchToAlertAndAccept(WebDriver driver)
      {
    	  driver.switchTo().alert().accept();
    	 
      }
      
   //used to switch to AlertWindow And Dismiss(click and cancel button)
      
      public void switchToAlertAndDismiss(WebDriver driver)
      {
    	  driver.switchTo().alert().dismiss();
    	  
      }
      
      
      //Use to switch to Frame window based on index
      //@param driver
      //@param index
      
      
      public void switchToFrame(WebDriver driver,int index)
      {
    	  driver.switchTo().frame(index);
    	  
      }
      
      /**
       * used to switch to Frame window based on id or name attributes
      @param driver
      @param index
      @param id_name_attributes
      
 */

      public void switchToFrame(WebDriver driver,String id_name_Attributes)
      {
    	  driver.switchTo().frame(id_name_Attributes);
      }
      
      /**
       * used to select the value from the dropdown based on index
       * @param element
       * @param index
       */
      
      public void select(WebElement element,int index)
      {
    	  Select sel=new Select(element);
    	  sel.selectByIndex(index);
      }
/*
 * used to select the value from dropdown based on text
 * @param element
 * @param text
 */

      public void select(WebElement element,String text)
      {
    	  Select sel=new Select(element);
    	  sel.selectByVisibleText(text);
      }

/*used to place mouse cursor on specified element
 * param driver
 * param element
 */
      
      public void mouseOverOnElement(WebDriver driver, WebElement element)
      {
    	  Actions act=new Actions(driver);
    	  act.moveToElement(element).perform();
    	  
      }
      
      
/*Used to right click on specific element
 *param driver
 * param element
 */
      
      public void rightClickOnElement(WebDriver driver, WebElement element)
      {
    	  Actions act=new Actions(driver);
    	  act.contextClick(element).perform();
    	  
      }
      
      public void moveByOffset(WebDriver driver,int x, int y)
      {
    	  Actions act=new Actions(driver);
    	  act.moveByOffset(x,y).click().perform();
    	  
      }
      
      public String takeScreenShot(WebDriver driver,String methodName)
      
     
      {
    	  Date date=new Date();
    	   date.toString().replace(" ", " ").replace(":",".");
    	   //TakeScreeShot ts= new (TakeScreenShot)Driver;
    	   return null;
      }


     public void MultipleWindowHandles(WebDriver driver) {
    	    
   String mainWindowHandle = driver.getWindowHandle();

    	        // Get all window handles
    	        Set<String> allWindowHandles = driver.getWindowHandles();

    	        // Loop through all window handles
    	        for (String windowHandle : allWindowHandles) {
    	            if (!windowHandle.equals(mainWindowHandle)) {
    	                // Switch to the new window
    	                driver.switchTo().window(windowHandle);
    	                
    	                // Perform actions in the new window
    	                System.out.println("Title of new window: " + driver.getTitle());
    	                
    	                // Close the new window
    	                driver.close();
    	                
    	                // Switch back to the main window
    	                driver.switchTo().window(mainWindowHandle);
    	            }
    	        }
    	    }
     
 	// Store the current window handle
     
     public void Win_Popup(WebDriver driver) throws InterruptedException {
		String mainWindow = driver.getWindowHandle();

		// Get all window handles
		Set<String> allWindows = driver.getWindowHandles();

		// Iterate through the window handles
		for (String window : allWindows) {
		    if (!window.equals(mainWindow)) {
		        // Switch to the popup window
		        driver.switchTo().window(window);
		        Thread.sleep(5000);
		        // Perform actions in the popup if needed (e.g., close it)
		        driver.close(); // Close the popup window
		    }
		}

		// Switch back to the main window
		driver.switchTo().window(mainWindow);

     }
     
     
     
     public void ExplicitWaitExample (WebDriver driver){
    	        // Set up the WebDriver (using ChromeDriver in this example)

    	        // Navigate to the target website

    	        // Define a wait time (maximum duration to wait for the condition)
    	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

    	        // Specify the condition: wait until the element is visible
    	       // WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("element-id")));

//		        element1.sendKeys("5000");; // Or any other interaction

    	     //   WebElement element2 = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("element-id")));
    	     //   Boolean element3 = wait.until(ExpectedConditions.elementToBeSelected(By.id("checkbox-id")));
//
    	        //Boolean element4 =wait.until(ExpectedConditions.titleContains("Expected Title Text"));

    	        
    	     //   Boolean element5 = wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("element-id"), "Expected Text"));

    	        
    	        try {
    	            WebElement element6 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"balanceDetail\"]")));
    	            element6.click();
    	            element6.sendKeys("3000");
    	        } catch (TimeoutException e) {
    	            System.out.println("Element was not clickable within the timeout period.");
    	        }



}
}



      
      

