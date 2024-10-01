package Object_Repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
@Test
public class YourAddress 
{

	 public YourAddress(WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
	}
	
	 @FindBy(xpath ="//*[@id=\"a-page\"]/div[1]/div[1]/div[3]/div[1]/a[1]/div[1]")
private WebElement YourAdd;


@FindBy(id="ya-myab-plus-address-icon")
private WebElement Add_Address;

@FindBy(id="address-ui-widgets-enterAddressFullName")
private WebElement Full_Name;


@FindBy(id="address-ui-widgets-enterAddressPhoneNumber")
private WebElement Phone_Number;



 @FindBy(id="address-ui-widgets-enterAddressPostalCode")
 private WebElement Postal_Code;


 @FindBy(id="address-ui-widgets-enterAddressLine1")
 private WebElement Aparment_No;

 @FindBy(id="address-ui-widgets-enterAddressLine2")
 private WebElement Street;

 @FindBy(id="address-ui-widgets-landmark")
 private WebElement Landmark;

 @FindBy(id="address-ui-widgets-enterAddressCity")
 private WebElement City;
 
 

 @FindBy(id=" ukk7v7-mbarra-dx1equ-sipek8")
 private WebElement State;
 
 
 

 @FindBy(xpath = "//*[@id=\"address-ui-widgets-form-submit-button\"]/span[1]/input[1]")
 private WebElement Added_Address;
 
 

 @FindBy(xpath = "//a[text()='Remove'][1]")
 private WebElement Remove_Address;
 
 @FindBy(xpath = "//*[@id=\"deleteAddressModal-0-submit-btn\"]/span[1]/input[1]")
 private WebElement Yes_Remove;
 
//*[@id="deleteAddressModal-0-submit-btn"]/span[1]/input[1]
public WebElement getYourAdd() {
	return YourAdd;
}
public WebElement getAdd_Address() {
	return Add_Address;
}


public WebElement getFull_Name() {
	return Full_Name;
}
public WebElement getPostal_Code() {
	return Postal_Code;
}


public WebElement getAparment_No() {
	return Aparment_No;
}
public WebElement getStreet() {
	return Street;
}
public WebElement getLandmark() {
	return Landmark;
}
public WebElement getPhone_Number() {
	return Phone_Number;
}

public WebElement getCity() {
	return City;
}


public WebElement getState() {
	return State;
}


public WebElement getAdded_Address() {
	return Added_Address;
}




public WebElement getRemove_Address1() {
	return Remove_Address;
}



public WebElement getYes_Remove() {
	return Yes_Remove;
}




/**
 * @throws InterruptedException 
 * 
 */

public void New_Adress(WebDriver driver) throws InterruptedException
{
	YourAdd.click();
	
	Thread.sleep(2000);	
	
	Add_Address.click();
	

	

	Full_Name.sendKeys("Hello Kumar");
	Phone_Number.sendKeys("9563635252");

	Postal_Code.sendKeys("827013");

	

	Aparment_No.sendKeys("1166");

	Street.sendKeys("biyada colony");
	
	Landmark.sendKeys("shiv mandir");
	
   City.clear();
	City.sendKeys("BOKARO STEEL CITY");
	Thread.sleep(2000);	
	
	// Locate the state dropdown element
    WebElement stateDropdown = driver.findElement(By.xpath("//*[@id=\"address-ui-widgets-enterAddressStateOrRegion\"]/span[1]/span[1]")); // Use the correct ID for the state dropdown
    stateDropdown.click();
    // Create a Select instance
  //  Select select = new Select(stateDropdown);
   // WebElement state=driver.findElement(By.xpath("//a[text()= 'JHARKHAND']")); // Use the correct ID for the state dropdown
   //  state.submit();
    // Select the state by visible text
   // select.selectByVisibleText("JHARKHAND"); // Replace with the desired state

 
    Added_Address.click();

}

public void removeAddress() throws InterruptedException
{
	Remove_Address.click();
	Thread.sleep(3000);
	Yes_Remove.click();
	
//	Remove_Address.click();
//	Thread.sleep(3000);
//	Yes_Remove.click();

	

	
}
}
