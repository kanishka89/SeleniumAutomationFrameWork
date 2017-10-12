package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DemoB {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
	    String path="./data/Book1.xlsx";
	    
	 /*   FileInputStream fis= new FileInputStream(path);
	    
	    //1. Open the Xl file
	    Workbook wb = WorkbookFactory.create(fis);
	    
	    //2.Go to sheet1
	     Sheet s = wb.getSheet("Sheet1");
	     
	    //3. Go To Row 1
	     Row r = s.getRow(1);
	     
	     //4. Go to Cell 0
	     
	     Cell c = r.getCell(1);
	     
	     //5. Get The value 
	     
	    // String v = c.getStringCellValue();
	     String v = c.toString();*/
	     Workbook wb = WorkbookFactory.create(new FileInputStream(path));
	     
	     String v =  wb.getSheet("Sheet1").getRow(1).getCell(1).toString();
	     
	     System.out.println(v);
	     
	    
	     
	     
	    
	    
	    
	    
	    

	}

}
