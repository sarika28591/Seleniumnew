package Browsercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleimage {

	public static void main(String[] args) {
		  /*String projectpath=System.getProperty("user.dir");
		  System.out.println(projectpath);
		  String driverpath=projectpath + "//driver//chromedriver.exe";
		  System.setProperty("webdriver.chrome.driver", driverpath);*/
		  
		   
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.google.com");
		 
		  System.out.println(driver.findElement(By.id("hplogo")).getAttribute("alt"));   //google
		  System.out.println(driver.findElement(By.id("hplogo")).isDisplayed());   //true
		  
		  //navigate to another page
		  driver.navigate().to("http://newtours.demoaut.com/");
		 driver.findElement(By.name("login")).click();
		  
		//navigate to another page
		 driver.navigate().to("https://www.seleniumhq.org/");
		 driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/table/tbody/tr/td[2]/center/a/img")).click();
		 
	}

}
