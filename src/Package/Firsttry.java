package Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firsttry {

	public static void main(String[] args)
	{
		
		WebDriver driver=new ChromeDriver();
		  driver.get("https://www.google.com/"); //get method
		  
		  String title = driver.getTitle();  //getTitle method
		  System.out.println(title);   //Google title printed
	}

}
