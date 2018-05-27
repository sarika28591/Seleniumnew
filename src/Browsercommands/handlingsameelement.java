package Browsercommands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class handlingsameelement {

	

	public static void main(String[] args) {
	   
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.infibeam.com/Login.action?redirectURL=https%3A%2F%2Fwww.infibeam.com%2F");
		driver.findElement(By.xpath(".//*[@id='new-account-btn']")).click();
		
		List<WebElement> list= driver.findElements(By.xpath(".//*[@id='password']"));
		list.get(0).sendKeys("sarika"); //to enter the element in the first password edit box
		list.get(1).sendKeys("sarika");  //to enter the element in the second password edit box
		
		 }
	}

