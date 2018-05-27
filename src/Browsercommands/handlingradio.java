package Browsercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingradio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
		 driver.get("http://toolsqa.com/automation-practice-form/");
		 
		 System.out.println(driver.findElement(By.xpath("//*[@id=\"sex-1\"]")).isDisplayed());   //true
		 System.out.println(driver.findElement(By.xpath("//*[@id=\"sex-1\"]")).isSelected());   //false
		driver.findElement(By.xpath("//*[@id=\"sex-1\"]")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"sex-1\"]")).isSelected());  //true
	}

}
