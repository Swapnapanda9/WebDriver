package qedge_May20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox {

	public static void main(String[] args) throws Throwable {
		// Create instance object
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://facebook.com/");
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Create new accou")).click();
		Thread.sleep(5000);
		//Store three list boxes into select class
		Select daylist = new Select(driver.findElement(By.name("birthday_day")));
		Select monthlist = new Select(driver.findElement(By.name("birthday_month")));
		Select yearlist = new Select(driver.findElement(By.name("birhday_year")));
		//verify listbox is Single or Multi selection
		boolean value = daylist.isMultiple();
		System.out.println(value);
		//Select items in listbox
		daylist.selectByIndex(26);
		Thread.sleep(5000);
		monthlist.selectByVisibleText("Aug");
		Thread.sleep(5000);
		yearlist.selectByVisibleText("1994");
		Thread.sleep(5000);
		driver.quit();

	}

}
