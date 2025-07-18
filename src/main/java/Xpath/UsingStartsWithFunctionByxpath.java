package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingStartsWithFunctionByxpath {

	public static void main(String[] args) throws InterruptedException {
	
		//launch the browser
		WebDriver driver = new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//navigate to appln 
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		//	//identify the search tf and pass the text
		driver.findElement(By.xpath("//input[starts-with(@class,\"inputtext _5\")]")).sendKeys("abc123");
		
		Thread.sleep(3000);
		
		//identify the search password and pass the text
		driver.findElement(By.xpath("//input[starts-with(@class,\"inputtext _55r1 _6luy _\")]")).sendKeys("abcde");
		
		Thread.sleep(3000);
		
		//identify the and click on login
		driver.findElement(By.xpath("//button[starts-with(@class,\"_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy\")]")).click();
		
		Thread.sleep(3000);
		driver.quit();
		
		
		

	}

}
