package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linksintext {

	public static void main(String[] args) {
	   
WebDriver driver=new ChromeDriver();
driver.get("https://en.wikipedia.org/wiki/Selenium_(software)");
driver.findElement(By.linkText("Create account")).click();
//System.out.println(driver.getCurrentUrl());   //printed url
String url = driver.getCurrentUrl();

if(url.contains("wikipedia.org")) {
	System.out.println("it is an internal link");   //printed
}else {
	System.out.println("it is an external link");
}


driver.navigate().back();
driver.findElement(By.linkText("www.seleniumhq.org")).click();
//System.out.println(driver.getCurrentUrl());     //printed new url
url = driver.getCurrentUrl();

if  (! url.contains("wikipedia.org")) {
	System.out.println("it is an external link");  //printed
}else {
	System.out.println("it is an internal link");
}

driver.close();
	}

}
