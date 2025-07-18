package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingIDLocator {

	public static void main(String[] args) throws InterruptedException {
	
		
		//launch the browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//navigate to appln
		driver.get("https://www.facebook.com/");

		//identify UN TF and pass the text
		driver.findElement(By.id("email")).sendKeys("selenium");
		
		//identify pwsd TF and pass the text
		driver.findElement(By.id("pass")).sendKeys("abc123");
		
		Thread.sleep(3000);
		
		// close the browser
		driver.quit();
		

	}

}
