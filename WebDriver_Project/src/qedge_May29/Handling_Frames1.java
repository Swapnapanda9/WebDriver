package qedge_May29;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_Frames1 {

	public static void main(String[] args) throws Throwable {
		// Create instance object
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(5000);
		//create object for actions class
		Actions ac = new Actions(driver);
		//get collection of i frames in a web page
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println("No of frames are::"+frames.size());
		driver.switchTo().frame(0);
		//store source into one web element
		WebElement source = driver.findElement(By.id("draggable"));
		//store target into one web element
		WebElement target = driver.findElement(By.id("droppable"));
		//Click and hold source and drop into target
		ac.clickAndHold(source).moveToElement(target).release().perform();
		Thread.sleep(3000);
		//Switch to main html page
		driver. switchTo().defaultContent();
		Thread.sleep(3000);
		//Click button link
		ac.moveToElement(driver.findElement(By.linkText("Button"))).click().perform();
		Thread.sleep(5000);
		driver.quit();
		
		

	}

}
