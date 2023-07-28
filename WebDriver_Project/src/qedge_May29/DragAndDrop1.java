package qedge_May29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop1 {

	public static void main(String[] args) throws Throwable {
		// Create instance object
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.get("https://jqueryui.com/droppable/");
				Thread.sleep(5000);
				//create object for actions class
				Actions ac = new Actions(driver);
				driver.switchTo().frame(0);
				//store source into one web element
				WebElement source = driver.findElement(By.id("draggable"));
				//store target into one web element
				WebElement target = driver.findElement(By.id("droppable"));
				ac.dragAndDrop(source, target).perform();

	}

}
