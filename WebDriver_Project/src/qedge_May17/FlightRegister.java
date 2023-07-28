package qedge_May17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlightRegister {

	public static void main(String[] args) throws Throwable {
		// Create instance object
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://flights.qedgetech.com/");
		Thread.sleep(5000);
		//Click register link
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Amitkumar");
		driver.findElement(By.xpath("//input[@id='contact']")).sendKeys("8260259119");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("swapnapanda809@gmail.com");
		driver.findElement(By.xpath("//input[@id='address']")).sendKeys("ranga1234");
		driver.findElement(By.xpath("//select[@name='gender']")).sendKeys("Male");
		driver.findElement(By.xpath("//input[@id='popupDatepicker']")).sendKeys("25-08-1994");
		driver.findElement(By.xpath("//input[@id='flexCheckChec.ked']")).click();
        driver.findElement(By.xpath("//input[@name='submit']")).submit();


	}

}
