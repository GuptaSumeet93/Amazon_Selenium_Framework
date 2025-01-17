package Practice;


import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.apache.poi.ss.usermodel.Sheet;

//import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Genric_Utility.Property_File;

public class Demo {
	public static void main(String[] args) throws IOException {
		
		
		String Key="webdriver.chrome.driver";
		String Value="./src/main/resources/chromedriver.exe";
		System.setProperty(Key, Value);
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		Property_File plib=new Property_File();
		String URL=plib.getPropertyKeyValue("url");
        String USERNAME=plib.getPropertyKeyValue("username");
		String PASSWORD=plib.getPropertyKeyValue("password");
		
		
		
		 driver.get(URL);
		
		
         driver.findElement(By.name("user_name")).sendKeys("admin");
         driver.findElement(By.name("user_password")).sendKeys("admin");		
         driver.findElement(By.id("submitButton")).click();
         driver.findElement(By.linkText("Organizations")).click();
         driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
 		FileInputStream fis1=new FileInputStream("./src/test/resources/ExcelBook1.xlsx");
 		
 		Workbook book=WorkbookFactory.create(fis1);

         Sheet sh=book.getSheet("Organizations");
 		  Row row=sh.getRow(0);
          Cell cel=row.getCell(0);
 		  String data=cel.getStringCellValue();
 		  driver.findElement(By.name("accountname")).sendKeys(data);

		driver.findElement(By.xpath("\\input[@title='Save [Alt+S]']")).click();		
		driver.findElement(By.linkText("Sign Out")).click();
		
		
	}

}
