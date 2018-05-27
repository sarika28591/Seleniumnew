package Browsercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class returnvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String projectpath=System.getProperty("user.dir");
		  System.out.println(projectpath);
		  String driverpath=projectpath + "//driver//chromedriver.exe";
		  System.setProperty("webdriver.chrome.driver", driverpath);
		  
		WebDriver driver=new ChromeDriver();
		  driver.get("https://www.gmail.com/");
		  
		  driver.findElement(By.id("identifierId")).sendKeys("sarika"); 
		  System.out.println(driver.findElement(By.id("identifierId")).getAttribute("value"));
		  System.out.println(driver.findElement(By.id("identifierId")).getText());
	
	}
	
}
