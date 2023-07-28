package qedge_May15;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Verify_Url

{

	public static void main(String[] args) throws Throwable {
		// Create instance object
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//Lunch Url
		driver.get("https://gmail.com");
		Thread.sleep(5000);
		String Expected = "https://";
		String Actual = driver . getCurrentUrl();
		if(Actual.startsWith(Expected))
		{
			System.out.println("url is secured::"+Expected+ "   "+Actual);
			
		}
		else {
			System.out.println("url is not secured::"+Expected+"  "+Actual);
		}
			driver.quit();
		

	}

}
