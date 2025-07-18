package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingSVGTagsUsingNameFunc {

	public static void main(String[] args) throws InterruptedException {
	
		
		//launch the browser
		WebDriver driver = new ChromeDriver();
		
		//maximixe the window
		driver.manage().window().maximize();
		
		//navigate to appln
		driver.get("https://www.flipkart.com/");
		
		
		//identify the search tf and pass the text
		driver.findElement(By.name("q")).sendKeys("toys");
		
		//identify the search icon and click on it
		driver.findElement(By.xpath("//*[name()='svg'][@width='24']")).click();
		
		Thread.sleep(3000);
		
		//close the browser
		driver.quit();
		
		
		
		
	}

}
