package qedge_May24;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandlingMultipleWindows {

	public static void main(String[] args) throws Throwable {
		//Create instance object
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://gmail.com");
		//Suspend tool for 5 seconds
		Thread.sleep(5000);
		//Print parent window id
		String parent = driver .getWindowHandle();
		System.out.println(parent);
		//Click three links
		driver.findElement(By.linkText("Help")).click();
		driver.findElement(By.linkText("Privacy")).click();
		driver.findElement(By.linkText("Terms")).click();
		//get collection of all window ids
		Set<String> brw = driver.getWindowHandles();
		System.out.println(brw);
		//Iterate all the windows
		for (String each : brw) 
		{
		//Parent id should not be equals to child window
			if (!parent.equals(each)) {
				//Switch to each child window print titles and close one by one
				Thread.sleep(5000);
				String pageTitle = driver.switchTo().window(each).getTitle();
				System.out.println(pageTitle);
				driver.close();
				Thread.sleep(5000);
			}
			//Switch back to parent window
			Thread.sleep(3000);
			driver.switchTo().window(parent);
			driver.findElement(By.name("identifier")).sendKeys("swapnapanda809@gamil.com");
			Thread.sleep(5000);
			driver.close();
		}
	
		

	}

}
