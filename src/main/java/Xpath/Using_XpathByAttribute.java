package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_XpathByAttribute {

	public static void main(String[] args) {

		
		//launch the browser
		WebDriver driver = new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//navigate to appln
		driver.get("https://www.flipkart.com/");
		
		//find search field and enter text using xpath by atrribute
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("Mobile" + Keys.ENTER);
		
		
		
		//Click on popularity button using text()
		driver.findElement(By.xpath("//div[text()='Popularity']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
