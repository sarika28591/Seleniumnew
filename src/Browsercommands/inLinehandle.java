package Browsercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class inLinehandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver=new FirefoxDriver();
		  driver.get("https://www.google.com");
		  /*driver.findElement(By.xpath(".//*[@id='gbwa']/div[1]/a")).click();
		  
		  driver.findElement(By.xpath(".//*[@id='gb36']/span[1]")).click();
		  driver.navigate().back();*/
		  
		  
		  driver.findElement(By.xpath(".//*[@id='gbwa']/div[1]/a")).click();
		  driver.findElement(By.xpath(".//*[@id='gbwa']/div[2]/a[1]")).click();   //more button click to get the remaining options
		  driver.findElement(By.xpath(".//*[@id='gb300']/span[1]")).click();    //hangout click
		  
				  
	}

}
