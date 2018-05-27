package Browsercommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsernavigationcommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String projectpath=System.getProperty("user.dir");
		  System.out.println(projectpath);
		  String driverpath=projectpath + "//driver//chromedriver.exe";
		  System.setProperty("webdriver.chrome.driver", driverpath);
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.google.com/");
		  
		  String URL = driver.getCurrentUrl();
		  System.out.println(URL); 
		  
		  driver.navigate().to("https://in.yahoo.com/?p=us");
		  
		   URL = driver.getCurrentUrl();
		   System.out.println(URL); 
		   
		   driver.navigate().back(); 
		   URL = driver.getCurrentUrl();
		   System.out.println(URL); 
		   
		   driver.navigate().forward(); // back method needed
		   URL = driver.getCurrentUrl();
		   System.out.println(URL); 
		   
		   driver.navigate().refresh();  //refresh current webpage
		   URL = driver.getCurrentUrl();
		   System.out.println(URL); 
		   
		   //Thread.sleep(10000); //1sec
		   driver.close();
	}

}
