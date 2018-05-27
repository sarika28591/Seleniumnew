package Browsercommands;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Crossbrowser {
	public static WebDriver driver;
	public static int browser;
	public static String BrowserName;
	
	public static void main(String[] args) {
		for (browser = 1; browser <= 2; browser++) {
			if (browser==1) {
				 driver=new ChromeDriver();
				 BrowserName="Mozilla Firefox Browser::";
			}else if (browser==2)  {
				driver=new FirefoxDriver();
				BrowserName="Google Chrome Browser";
			}
			 driver.get("https://www.google.com");
			  
		      String pagetitle=driver.getTitle();
		      if(pagetitle.equals("Google")) {
		    	  System.out.println(BrowserName+"ok");
		      }else {
		    	  System.out.println(BrowserName+"not ok");
			}
		      driver.close();
		}
		

     
	}
}

