package sanitytests;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class adminlogin {

public static void main(String[] args) {
	//File file = new File("C:/driver/chromedriver.exe");
	
	  String projectpath=System.getProperty("user.dir");
	  System.out.println(projectpath);
	  String driverpath=projectpath + "//driver//chromedriver.exe";
	  System.setProperty("webdriver.chrome.driver", driverpath);
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com/"); //get method
	  
	  //String title = driver.getTitle();  //getTitle method
	  //System.out.println(title);   //Google title printed
	  
	  //String pagesource = driver.getPageSource(); 
	  //ystem.out.println(pagesource);  //displays page source all data
	  
	  
	  
	  
	//System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
	//WebDriver driver = new ChromeDriver(); //driver created
	//driver.get("http://www.gcrit.com/build3/admin/");
//webdriver interface
//driver.close(); //closes the browser
}

}

