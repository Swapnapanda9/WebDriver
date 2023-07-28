package qedge_Jun5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Table {

	public static void main(String[] args) throws Throwable {
		String expected_Country = "canada";
		boolean country_found = false;
		// Create instance object
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(5000);
		//Store that complete table into one webelement object
		WebElement webtable = driver.findElement(By.id("customers"));
		//Declare that veriable into List veriable
		List<WebElement> rows,cols;
		//Get rows collection
		rows = webtable .findElements(By.tagName("tr"));
		//Avoid printing headers
		int row =rows.size()-1;
		System.out.println("No of rows are ::"+row);
		//Itrate all rows
		for(int i =1;i<rows.size();i++)
		{
			//Get cell collection from each row
			cols= rows.get(i).findElements(By.tagName("td"));
			//iteate all cells
			for (int j =0;j<cols.size();j++)
			{
				//Fetch the data and store into one veriable using gettext menthod
				String actual_celldata = cols.get(j).getText();
				Thread.sleep(500);
				System.out.print(actual_celldata+"\n");
				if(actual_celldata.equalsIgnoreCase(expected_Country))
				{
					country_found= true;
					System.out.println(expected_Country+"   "+"Found in Row no."+"  "+"Found in column::"+(j+1));
					break;
				}
			}
			System.out.println();
			System.out.println("===============");
		}
		if (country_found)
		{
			System.out.println(expected_Country+"   "+"Country found in table");
		}
		else
		{
			System.out.println(expected_Country+"  "+"Country Not Found In table");	
		}
		Thread.sleep(5000);
		driver.quit();
	}

}


