package All_Category;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Genric_Utility.BaseClass2;

public class ActionsExample {
    public static void main(String[] args) {
        // Set up WebDriver (e.g., ChromeDriver)
        WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://www.amazon.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"nav-hamburger-menu\"]/i[1]"));

        // Iterate through the list of elements and perform an action (e.g., clicking each checkbox)
        for (WebElement ele : elements) {
            if (!ele.isSelected()) {
                ele.click();  // Click on the checkbox if it's not already selected
            }
        }
    }
}
