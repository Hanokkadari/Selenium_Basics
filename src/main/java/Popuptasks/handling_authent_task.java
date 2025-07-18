package Popuptasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class handling_authent_task {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions opt=new ChromeOptions();
		
		opt.addArguments("--disable-notifications");
		
		
	
				WebDriver driver = new ChromeDriver();
				
				
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				
				
				
				
				
				driver.get("https://admin:admin@basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/");
				
				Thread.sleep(3000);
				
				
			
				
		               
			 Thread.sleep(3000);
			 
			 
			 driver.quit();
			 
			 
			 
			}
		
		
		

	}


