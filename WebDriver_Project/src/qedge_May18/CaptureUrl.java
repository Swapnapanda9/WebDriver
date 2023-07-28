package qedge_May18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureUrl {

	public static void main(String[] args) throws Throwable {
		// Create instance object
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://facebook.com/");
		//Suspend tool for 5 seconds
		Thread.sleep(5000);
		//Capture link url in facebook
		String link_url = driver.findElement(By.partialLinkText("Forgotten passwor")).getAttribute("href");
		System.out.println(link_url);
		driver.quit();

	}

}
