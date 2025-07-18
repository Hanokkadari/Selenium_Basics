package ListenersUtilities;

import org.testng.ISuite;
import org.testng.ITestResult;

public class Listners {


	public void onStart(ISuite suite ) {
		System.out.println("Suite Starts");
		
	}
	
	
	public void onFinish(ISuite suite ) {
		System.out.println("Suite finished");
		
	}
	
	public void onTestStart(ITestResult result)  {
		System.out.println("Test executins started");
		
		
	}
	
	public void onTestSuccess(ITestResult result)  {
		System.out.println("Test execution succes");
		
		
		
	}
	
	
	
	public void onTestFailure(ITestResult result)  {
		System.out.println("Test failed");
		
		
	}
	
	public void onTestSkipped(ITestResult result )  {
		System.out.println("Test skipped");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
