package qedge_May22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox_Collection1 {

	public static void main(String[] args) throws Throwable {
		// Create instance object
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.tatacliq.com/");
		Thread.sleep(5000);
		//Store listbox into web element
		Select listbox = new Select(driver.findElement(By.xpath("//div[contains(text(),'Brands')]")));
		// Get collection of items in listbox
		List<WebElement> all_items = listbox.getOptions();
		System.out.println("No of items are::"+" "+all_items.size());
		Thread.sleep(2000);
		for (WebElement each : all_items) {
		System.out.println(each.getText());
		Thread.sleep(5000);	
		}
		driver.quit();
		
		

	}

}
