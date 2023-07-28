package qedge_Jun5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandling_Practice {

	public static void main(String[] args) throws Throwable {
		// Create instance object
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://orangehrm.qedgetech.com/");
		Thread.sleep(5000);
		//login 
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.xpath("//b[normalize-space()='Admin']")).click();
		Thread.sleep(3000);
		//Store that table into webelement
		WebElement webtable = driver.findElement(By.className("table hover"));
		List<WebElement>rows,cols;
		//Get collection of rows
		rows = webtable.findElements(By.tagName("tr"));
		int row = rows.size()-1;
		System.out.println("No of rows are::"+row);
		Thread.sleep(5000);
		//Itrate all rows
		for(int i =1;i<rows.size();i++)
		{
		// Get cell collection from each row
			cols = rows.get(i).findElements(By.tagName("td"));
			//Itrate all cells
			for(int j = 0;j<cols.size();j++)
			{
				String celldata = cols.get(j).getText();
				Thread.sleep(2000);
				System.out.println(celldata+"\n");
			}
			System.out.println();
			System.out.println("==========================");
				
		}
		Thread.sleep(5000);
		driver.quit();
		

	}

}
