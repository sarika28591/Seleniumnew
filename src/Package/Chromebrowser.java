package Package;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromebrowser {

	public static void main(String[] args) {
	      WebDriver driver=new ChromeDriver();
		  driver.get("https://www.flipkart.com/"); 
		 
		 String obj=driver.getWindowHandle();
		System.out.println(obj);
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();


		 
		/* driver.findElement(By.xpath("//a[@href='/account/login?signup=true']")).click();
		 driver.findElement(By.xpath("//input[@type='text'] [@class='_2zrpKA']")).sendKeys("9503961409");
		 driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c'] [@type='submit']")).click();
		 driver.findElement(By.xpath("//input[@type='text' and @class='_2zrpKA']")).sendKeys("798321");*/
	}

}
