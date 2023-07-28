package qedge_May26;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseClick {

	public static void main(String[] args) throws Throwable {
		// Create Instance object
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		//Create object for action class
		Actions ac = new Actions(driver);
		ac.sendKeys(Keys.ESCAPE).perform();
		//Mouse hover to Electronics
		ac.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Electronics')]"))).perform();
		Thread.sleep(5000);
		//Mouse hover to All link and click it
		ac.moveToElement(driver.findElement(By.linkText("All"))).click().perform();
		Thread.sleep(5000);
		//Mouse hover to Baby and Kids
		ac.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Baby & Kids']"))).perform();
		Thread.sleep(5000);
		//mouse hover to Puzzles
		ac.moveToElement(driver.findElement(By.linkText("Puzzles"))).click().perform();
		Thread.sleep(5000);
		driver.quit();
		
		

	}

}
