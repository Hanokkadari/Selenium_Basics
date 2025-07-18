package Using_DataProviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderUsing2DArray {
	
	
	
	@Test(dataProvider="data")
	public void fbLogin(String un,String pwd) {
		
		System.out.println(un+"  "+pwd);
		
		
		
	}
	
	
	@DataProvider
	public Object[][] data() {
		Object[][] obj = new Object[2][2];
		obj[0][0]="selenium1";
		obj[0][1]="java1";
		obj[1][1]="java2";
		
		return obj;
		
		
		
	}
			
	
	
	
	
	
	
	
	
	
	
	

}
