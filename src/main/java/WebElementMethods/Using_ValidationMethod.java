package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_ValidationMethod {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement sub_TF = driver.findElement(By.id("newsletter-email"));
		
		sub_TF.click();
		
		
		if (sub_TF.isDisplayed() )  {
			
		sub_TF.sendKeys("selenium");
		
		}
		else {
			
			System.out.println("Element is not displayed");
			
			
			
		
		
		
		
		}
		
		
		WebElement sub_button = driver.findElement(By.id("newsletter-subscribe"));
		
		if(sub_button.isEnabled()) {
			
			sub_button.click();
			
		}
		
		else
			
			System.out.println("Selected");
		
		Thread.sleep(3000);
		
		
		// writing whether the R_Btn is selected on webpage
		WebElement ex_rbtn = driver.findElement(By.id("pollanswers-1"));
		
		
		ex_rbtn.click();
		
		if (ex_rbtn.isSelected())
			
		{
			
			System.out.println("Selected");
			
		}
		
		else {
			
			System.out.println("Not seleceted");
			
			
			
			
			
			
			
			
			
		
		
		
		
		
		
		
			
			
		}
		
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
		

	}

}
