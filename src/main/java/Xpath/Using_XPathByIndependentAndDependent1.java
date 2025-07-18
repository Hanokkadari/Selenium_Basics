package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_XPathByIndependentAndDependent1 {

	public static void main(String[] args) throws InterruptedException {
	
		//Launch the browser
		WebDriver driver= new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//navigate to an appln
		driver.get("https://www.selenium.dev/");
		
		//click on downloads
		driver.findElement(By.xpath("(//a[@class='nav-link'])[1]")).click();
		
		Thread.sleep(3000);
		
		//identify java selenium version and print out
		WebElement version = driver.findElement(By.xpath("//p[text()='Java']/../p/a[text()='4.33.0 (May 23, 2025)']"));
		
		System.out.println(version.getText());
		
		
		
		
		
		
		
	}

}
