package Browsercommands;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlewindowpopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String projectpath=System.getProperty("user.dir");
		  System.out.println(projectpath);
		  String driverpath=projectpath + "//driver//chromedriver.exe";
		  System.setProperty("webdriver.chrome.driver", driverpath);
		 
		   
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		  driver.findElement(By.name("proceed")).click();
		  
		  
		  Alert alert=driver.switchTo().alert();
		  String error=alert.getText();
		  System.out.println(error);    //alert method
		  
		 
		  //alert.dismiss();  //cancel the popup
		  alert.accept(); //ok button
		  
		  driver.findElement(By.id("login1")).sendKeys("SARIKA");
		  
	}

}
