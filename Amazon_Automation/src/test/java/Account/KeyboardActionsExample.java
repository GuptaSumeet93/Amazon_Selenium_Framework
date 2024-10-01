package Account;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class KeyboardActionsExample {
    public static void main(String[] args) {
        // Set the path to your ChromeDriver executable
      //  System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        
            // Open the web page
            driver.get("https://www.google.com");

            // Wait for the input field to be clickable
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement inputField = wait.until(ExpectedConditions.elementToBeClickable(By.name("q")));  // Replace with the actual ID

            // Create an Actions object
            Actions actions = new Actions(driver);

            // Click on the input field to focus
            actions.moveToElement(inputField).click().perform();

            // Simulate typing each character using keyboard actions
            actions.sendKeys(inputField, Keys.ENTER).perform();

            System.out.println("Text entered via keyboard actions!");

       
        }
    }

