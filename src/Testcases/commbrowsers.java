package Testcases;
import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class commbrowsers {
	
	
	
	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.linkText("Gmail")).click();
	    String text = driver.getTitle();
		
		ChromeDriver driver1=new ChromeDriver();
		driver1.get("http://www.gcrit.com/build3/create_account.php");
		driver1.findElement(By.xpath("//input[@name='firstname']")).sendKeys(text);
		
		driver.close();
		driver1.close();
		
		
	}

}
