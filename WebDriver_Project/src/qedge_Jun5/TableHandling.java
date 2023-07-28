package qedge_Jun5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandling {

	public static void main(String[] args) throws Throwable {
		// create instance object
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://money.rediff.com/mutual-funds");
		Thread.sleep(5000);
		//Store that table into web element (step-1)
		WebElement webtable = driver.findElement(By.className("dataTable"));
		List<WebElement>rows,cols;
		//Get collection of rows
		rows = webtable.findElements(By.tagName("tr"));
		//Avoid headers
		int row =rows.size()-1;
		System.out.println("No of rows::"+row);
		Thread.sleep(3000);
		//Itrate all rows (step-2)
		for(int i =1;i<rows.size();i++)
		{
			//Get cell collection from each row
			cols = rows.get(i).findElements(By.tagName("td"));
			//Itrate all cells
			for (int j=0;j<cols.size();j++)
			{
				String celldata =cols.get(j).getText();
				Thread.sleep(3000);
				System.out.print(celldata+"\n");
			}
			System.out.println();
			System.out.println("========");
		}
		Thread.sleep(3000);
		driver.quit();



	}

}
