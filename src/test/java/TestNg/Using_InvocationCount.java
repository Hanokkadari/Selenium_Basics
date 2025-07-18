package TestNg;

import org.testng.annotations.Test;

public class Using_InvocationCount {
	
	@Test(priority=2,groups="smoke")
	public void manual() {
		System.out.println("Manual");
		
		
	}
	
	@Test(priority=1,groups="regression")
	public void sql() {
		System.out.println("sql");
	}
	
	@Test(priority=3,invocationCount = 5 )
	public void java() {
		System.out.println("java");
		
	}
	
	
	
	
}

