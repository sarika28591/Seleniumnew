package Browsercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class textareahandling {

	public static void main(String[] args) {
		String projectpath=System.getProperty("user.dir");
		  System.out.println(projectpath);
		  String driverpath=projectpath + "//driver//chromedriver.exe";
		  System.setProperty("webdriver.chrome.driver", driverpath);
		 
		   
		  WebDriver driver=new ChromeDriver();
		  /*driver.get("https://www.gmail.com");
		  String text = driver.findElement(By.xpath("//*[@id=\"headingSubtext\"]")).getText(); 
		  System.out.println(text);   //returns inner text
		  driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
		  String error = driver.findElement(By.xpath(".//*[@id='view_container']/div/div[2]/div/form/div[1]/div/div[2]/div[2]")).getText();
		  System.out.println(error);*/
	  
		  
		  
		  driver.get("https://login.yahoo.com/");
		  driver.findElement(By.xpath("//*[@id=\"login-signin\"]")).click();
		  
		  String a = driver.findElement(By.xpath("//*[@id=\"username-error\"]")).getText();
		  System.out.println(a);  //not worked

	}

}
