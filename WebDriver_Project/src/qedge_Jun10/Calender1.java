package qedge_Jun10;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calender1 {

	public static void main(String[] args) throws Throwable {
		// create instance object
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://flights.qedgetech.com/");
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		driver.findElement(By.name("dob")).click();
		//Split into array variable
		String dob = "25-Aug-1994";
		String[] temp= dob.split("-");
		String dt = temp[0];
		String month = temp[1];
		String year = temp[2];
		//Store year list box
		Select ylist = new Select(driver.findElement(By.className("ui-datepicker-year")));
		ylist . selectByVisibleText(year);
		//Store month list box
		Select mlist = new Select(driver.findElement(By.className("ui-datepicker-month")));
		mlist. selectByVisibleText(month);
		//Store table
		WebElement cal = driver.findElement(By.className("ui-datepicker-calendar"));
		List<WebElement> rows,cols;
		// Get collection of rows
		rows = cal.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		for (int i = 1;i<rows.size();i++)
		{
			//Get cell collection
			cols = rows.get(i).findElements(By.tagName("td"));
			for (int j=0;j<cols.size();j++)
			{
				if(cols.get(j).getText().equals(dt))
				{
					Thread.sleep(5000);
					cols.get(j).click();
					break;
				}
			}
				
		}
		

	}

}
