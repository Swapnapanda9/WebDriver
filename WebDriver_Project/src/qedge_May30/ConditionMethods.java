package qedge_May30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionMethods {

	public static void main(String[] args) throws Throwable {
		// Create instance object
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(4000);
		//Verify First name is enabled or disabled
		WebElement firstname = driver.findElement(By.name("firstname"));
		boolean value = firstname.isEnabled();
		System.out.println(value);
		//Verify re-enter email text box is displayed or hidden
		WebElement reentermailtextbox = driver.findElement(By.name("reg_email_confirmation__"));
		boolean value1 = reentermailtextbox.isDisplayed();
		System.out.println(value1);
		//verify female radio button is selected or not 
		WebElement femaleradio = driver.findElement(By.xpath("//input[@value='1']"));
		boolean value2 = femaleradio.isSelected();
		System.out.println(value2);
		driver.quit();
		

	}

}
