package qedge_May22;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelection1 {

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
		// Verify dropdown is single or multiselection
		boolean value = dropdown.isMultiple();
		System.out.println(value);
		// Select 0 to 10 items in dropdown
		for(int i=0;i<=10;i++)
		{
			Thread.sleep(2000);
			dropdown.selectByIndex(i);
	}
     //deselect from selection
		dropdown.deselectByVisibleText("White");
		Thread.sleep(3000);
		dropdown.deselectByIndex(0);
		Thread.sleep(3000);
		dropdown.deselectAll();
		Thread.sleep(3000);
		driver.quit();
		
}
}
