package TestNg;
	
	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

	public class Fb_login_DP {
		
		@DataProvider
		public Object[][] data() {
			//create an object of 2d object
			Object[][] obj=new Object[2][2];
			obj[0][0]="diveshraj";
			obj[0][1]="diveshraj78";
			obj[1][0]="david";
			obj[1][1]="david789";
			return obj;
		}
		
		@Test(dataProvider = "data")
		public void fblogin(String un,String pswd) throws InterruptedException {
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			//navigate to web page
			driver.get("https://www.facebook.com/");
			
			Thread.sleep(3000);
			
			
			//enter username from data providers
			driver.findElement(By.id("email")).sendKeys(un);
			//enter pswd from data providers
			driver.findElement(By.id("pass")).sendKeys(pswd);
			driver.findElement(By.name("login")).click();
			
			driver.quit();
			
			
		}

	}
	
	
	
	
	
	
	
	


