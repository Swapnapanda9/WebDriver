package qedge_May26;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class RightClick {

	public static void main(String[] args) throws Throwable {
		// Create instance object
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://google.com/");
		Thread.sleep(5000);
		//Create action object
		Actions ac = new Actions(driver);
		//Take mouse to Gmail and right click on it
		ac.moveToElement(driver.findElement(By.linkText("Gmail"))).click().perform();
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(5000);
		//Create object for Robot
		Robot r = new Robot();
		//Press down arrow in keyboard for two times
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(5000);
		//Click enter key in keyboard
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		//Store two windows
		ArrayList<String> brw = new ArrayList<String>(driver.getWindowHandles());
		//Switch to gmail child window
		driver.switchTo().window(brw.get(1));
		Thread.sleep(5000);
		ac.moveToElement(driver.findElement(By.xpath("(//span[contains(text(),'create an account')])[1]"))).click().perform();
		Thread.sleep(5000);
		driver.close();
		//Switch to parent window
		driver.switchTo().window(brw.get(0));
		Thread.sleep(5000);
		//click images link
		ac.moveToElement(driver.findElement(By.linkText("Images"))).click().perform();
		Thread.sleep(5000);
		driver.close();
		

		
	}

}
