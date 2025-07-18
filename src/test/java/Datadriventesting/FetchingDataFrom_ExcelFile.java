package Datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingDataFrom_ExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream("./src/test/resources/Data.xlsx");
		
		//fetch workbook
		Workbook wb=WorkbookFactory.create(fis);
		
		//fetch sheet from workbook
		Sheet s=wb.getSheet("data");
		
		//fetch the rows from sheet
		Row r=s.getRow(1);
	
		
		//fetch the cells from rows
		Cell c=r.getCell(0);
		
		//fetch the cell value
		String mobile=c.getStringCellValue();
		System.out.println(mobile);
		
		
		
		
		
		
		
		
		

	}

}
