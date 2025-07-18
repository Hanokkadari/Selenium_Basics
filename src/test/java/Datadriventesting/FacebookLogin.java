package Datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws IOException {
	
		//launch the browser
		FileInputStream fis = new FileInputStream("./src/test/resources/FacebookData.properties");
		
		 Properties P = new Properties();
		 P.load(fis);
		 
		 
		 
		 String url = P.getProperty("url");
		 
		 String un = P.getProperty("un");
		
		 String pwd = P.getProperty("pwd");
		
		 String Duration =P.getProperty("duration");
		 int TIMEOUTS = Integer.parseInt(Duration);
		 
		 // launch the browser
		 
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 long time=Long.parseLong(Duration);
		 
		 
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(time));
		
		driver.get(url);
		driver.findElement(By.id("email")).sendKeys(un);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		
		driver.findElement(By.name("login")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		 
		 
		 
		 
		 
		 
		 
		
		
		
		
		

	}

}
