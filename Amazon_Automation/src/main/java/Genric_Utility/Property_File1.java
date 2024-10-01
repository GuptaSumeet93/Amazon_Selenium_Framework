package Genric_Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Property_File1 {

	
		
	public String getPropertyKeyValue(String key) throws IOException
 {
	  
FileInputStream fis1=new FileInputStream("./src/test/resources/SearchItem.properties.txt");

        Properties pro1=new Properties();
          pro1.load(fis1);
          String value=pro1.getProperty(key);
          return value;

 
	}
 
}

