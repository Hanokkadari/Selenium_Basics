package Select_ClassPackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingSingleSelect {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/");
		
		WebElement ddele = driver.findElement(By.id("searchDropdownBox"));
		
		Select s=new Select(ddele);
		s.selectByIndex(7);
		
		Thread.sleep(3000);
		
		
		
		
		
		s.selectByVisibleText("Amazon Devices");
		
		Thread.sleep(3000);
		
		s.selectByVisibleText("Books");
		
		s.selectByVisibleText("Electronics");
		
		
		//fetching all options from dd
		//iterate using for each loop and print the text from the option 
		
		List<WebElement> options=s.getOptions();
		
		for(WebElement ele:options)
			
		{
			System.out.println(ele.getText());
			
		}
		
	  //check the od for single or multi
		System.out.println("Multi select DD :"+s.isMultiple());
		
		//fetch the first selected option 
		WebElement option = s.getFirstSelectedOption();
		System.out.println("First selected option : "+option.getText());
		
		//Fetch all the selected options
		List<WebElement> selected = s.getAllSelectedOptions();
		for(WebElement ele: selected)
		{
			System.out.println("All the selected options : "+ele.getText());
		
		}
		
		
		
		
		
		
		
		driver.quit();
		
		
	
		
		
		
		
		
		
		

		
		

	}

}
