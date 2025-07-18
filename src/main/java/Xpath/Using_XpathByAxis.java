package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Using_XpathByAxis {

	public static void main(String[] args) throws InterruptedException {
		
		//launch the browser
		WebDriver driver=new EdgeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//naviagte to an appln
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("(//input[@tabindex='0'])[1]")).sendKeys("toys"+Keys.ENTER);
		
		Thread.sleep(3000);
		
	//WebElement	price=driver.findElement(By.xpath("//span[contains(text(),'Wires')]/ancestor::div[contains(@class,'a-section')]/descendant::span[@class='a-price-whole']"));
		WebElement price=driver.findElement(By.xpath("//span[contains(text(),'Gooyo DB2060 Rechargeable 360° Rotating & Rolling Small Stunt Car Toy with USB Cable & Remote Controller | B')]/parent::h2/parent::a/parent::div/parent::div/child::div[@class='a-section a-spacing-none a-spacing-top-small s-price-instructions-style']/child::div/child::div[@class='a-row']/child::a/child::span[@class='a-price']/child::span[@class='a-offscreen']"));
		System.out.println(price.getText());

	}

}
		
		
	
		
		

