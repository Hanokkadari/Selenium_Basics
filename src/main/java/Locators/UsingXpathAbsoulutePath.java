package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpathAbsoulutePath {

	public static void main(String[] args) throws InterruptedException {
	
		
		//launch the  browser
		WebDriver driver= new ChromeDriver();
		
		
		//maximize the window
		driver.manage().window().maximize();
		
		//navigate to appln 
		driver.get("https://demowebshop.tricentis.com/login");
		
		
		Thread.sleep(3000);
		
		//identify search text field and enter some product name 
		//driver.findElement(By.xpath("./html/body/div/div/div[1]/div[3]/form/input[1]")).sendKeys("computer");
		
		//identify the computer icon and enter
		driver.findElement(By.xpath("./html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/a")).click();
		
		//Thread.sleep(3000);
		
		//identify search icon button and click 
		//driver.findElement(By.xpath("./html/body/div/div/div[1]/div[3]/form/input[2]")).click();
		
		Thread.sleep(5000);
		
		
		//identify desktop icon and click in this
		driver.findElement(By.xpath("./html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[1]/div[1]/div/h2")).click();
		
		

	}

}
