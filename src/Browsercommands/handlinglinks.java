package Browsercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class handlinglinks {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		  //WebDriver driver=new InternetExplorerDriver();
		  driver.get("https://www.google.com");
		  
		 /* System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div/div/div[1]/div[1]/a")).isEnabled());
		  System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div/div/div[1]/div[1]/a")).isDisplayed());
		  //driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div/div/div[1]/div[1]/a")).click();
		  //driver.findElement(By.linkText("Gmail")).click();  //name of the link should enter
		  driver.findElement(By.partialLinkText("Gma")).click();   //enter incomplete text name
*/		  
		  WebElement Gmail = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div/div/div[1]/div[1]/a"));
		  boolean status = Gmail.isDisplayed();
		  System.out.println(status);
		  
		  String name = Gmail.getText();
		  System.out.println(name);
		  
		  boolean a = Gmail.isEnabled();
		  System.out.println(a);
		  
		  Gmail.click();
		  
	}

}
