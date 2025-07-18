package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class UsingCssSelectorLoc {

	public static void main(String[] args) throws InterruptedException {
	
		
		
		//launch the browser
		WebDriver driver= new EdgeDriver();
		
		//navigate to the appln
		driver.get("https://demowebshop.tricentis.com/login");
		
		driver.findElement(By.cssSelector
		("input[value='search store']")).sendKeys("computers");
		
		driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
		
		

	}

}
