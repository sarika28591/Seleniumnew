package Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsercommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		 
		  
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.google.com/"); //get method
		  
		  String title = driver.getTitle();  //getTitle method
		  System.out.println(title);   //Google title printed
		  
		  String pagesource = driver.getPageSource(); 
		  System.out.println(pagesource);  //displays page source all data
		  
		  String URL = driver.getCurrentUrl();
		  System.out.println(URL);    // returns current url in console
		  
		  
		  
		  
		  
		  
	}

}
