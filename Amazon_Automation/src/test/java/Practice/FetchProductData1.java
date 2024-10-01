package Practice;


import org.openqa.selenium.WindowType;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.sl.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Genric_Utility.Excel_File;
import Genric_Utility.Excel_File2;
import Genric_Utility.Java_File;
import Genric_Utility.Property_File;
import Genric_Utility.WebDriver_File;

	public class FetchProductData1 {
		
		@Test
		public void FetchProductData1() throws Throwable
		{
		
		
		String Key="webdriver.chrome.driver";
		String Value="./src/main/resources/chromedriver.exe";
		System.setProperty(Key, Value);
			
			WebDriver driver=new ChromeDriver();
			
			Property_File plib=new Property_File();
			Java_File jlib=new Java_File();
	  		Excel_File elib=new Excel_File();
	  		//Excel_File2 elib1=new Excel_File2();

	  		WebDriver_File wlib=new WebDriver_File();
	  		
	  		wlib.waitForPageLoad(driver);
	  		wlib.maximizeScreen(driver);

			
			
			
//	        driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10))
		
			
			String URL=plib.getPropertyKeyValue("url");
	        String USERNAME=plib.getPropertyKeyValue("username");
			String PASSWORD=plib.getPropertyKeyValue("password");
			
			
			
			 driver.get(URL);
			
			
	         driver.findElement(By.name("user_name")).sendKeys("admin");
	         driver.findElement(By.name("user_password")).sendKeys("admin");		
	         driver.findElement(By.id("submitButton")).click();
	         
	         
	         
	         driver.findElement(By.linkText("Products")).click();
	         driver.findElement(By.xpath("//img[@alt='Create Product...']")).click();
	          
	  		int RanNum=jlib.getRanDomNum(); 
	  		String Prodata=elib.getExcelData("Products",0,0)+RanNum;

	  	   
 
	       
	  		
//	         Random ran=new Random();
//	         
//	         int RanNum=ran.nextInt(1000);

	      
//	 		  FileInputStream fis1=new FileInputStream("./src/test/resources/ExcelBook1.xlsx");
//	 	      Workbook book=WorkbookFactory.create(fis1);
//              Sheet sh=book.getSheet("Products");
//	 		  Row row=sh.getRow(0);
//	          Cell cel=row.getCell(0);
//	 		  String Prodata=cel.getStringCellValue()+RanNum;
	  		
	  		
		  driver.findElement(By.name("productname")).sendKeys(Prodata);
          driver.findElement(By.name("button")).click();	
			
			 driver.findElement(By.xpath("//img[@src='themes/softed/images/menuDnArrow.gif']")).click();

	         
	         
	         driver.findElement(By.name("Campaigns")).click();
	         driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
	         
		  		String data1=elib.getExcelData("Campaigns",0,0)+RanNum;


		  		//String data1=elib1.getExcelData2("Campaigns",0,0)+RanNum;
	         
	      
//	          Random ran1=new Random();
//	 		  int RanNum1=ran1.nextInt(1000);
//	 		  FileInputStream fis2=new FileInputStream("./src/test/resources/ExcelBook1.xlsx");
//              Workbook book1=WorkbookFactory.create(fis2);
//	          Sheet sh1=book1.getSheet("Campaigns");
//	 		  Row row1=sh1.getRow(0);
//	          Cell cell1=row1.getCell(0);
//	 		  String data1=cell1.getStringCellValue()+RanNum1;
	 		 
		  		driver.findElement(By.name("campaignname")).sendKeys(data1);
		  		
		  		
		  		
            driver.findElement(By.xpath("//img[@alt='Select']")).click();
		    wlib.switchToWindow(driver, "Products&action");
			
//           Set<String> allId=driver.getWindowHandles();
//           Iterator<String> it=allId.iterator();
//           while(it.hasNext())
//           {
//        	   String wid=it.next();
//        	   driver.switchTo().window(wid);
//        	   String title=driver.getTitle();
//        	   
//        	   if(title.contains("Products&action"))
//        	   {
//        		   break;
//        	   }
//        	   
//           }
           
          // driver.findElement(By.xpath("//input[@name='search_text']")).click();
           
            //Thread.sleep(5000);
           driver.findElement(By.name("search_text")).sendKeys(Prodata);
           driver.findElement(By.xpath("//input[@name='search']")).click();
           driver.findElement(By.xpath("//a[text()='"+Prodata+"']")).click();
           
           Thread.sleep(2000);
         
           
//           Set<String> allId1=driver.getWindowHandles();
//           Iterator<String> it1=allId.iterator();
//           while(it1.hasNext())
//           {
//        	   String wid1=it1.next();
//        	   driver.switchTo().window(wid1);
//        	   String title1=driver.getTitle();
//        	   
//        	   if(title1.contains("Campaigns&action"))
//        	   {
//        		   break;
//        	   }
//        	   
//           }
           
           
           wlib.switchToWindow(driver,"Campaigns&action");
           System.out.println(driver.getTitle());
           driver.findElement(By.name("button")).click();	

			
			
			
			Thread.sleep(5000);
			driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
			driver.findElement(By.linkText("Sign Out")).click();
			
			driver.close();
		}

	}



