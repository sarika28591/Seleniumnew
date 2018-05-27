package sanitytests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelementtag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String projectpath=System.getProperty("user.dir");
		  System.out.println(projectpath);
		  String driverpath=projectpath + "//driver//chromedriver.exe";
		  System.setProperty("webdriver.chrome.driver", driverpath);
		  WebDriver driver=new ChromeDriver();
		  driver.get("http://demoqa.com/registration/");
		  
		  WebElement element = driver.findElement(By.tagName("Submit"));
		// Action can be performed on Input Button element
		  System.out.println(element.getSize());
		  
		 
	}

}
