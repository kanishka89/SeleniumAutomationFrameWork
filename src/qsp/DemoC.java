package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import generic.Lib;
import generic.Lib1;

public class DemoC
{
    static
    {
    	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
    }
    
    @Test
    public void test1()
    {
    	String path1 = "./config.properties";
    	String path2 = "./repository/element.properties";
    	String path3 = "./data/Book1.xlsx";
    	
    	WebDriver driver = new ChromeDriver();
    	String url = Lib1.getPpt(path1,"URL");
    	driver.get(url);
    	
    	String unLoc = Lib1.getPpt(path2,"UN");
    	String un = Lib1.getCellValue(path3,"Sheet1",1,0);
    	driver.findElement(By.name(unLoc)).sendKeys(un);
    	
    	String pwLoc = Lib1.getPpt(path2,"PW");
    	String pw = Lib1.getCellValue(path3,"Sheet1",1,1);
    	driver.findElement(By.name(pwLoc)).sendKeys(pw);
    	
    	String loginLoc = Lib.getPpt(path2,"LOGIN");
    	driver.findElement(By.id(loginLoc)).click();
    	
    	
    	
    }
}
