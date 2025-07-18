package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_ActionMethods {

	public static void main(String[] args) throws InterruptedException {
		
		//launch the browser
		WebDriver driver = new ChromeDriver();
		
		// maxmize the window
		driver.manage().window().maximize();
		
		//navigate to appln
		driver.get("https://demowebshop.tricentis.com/");
		
		
		//identify search tf enter the text and clear it
		WebElement searchTF = driver.findElement(By.name("q"));
		
		//enter the text
		searchTF.sendKeys("selenium");
		
		
		//enter the text
		searchTF.clear();
		
		//ENTER THE TEXT
		
		searchTF.sendKeys("mobile");
		
		Thread.sleep(3000);
		
		
		//click on search button
		driver.findElement(By.xpath("//input[@value='Search']")).submit();
		
		Thread.sleep(3000);
		
		//click on login link
		driver.findElement(By.linkText("Login in")).click();
		
		Thread.sleep(3000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
