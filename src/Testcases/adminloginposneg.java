package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.NoSuchElementException;

public class adminloginposneg {
	
	static int i;
	static String username,password,iteration;

	public static void main(String[] args) throws InterruptedException {
		// valid and invalid inputs
		
		WebDriver driver=new ChromeDriver();
		
		
		for(i=1;i<=2;i++) {
			
			if(i==1) {
				username="admin";
				password="admin@123";
				iteration="iteration 1:";
			}
			else if (i==2) {
				username="admin12";
				password="admin123d";
				iteration="iteration 2:";
			}
	    driver.get("http://gcrit.com/build3/admin");
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		
		driver.findElement(By.xpath("//*[@id='tdb1']")).click();
		//Thread.sleep(5000);
		
		String url=driver.getCurrentUrl();
		
		
		if(url.contains("http://www.gcrit.com/build3/admin/index.php")) {
			System.out.println(iteration + ("Input data ") + username  + ", " + password + " Admin login passed");
			driver.findElement(By.xpath("/html/body/table[1]/tbody/tr[2]/td[2]/a")).click();
			//Thread.sleep(5000);
		}
			else if(! url.contains("http://www.gcrit.com/build3/admin/index.php")) {
			String error= driver.findElement(By.className("messageStackError")).getText();
		    if(error.contains("Invalid administrator login attempt.")) {
		    	System.out.println(iteration + ("Input data") + username + ", " + password + "Handling invalid inputs-passed");
		    }else {
		System.out.println(iteration + "Handling invalid inputs-failed");   //printed
		}
		
		}
	}
		driver.close();
	}
}

