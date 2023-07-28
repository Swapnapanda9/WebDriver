package qedge_May24;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindows1 {

	public static void main(String[] args) throws Throwable {
		// Create instance object
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.irctc.co.in/");
		Thread.sleep(5000);
		//print parent window id
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		//Click all ten links
		driver.findElement(By.linkText("(//label[contains(text(),'FLIGHTS')])[2]")).click();
		driver.findElement(By.linkText("(//label[contains(text(),'HOTELS')])[2]")).click();
		driver.findElement(By.linkText("(//label[normalize-space()='RAIL DRISHTI'])")).click();
		driver.findElement(By.linkText("(//label[normalize-space()='E-CATERING'])[1]")).click();
		driver.findElement(By.linkText("(//label[normalize-space()='BUS'])[1]")).click();
		driver.findElement(By.linkText("(//label[normalize-space()='HOLIDAY PACKAGES'])[1]")).click();
		driver.findElement(By.linkText("(//label[normalize-space()='TOURIST TRAIN'])[1]")).click();
		driver.findElement(By.linkText("(//label[normalize-space()='HILL RAILWAYS'])[1]")).click();
		driver.findElement(By.linkText("(//label[normalize-space()='CHARTER TRAIN'])[1]")).click();
		driver.findElement(By.linkText("(//label[normalize-space()='GALLERY'])[1]")).click();
		//Get collection of all window Ids
		Set<String> brw = driver.getWindowHandles();
		System.out.println(brw);
		driver.quit();
		

	}

}
