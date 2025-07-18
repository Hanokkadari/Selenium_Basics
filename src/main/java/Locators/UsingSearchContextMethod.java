package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingSearchContextMethod {

	public static void main(String[] args) {
	
		// launch the browser
				WebDriver driver = new ChromeDriver();
				
				//maximize the window
				driver.manage().window().maximize();
				
				//enter thr url
				driver.get("https://www.flipkart.com/");
				
				//find the username textfield and pass the text
				driver.findElement(By.xpath("__LOADABLE_REQUIRED_CHUNKS___ext")).sendKeys("mobiles");
		
		

	}

}
