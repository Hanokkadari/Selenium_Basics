package Datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingMutlipleDataFrom_ExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
		//convert physical file to java obj file
        FileInputStream fis=new FileInputStream("./src/test/resources/Data.xlsx");

        //Create workbook
        Workbook wb = WorkbookFactory.create(fis);

        //fetch the sheet
        Sheet s = wb.getSheet("data");

        //fetch the all the data from the sheet
        Row r = s.getRow(1);
        Cell c = r.getCell(0);
        for(int i=0; i<=s.getLastRowNum();i++) {
            for(int j=0; j<s.getRow(i).getLastCellNum(); j++) {
                Cell value = s.getRow(i).getCell(j);
                System.out.println(value+" ");
            }
            
            
            
            System.out.println("");
        }
        wb.close();
    }

	
		
		
		
		
		

	}


