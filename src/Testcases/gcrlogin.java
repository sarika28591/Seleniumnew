package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gcrlogin {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://gcrit.com/build3/");
		driver.findElement(By.linkText("login")).click();
		driver.findElement(By.xpath("//input[@name= 'email_address']")).sendKeys("acr7282@gmail.com");
		driver.findElement(By.name("password")).sendKeys("1234abcd");
		driver.findElement(By.id("tdb5")).click();
		
		String url=driver.getCurrentUrl();
		if(url.contains("http://www.gcrit.com/build3/index.php")) {
			System.out.println("login pass");
			
		}else {
			System.out.println("login failed");
		}
	}

}
