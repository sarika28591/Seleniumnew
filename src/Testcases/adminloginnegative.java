package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class adminloginnegative {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://gcrit.com/build3/admin");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin@123");
		driver.findElement(By.xpath("//*[@id='tdb1']")).click();
		
		String url=driver.getCurrentUrl();
		if(url.contains("http://www.gcrit.com/build3/admin/login.php")) {
			String error= driver.findElement(By.className("messageStackError")).getText();
		
		if(error.contains("Invalid administrator login attempt.")) {
			System.out.println("login failed");   //printed
		}
		}else {
			System.out.println("login passed");
		}
			
	}

	}

