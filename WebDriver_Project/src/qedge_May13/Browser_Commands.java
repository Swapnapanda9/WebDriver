package qedge_May13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Commands {

	public static void main(String[] args) throws Throwable  {
		// Create path for chrome driver // 1st step
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		//Create instance object 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // 2nd step
		//Delete all cookies in a browser // 3rd step
		driver.manage().deleteAllCookies();
		// Lunch url //4th step // 4th step
		driver.get("http://google.com");
		// suspend tool for 5 sec // 5th step
		Thread.sleep(5000);
		driver.close();
		
		
		

	}

}
