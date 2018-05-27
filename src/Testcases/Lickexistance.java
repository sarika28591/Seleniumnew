package Testcases;

//import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Lickexistance {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		//1.System.out.println(driver.findElement(By.linkText("Gmail")).isDisplayed());   //check existance
        //if loop
		
		
		/*2.if(driver.findElement(By.linkText("Gmail")).isDisplayed()) {
			System.out.println("gmail link exists");
		}else {
			System.out.println("gmail link not  exists");
		}*/
		
		/*3.boolean a=driver.findElement(By.linkText("Gmail")).isDisplayed();
		if(a==true) {  //double equal = equal
			System.out.println("gmail link exists");
		}else {
			System.out.println("gmail link not  exists");
		}*/ 
		
	   try {
	   if(driver.findElement(By.linkText("Gmailabc")).isDisplayed()) 
	   {
			System.out.println("gmail link exists");
	   }
		}
		catch(NoSuchElementException e) {
			System.out.println("gmail link not exists");
		}
		}
	}	


