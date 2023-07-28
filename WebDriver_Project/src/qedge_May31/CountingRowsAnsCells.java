package qedge_May31;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountingRowsAnsCells {

	public static void main(String[] args) throws Throwable {
		// create instance object
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://money.rediff.com/mutual-funds");
		Thread.sleep(5000);
		//Store the table into web element object
		WebElement webtable = driver.findElement(By.className("dataTable"));
		List<WebElement> rows,cols;
		//get row collection from table
		rows = webtable.findElements(By.tagName("tr"));
		int row = rows.size()-1;
		System.out.println("No of rows are ::"+ row);
		//itrate all rows
		for (int i = 1;i<rows.size();i++)
		{
			// get cell collection from each row
			cols = rows.get(i).findElements(By.tagName("td"));
			System.out.println("Rows no::"+i+"  "+"Column size::"+cols.size());
		}
		driver.quit();



	}


}
