package Datadriventesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//import java.io.OutputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteBackDataToExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		//convert physical file to java obj file
		 FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\Desktop\\Data.xlsx");
		                                           
		
		//fetch the workbook
        Workbook wb = WorkbookFactory.create(fis);

        //fetch the sheet
        Sheet s = wb.getSheet("data");

        //fetch the row
      //  Row r = s.getRow(3);
        Row r = s.createRow(7);
        
        //create the cell
        Cell c=r.createCell(2);
        
        //set the data
        c.setCellValue("selenium"); 
        
        //converting java obj to physical file
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Admin\\Desktop\\Data.xlsx");
        wb.write(fos);
        
        wb.close();
        
        

        
        
        
        
        
        
        
        
		
		
		
		
		
		

	}

}
