package Testcases;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class adminoginuserdefined {
	public static WebDriver driver;
	
	public void Launchbrowser() {
	driver=new ChromeDriver();
	}
	
	//method without argument
	public void AdminLogin() {
		
		driver.get("http://gcrit.com/build3/admin");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin@123");
		driver.findElement(By.xpath("//*[@id='tdb1']")).click();
	}
	
	//method with argument and overloading
      public void AdminLogin(String username,String password) {
		
		driver.get("http://gcrit.com/build3/admin");
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id='tdb1']")).click();
	}

      public void Closebrowser() {
    	  if(! driver.toString().contains("null")) {
    	  driver.close();
      }
      }
      
    
	public static void main(String[] args) {
		adminoginuserdefined obj =new adminoginuserdefined();
		obj.Launchbrowser();
		obj.AdminLogin();
		obj.Closebrowser();
		obj.Launchbrowser();
	    obj.AdminLogin("admin","admin@123");
	}

}
