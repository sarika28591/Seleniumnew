package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class adminloginattempts {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://gcrit.com/build3/admin");
		for(int i=1;i<=3;i++) {
		driver.findElement(By.name("username")).sendKeys("admin22");
		driver.findElement(By.name("password")).sendKeys("admin@12333");
		driver.findElement(By.xpath("//*[@id='tdb1']")).click();
		driver.findElement(By.name("username")).clear();
		}
		String error= driver.findElement(By.className("messageStackError")).getText();
		System.out.println(error);

	}

}
