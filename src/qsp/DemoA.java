package qsp;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.Lib;

public class DemoA 
{
   static
   {
	   System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
   }
  @Test
 public void TestA()
 {
	  String path1 = "./config.properties";
	  String path2 = "./repository/element.properties";
	  String path3 = "./data/Book1.xlsx";
	  
	  WebDriver driver = new ChromeDriver();
	  String url = Lib.getPpt(path1,"URL");
	  driver.get(url);
	  
	  String unLoc = Lib.getPpt(path2,"UN");
	  String un = Lib.getCellValue(path3,"Sheet1",1,0);
	  driver.findElement(By.name(unLoc)).sendKeys(un);
	  
	  String pwLoc = Lib.getPpt(path2,"PW");
	  String pw = Lib.getCellValue(path3,"Sheet1", 1, 1);
	  driver.findElement(By.name(pwLoc)).sendKeys(pw);
	  
	  String lgLoc = Lib.getPpt(path2,"LOGIN");
	  driver.findElement(By.id(lgLoc)).click();
	  
	  int rc= Lib.getRowCount(path3,"Sheet1");
	  Reporter.log(rc+"",true);
	  
	  int cc = Lib.getColumnCount(path3,"Sheet1",1);
	  Reporter.log(cc+"",true);
      driver.close();
      Lib.setExcelData(path3,"Sheet1",1, 2,"PASS");
 }
}
