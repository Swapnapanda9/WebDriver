package qedge_May25;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) throws Throwable {
		// Create instance object
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://gmail.com");
		//suspend tool for 5 seconds
		Thread.sleep(5000);
		//Click three links
		driver.findElement(By.linkText("Help")).click();
		driver.findElement(By.linkText("Privacy")).click();
		driver.findElement(By.linkText("Terms")).click();
		//Store all windows into arraylist
		ArrayList<String> brw = new ArrayList<String>(driver.getWindowHandles());
		//Switch to google account help window
		driver.switchTo().window(brw.get(3));
		Thread.sleep(3000);
		//Click community link
		driver.findElement(By.linkText("Community")).click();
		Thread.sleep(3000);
		driver.close();
		//Switch to terms window
		driver.switchTo().window(brw.get(1));
		Thread.sleep(3000);
		//Click FAQ link
		driver.findElement(By.xpath("(//a[text()='FAQ'])[1]")).click();
		Thread.sleep(3000);
		driver.close();
		//Switch parent window
		driver.switchTo().window(brw.get(0));
		//click create account link
		driver.findElement(By.xpath("//span[normalize-space()='Create account']")).click();
		Thread.sleep(4000);
		//click for my personal use
		driver.findElement(By.xpath("//span[normalize-space()='For my personal use']")).click();
		Thread.sleep(4000);
		driver.close();
		//switch to Privacy window
		driver.switchTo().window(brw.get(2));
		Thread.sleep(4000);
		//click to terms and services
		driver.findElement(By.xpath("(//a[contains(@class,'MyGDhe')][normalize-space()='Terms of Service'])[1]")).click();
		Thread.sleep(4000);
		driver.close();

	}

}
