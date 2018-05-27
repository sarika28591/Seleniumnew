package Browsercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehoverhandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.carmax.com/");
		 
		 //Create action builder by passing webdriver instance
	Actions builder =new Actions(driver);//creating instance in action class by passing driverinstnce
	WebElement menu=driver.findElement(By.linkText("CARS FOR SALE"));
	builder.moveToElement(menu).build().perform();   //build to perform operations
	driver.findElement(By.linkText("Transfers")).click();
	
	}
	

}
