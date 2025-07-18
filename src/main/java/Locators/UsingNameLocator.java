package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingNameLocator {

	public static void main(String[] args) throws InterruptedException {
	
		//launch the browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the window
				driver.manage().window().maximize();
				
				//navigate to appln
				driver.get("https://www.facebook.com/");
				
				
				
				//find UN textfeild and enter the UN using name locator
				driver.findElement(By.name("email")).sendKeys("selUsingname");
				
				//find pwd textfeild and enter the pwd using name locator
				driver.findElement(By.name("pass")).sendKeys("123321");
				
				
				//click on login buttons
				driver.findElement(By.name("login")).click();
				
				Thread.sleep(2000);
				
				driver.quit();
				
		
		
		
		
		
	}

}
