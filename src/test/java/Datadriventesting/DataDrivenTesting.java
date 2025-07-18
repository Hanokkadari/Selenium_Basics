package Datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DataDrivenTesting {

	public static void main(String[] args) throws IOException {

		
		//step 01 converting physical prop file to java obj
 FileInputStream fis = new FileInputStream("./src/test/resources/commondata.properties");
 
 //step 02 create an obj of properties
 Properties P = new Properties();
 
 //step 03 load the prop obj
 P.load(fis);
 
 //STEP 04 FTECH the data 
 String browser = P.getProperty("browser");
 
 //
 String url = P.getProperty("url");
 //
 String un = P.getProperty("un");
//
 String pwd = P.getProperty("pwd");
 
 
 System.out.println(browser);
 System.out.println(url);
 System.out.println(un);
 System.out.println(pwd);
 
 
 
 
		
		
		
		
		
		

	}

}
