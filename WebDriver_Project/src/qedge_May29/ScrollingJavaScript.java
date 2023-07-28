package qedge_May29;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingJavaScript {

	public static void main(String[] args) throws Throwable {
		// Create instance object
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//create object for javaScript
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//Lunch URL
		js.executeScript("window.location='https://amazon.in'");
		Thread.sleep(5000);
		//Scroll top to bottom vertically
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(5000);
		//Scroll bottom to top vartically
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		Thread.sleep(5000);
		//Scroll certain pixel
		js.executeAsyncScript("window.scrollBy(0.900)");
		Thread.sleep(5000);
		driver.quit();

	}

}
