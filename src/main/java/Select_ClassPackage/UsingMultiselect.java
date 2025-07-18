package Select_ClassPackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingMultiselect {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		
		
		WebElement mdd =driver.findElement(By.id("select-multiple-native"));
			
			
		Select s= new Select(mdd);
	
		s.selectByValue(" 4TB Gaming Drive Works with Playstation 4 Portable External Hard Drive");
		
		s.selectByIndex(7);
		
		s.selectByVisibleText("WD 4TB Gaming Drive ...");
		
		//fetch the all options
		List<WebElement> se  = s.getAllSelectedOptions();
		for (WebElement el:se) {
			
			System.out.println("all options : "+el.getText());
			
			
			
		}
		
		List<WebElement> sal = s.getOptions();
		for(WebElement al:sal) {
			
			System.out.println("all options : "+al.getText());
			
		}
		
		
			//deselect all selected elements
		    s.deselectByIndex(1);
		    
		    Thread.sleep(3000);
		    
		    s.deselectByValue(" 4TB Gaming Drive Works with Playstation 4 Portable External Hard Drive");
		    
		   Thread.sleep(3000);
		   
		   s.deselectByVisibleText("WD 4TB Gaming Drive ...");
		   
		   Thread.sleep(3000);
		   
		   driver.quit();
		   
	   
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		

	}

}
;