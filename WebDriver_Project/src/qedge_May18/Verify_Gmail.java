package qedge_May18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Gmail {

	public static void main(String[] args) throws Throwable {
		// Create instance object
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://google.com");
		Thread.sleep(5000);
		//Capture Gmail text in Goole page
		String Expected = driver.findElement(By.linkText("Gmail")).getText();
		String Actual = "gmail";
		if(Expected.equalsIgnoreCase(Actual))
		{
		System.out.println("Link name matching::"+Expected+ "  "+Actual);
		

	}
		else
		{
			System.out.println("Link name not mactching::"+Expected+"  "+Actual);	
		}
		driver.quit();
	}
}

	
	
      