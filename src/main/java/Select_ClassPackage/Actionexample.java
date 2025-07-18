package Select_ClassPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Actionexample {

	public static void main(String[] args) throws InterruptedException {
	
		
		
		//LAUNCH THE BROWSER
			  WebDriver driver= new ChromeDriver();
				
				//MAXIMIZE THE WINDOW
				driver.manage().window().maximize();
				
		       //IMPLICIT WAIT
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				//NAVIGATE TO AN APPLICATION
				driver.get("https://www.flipkart.com/");
				
				
				Actions act=new Actions(driver);
				WebElement mouse = driver.findElement(By.xpath("//span[text()='Fashion']"));
				act.moveToElement(mouse).perform();
				
				driver.findElement(By.linkText("Men's Bottom Wear")).click();
				Thread.sleep(3000);
				
				WebElement ddele = driver.findElement(By.className("Gn+jFg"));
				
				Select s=new Select(ddele);
				s.selectByValue("250");
		         
				Thread.sleep(3000);
				WebElement ddele2 = driver.findElement(By.xpath("//div[@class='tKgS7w']/select[@class='Gn+jFg']"));
				Select s1=new Select(ddele2);
				s1.selectByValue("1000");
				
				Thread.sleep(3000);
			    driver.findElement(By.xpath("//div[text()='Newest First']")).click();
			    
			    Thread.sleep(3000);
			    
			    WebElement price = driver.findElement(By.xpath("(//div[@class='_1sdMkc LFEi7Z'])[1]/descendant::div[@class='Nx9bqj']"));
				System.out.println(price.getText());
			}
			

		

	}


