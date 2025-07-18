package Datadriventesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteBackDataToPropertyFile {

	public static void main(String[] args) throws IOException {
		
		
		//convert physical file to java object
		FileInputStream fis = new FileInputStream("./src/test/resources/commondata.properties");
		 
		 //step 02 create an obj of properties
		 Properties P = new Properties();
		
		 //step 03 load the prop obj
		 P.load(fis);
		 
		
		 
		 
		 //add new file
		 P.put("salaar", "prabhas"   );
		 
		 //remove new data removing the old data
		 P.remove("Animal",  "Ranbir kapoor");
		 
		 
		 
		 //convert prop obj to physical file and save the file
		 FileOutputStream fos = new FileOutputStream("./src/test/resources/commondata.properties");
		 P.store(fos, "Updated");
		 
		 
		 
		

	}

}
