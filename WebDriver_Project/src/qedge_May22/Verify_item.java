package qedge_May22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_item {

	public static void main(String[] args) throws Throwable {
		String expected_item = "Baby";
		boolean Item_Exist = false;
		// create instance object
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		//Store listbox into select class object
		Select listbox = new Select(driver.findElement(By.id("searchDropdownBox")));
		List<WebElement>all_items = listbox.getOptions();
		System.out.println("No of items are:::"+all_items .size());
		for (WebElement each : all_items) {
			String Actual_items = each.getText();
			System.out.println(Actual_items);
			if (Actual_items. equalsIgnoreCase(expected_item)) 
			{
				Item_Exist = true;
				break;
			}
			
		}
		//Item_exist holds true or false
		if (Item_Exist) 
		{
			System.out.println(expected_item+"  "+"Item found in list box");
		}
		else 
		{
			System.out.println(expected_item+"  "+"Item not found in list box");	
		}
		driver.quit();
	}
	

}
