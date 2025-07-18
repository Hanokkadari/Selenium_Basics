package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_xpathIndependentandDependent {

	public static void main(String[] args) {
	
		
			WebDriver driver= new ChromeDriver();
			
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("toys"+Keys.ENTER);
		
		WebElement price = driver.findElement(By.xpath("//a[contains(text(),'Nexteesh ')]/../a[@class='DMMoTO']/div/div[@class='Nx9bqj']"));
		
		System.out.println(price.getText());
		
		driver.quit();
				
		
		
		
		
		
		

	}

}
