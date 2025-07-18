package BaseClassUtilities;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	@BeforeSuite
	public void bs() {
		
		System.out.println("BS-conncetion with DB");
		

	}
	
	
	@AfterSuite
	public void as() {
		System.out.println("AS-Disconnect DB");
		
	}
	
	@BeforeTest
	public void bt() {
		System.out.println("BT-Start parallel execution");
		
		
	}
	
	@AfterTest
	public void at() {
		System.out.println("AT-Stop parallel execution");
		
		
		
	}
	
	@BeforeClass
	public void bc() {
		System.out.println("BC-Launch browser");
		
	}
	
	
@AfterClass
	public void ac() {
		System.out.println("AC-close browser");
		
	}
	
	
	@BeforeMethod
	public void bm() {
		System.out.println("BM-login");
		
	}
	
	@AfterMethod
	public void am() {
		System.out.println("AM-logout");
		
	}
	
	
	
	
	
	

}
