package Browsercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framehandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		 driver.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
		 
		 driver.switchTo().frame(2);   //switching to the frame
		 driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
		 
		 driver.switchTo().frame("packageFrame");   //switching to frame by name
		 driver.findElement(By.linkText("AcceptAlert")).click();
		
		 
	}

}
