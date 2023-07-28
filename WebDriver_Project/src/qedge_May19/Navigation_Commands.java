package qedge_May19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_Commands {

	public static void main(String[] args) throws Throwable {
		// Create instance object
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https:/google.com");
		Thread.sleep(5000);
		System.out.println("page title[1]"+driver.getTitle());
		//Click Gmail link in google page
		driver.findElement(By.linkText("Gmail")).click();
		System.out.println("page title[2]"+driver.getTitle());
		Thread.sleep(5000);
		//Click back button in a browser
		driver.navigate().back();
		System.out.println("page title[3]"+driver.getTitle());
		Thread.sleep(5000);
		//CLick Forward button in a browser
		driver.navigate().forward();
		System.out.println("page title[4]"+driver.getTitle());
		Thread.sleep(5000);
		//Refresh browser
		driver.navigate().refresh();
		Thread.sleep(5000);
		
		

	}

}
