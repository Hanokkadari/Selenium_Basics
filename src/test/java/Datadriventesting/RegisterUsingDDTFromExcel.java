package Datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterUsingDDTFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		//convert physical file to java obj file
        FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\Desktop\\Register.xlsx");

        //Create workbook
        Workbook wb = WorkbookFactory.create(fis);

        //fetch the sheet
        Sheet s = wb.getSheet("data");
        
        //fetch the row
        Row r = s.getRow(0);
        Cell c = r.getCell(0);
        String un=c.getStringCellValue();
        
        Row r2 = s.getRow(1);
        Cell c2 = r2.getCell(0);
        String pwd=c2.getStringCellValue();
        
        Row r3 = s.getRow(2);
        Cell c3 = r3.getCell(0);
        String email=c3.getStringCellValue();
        
        

        Row r4 = s.getRow(3);
        Cell c4 = r4.getCell(0);
        String url=c4.getStringCellValue();
        
		
		//launch the browser
        WebDriver driver = new ChromeDriver();
    	
    	driver.manage().window().maximize();
    	
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	
    	driver.get(url);
    	
    	Thread.sleep(3000);
    	
    	driver.findElement(By.id("name")).sendKeys(un);
    	
    	driver.findElement(By.id("email")).sendKeys(email);
    	
    	driver.findElement(By.id("password")).sendKeys(pwd);
    	
    	wb.close();
    	
    	Thread.sleep(3000);
    	
    	driver.quit();
    	
    	
    	
    	
    	

	}

}
