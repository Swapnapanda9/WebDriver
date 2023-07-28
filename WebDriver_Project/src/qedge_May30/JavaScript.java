package qedge_May30;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {

	public static void main(String[] args) throws Throwable {
		// Create instance object
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.location = 'https://demo.opencart.com/'");
		Thread.sleep(5000);
		js.executeScript("document.querySelector(\"div[class='nav float-end'] div[class='dropdown'] span[class='d-none d-md-inline']\").click()");
		js.executeScript("document.querySelector(\"div[class='nav float-end'] li[class='list-inline-item'] li:nth-child(1) a:nth-child(1)\").click()");
		js.executeScript("document.querySelector(\"#input-firstname\").value='Amit'");
		js.executeScript("document.querySelector(\"#input-lastname\").value='Swapna'");
		js.executeScript("document.querySelector(\"#input-email\").value='test12@gmail.com'");
		js.executeScript("document.querySelector(\"#input-password\").value='swapna@123!@#'");
		js.executeScript("window.scrollBy"
				+ "(0,400)");
		Thread.sleep(4000);
		js.executeScript("document.querySelector(\"#input-newsletter-yes\").click()");
		Thread.sleep(4000);
		js.executeScript("document.querySelector(\"input[value='1'][name='agree']\").click()");
		Thread.sleep(4000);
		js.executeScript("document.querySelector(\"button[type='submit']\").click()");
		Thread.sleep(4000);
		driver.quit();
		
		

	}

}
