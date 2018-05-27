package sanitytests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelebyid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String projectpath=System.getProperty("user.dir");
		  System.out.println(projectpath);
		  String driverpath=projectpath + "//driver//chromedriver.exe";
		  System.setProperty("webdriver.chrome.driver", driverpath);
		  WebDriver driver=new ChromeDriver();
		  driver.get("http://demoqa.com/registration/");
		  
		  WebElement searchBox = driver.findElement(By.id("name_3_firstname"));
		  searchBox.sendKeys("Sarika");
		  searchBox.submit();
	}

}
