package qedge_May22;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelection2 {

	public static void main(String[] args) throws Throwable {
		// Create instance object
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("file:///D:/MultiListboxHtmlpage.html");
		//Suspend tool for 5 seconds
		Thread.sleep(5000);
		//Store that list box into select class
		Select dropdown = new Select(driver.findElement(By.name("multiSelection")));
		for(int i=0;i<=10;i++)
		{
			dropdown.selectByIndex(i);
		}
		//Get collection of items which are selected
		List<WebElement> selected_items=dropdown.getAllSelectedOptions();
		System.out.println("No of items selected::"+selected_items.size());
		for (WebElement each : selected_items) {
			System.out.println(each.getText());
		}
		driver.quit();
	}


}
