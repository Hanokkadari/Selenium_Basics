package Select_ClassPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ActionClassPractice {

	public static void main(String[] args) throws InterruptedException {
		
		
		//launch the browser
		WebDriver driver = new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to application
		driver.get("https://www.flipkart.com/");

		Actions act=new Actions(driver);
		WebElement mouse = driver.findElement(By.xpath("//span[text()='Fashion']"));
		act.moveToElement(mouse).perform();
		
		driver.findElement(By.linkText("Mens's Bottom Wear")).click();
		Thread.sleep(3000);
		
		WebElement ddle = driver.findElement(By.className("Gn+jFg"));
		
		Select s=new Select(ddle);
		s.selectByValue("250");
		
		Thread.sleep(3000);
		WebElement ddle2 = driver.findElement(By.xpath("//div[@class='tKgS7w']/select[@class='Gn+jFg']"));
		Select s1=new Select(ddle2);
		s1.selectByValue("1000");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Newest First']")).click();
		
		Thread.sleep(3000);
		
		WebElement price = driver.findElement(By.xpath("//a[contains(text(),'Solid')]"
				+"/ancestor::div[contains(@class,'h')]"
				+"/descendant::a[contains(@class,'+')]"
				+"/descendant::div/descendant::div[text()='₹292']"));
		System.out.println(price.getText());
		
	}	
	}


