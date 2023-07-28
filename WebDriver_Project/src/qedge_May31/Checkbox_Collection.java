package qedge_May31;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox_Collection {

	public static void main(String[] args) throws Throwable {
		// create instance object
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("file:///D:/checkbox_1.html");
		Thread.sleep(5000);
		//Get collection of check box in web page
		List<WebElement> All_checkboxes = driver.findElements(By.xpath("//*[@type='checkbox']"));
		System.out.println("No of check boxes are ::"+All_checkboxes.size());
		for (WebElement each : All_checkboxes) {
		//Verify which check box is true or false
		boolean value = each.isSelected();
		//get each check box name
		String checkboxname = each.getAttribute("value");
		System.out.println(checkboxname+"  "+value);
		each.click();
		Thread.sleep(5000);
		}
		driver.quit();
		
		

	}

}
