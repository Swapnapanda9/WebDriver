package qedge_May19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingWebElement {

	public static void main(String[] args) throws Throwable {
		// Create instance object
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://orangehrm.qedgetech.com/");
		Thread.sleep(50000);
		//Store user name text box into web element
		WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		username.clear();
		username.sendKeys("Rinku");
		//Capture user name value
		String Enteruser = username.getAttribute("value");
		//Store password text box into web element
		WebElement Password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		Password .clear();
		Password.sendKeys("Qedge123!@#");
		//Capture password value
		String Enterpass = Password.getAttribute("value");
		System.out.println(Enteruser+"  "+Enterpass);
		//Click login button
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Thread.sleep(5000);
		String Expected = "Dashboard";
		String Actual = driver.getCurrentUrl();
		if (Actual.contains(Expected))
		{
			System.out.println("Login success:::"+Expected+"  "+Actual);	
		}
		else {
			//Capture error message
			String errormessage = driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
			System.out.println(errormessage+"  "+Expected+"  "+Actual);	

		}
		driver.quit();
	}

}
