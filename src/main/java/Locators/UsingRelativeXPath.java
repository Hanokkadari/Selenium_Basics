package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingRelativeXPath {

	public static void main(String[] args) throws InterruptedException {
		
		
		//launch the broswer
		WebDriver driver= new ChromeDriver();
   		
		
		//navigate to appln 
	    driver.get("https://demowebshop.tricentis.com/login");
	    
	    Thread.sleep(5000);
	    
	    //identify search bar text field and enter some product name
	    driver.findElement(By.xpath("//form//input[1]")).sendKeys("computer");
	    
	    Thread.sleep(5000);
	    
	    //identify search icon and click on it
	    driver.findElement(By.xpath("//form//input[2]")).click();
	    
	    
	    
	    
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
