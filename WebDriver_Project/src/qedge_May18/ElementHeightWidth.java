package qedge_May18;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementHeightWidth {

	public static void main(String[] args) throws Throwable {
		// Create instance object
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http:/facebook.com");
		Thread.sleep(5000);
		//Store text box into web element
		WebElement emailtextbox = driver.findElement(By.name("email"));
		// get height and width of email text box
		Dimension dim = emailtextbox.getSize();
		System.out.println(dim.getHeight()+"   " +dim.getWidth());
		//get height and width of create new account
		WebElement Element = driver.findElement(By.partialLinkText("Create new accou"));
		Dimension dim1 = Element.getSize();
		System.out.println(dim1.getHeight()+"  "+dim1.getWidth());
		driver.quit();
		
		

	}

}
