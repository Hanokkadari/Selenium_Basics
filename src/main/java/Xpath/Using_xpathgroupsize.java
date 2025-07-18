package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_xpathgroupsize {

	public static void main(String[] args) throws InterruptedException {
	
   WebDriver driver= new ChromeDriver();
   
   //maximize the window
   driver.manage().window().maximize();
   
   //navigate to appln 
   driver.get("https://demoapps.qspiders.com/ui?scenario=1");
   
   Thread.sleep(10000);
   
   //Identify nameTF
   driver.findElement( By.xpath("(//input)[1]")).sendKeys("selenium");
   
   //Identify emailTF
   driver.findElement(By.xpath("(//input)[2]")).sendKeys("abc@gmail.com");
   
   //identify the password
   driver.findElement(By.xpath("(//input)[3]")).sendKeys("abc123");
   
   //click on login button
   driver.findElement(By.xpath("(//button)[2]")).click();
   
   Thread.sleep(10000);
   
   driver.quit();
   
   
   
   
   
   
   
   
		
		
		
		
		
		
		
		
		
		
	}

}
