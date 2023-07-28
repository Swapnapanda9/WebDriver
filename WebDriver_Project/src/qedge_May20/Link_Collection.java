package qedge_May20;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_Collection {

	public static void main(String[] args) throws Throwable {
		// Create instance object
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("http://primusbank.qedgetech.com/");
		Thread.sleep(5000);
		//Get collection of Links in web page
		List<WebElement> all_Links = driver.findElements(By.tagName("a"));
		System.out.println("No of links are:: "+all_Links .size());
		Thread.sleep(1000);
		//Iterate all links
		for (WebElement each : all_Links) {
			Thread.sleep(200);
			System.out.println(each.getText());
		}
		driver.quit();




	}

}
