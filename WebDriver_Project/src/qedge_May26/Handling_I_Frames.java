package qedge_May26;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_I_Frames {

	public static void main(String[] args) throws Throwable {
		//create instance object
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(5000);
		//Create object for action class
		Actions ac = new Actions(driver);
		//Get collection of frames
		List<WebElement> all_frames = driver.findElements(By.tagName("iframe"));
		System.out.println("no of frames are::"+all_frames.size());
		//switch to frame
		driver.switchTo().frame(0);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		ac.clickAndHold(source).moveToElement(target).release().perform();
		Thread.sleep(3000);
		//switch to main html page
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		ac.moveToElement(driver.findElement(By.linkText("Button"))).click().perform();
		driver.quit();
		
		
		
		

	}

}
