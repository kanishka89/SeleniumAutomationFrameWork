package generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Lib
{
   public static String getPpt(String path,String key)
   {
     String v ="";
	   try
      {
    	  Properties p = new Properties();
          p.load(new FileInputStream(path));
          v = p.getProperty(key);
      }
      catch(Exception e)
      {
    	  
      }
	   return v;
   }

   public static String getCellValue(String path,String sheet,int r,int c)
   {
	   String v="";
     try
     {
    	 Workbook wb = WorkbookFactory.create(new FileInputStream(path));
    	 v = wb.getSheet(sheet).getRow(r).getCell(c).toString();
     }
    catch(Exception e)
     {
    	
     }
   return v;
  }
public static int getRowCount(String path,String sheet)
{
	int rc=0;
	try
	{
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		rc= wb.getSheet(sheet).getLastRowNum();
	}
	catch(Exception e)
	{
		
	}
  return rc;
}
public static int getColumnCount(String path,String sheet,int r)
{
	int cc=0;
	try
	{
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		cc= wb.getSheet(sheet).getRow(r).getLastCellNum();
	}
	catch(Exception e)
	{
		
	}
 return cc;
}

public static void setExcelData(String path,String sheet,int rn,int cn,String data)
{
	try
	{
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		Sheet s = wb.getSheet(sheet);
		Row r = s.getRow(rn);
		Cell c = r.createCell(cn);
		c.setCellType(c.CELL_TYPE_STRING);
		c.setCellValue(data);
		FileOutputStream fos = new FileOutputStream(path);
		wb.write(fos);
		
	}
	catch(Exception e)
	{
		
	}
}
}
