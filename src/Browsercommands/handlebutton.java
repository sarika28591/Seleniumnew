package Browsercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlebutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String projectpath=System.getProperty("user.dir");
		  System.out.println(projectpath);
		  String driverpath=projectpath + "//driver//chromedriver.exe";
		  System.setProperty("webdriver.chrome.driver", driverpath);
		 */
		   
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.gmail.com");
		  
		  
		  driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("sarika"); 
		  System.out.println(driver.findElement(By.xpath(".//*[@id='identifierId']")).getAttribute("jsname"));
		  
		  System.out.println(driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).isDisplayed());
		  System.out.println(driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).isEnabled());
		  driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
	}

}
