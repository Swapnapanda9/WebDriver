package qedge_May30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyCheckBox {

	public static void main(String[] args) throws Throwable {
		// create instance object
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(5000);
		//verify check box is selected or not
		//store that into webelement
		WebElement checkbox = driver.findElement(By.name("remember"));
		boolean value = checkbox.isSelected();
		System.out.println(value);
		//unselect from select
		checkbox.click();
		driver.quit();
		

	}

}
