package qedge_Jun10;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender_Practise {

	public static void main(String[] args) {
		//create instance object
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/datepicker/");
		driver.findElement(By.id("datepicker")).click();
		
		String dpicker = "12/July/2025";
		String[] temp = dpicker.split("/");
		
		String dt = temp[0];
		String month = temp[1];
		String year =temp[2];
		
		String calyear = driver.findElement(By.className("ui-datepicker-year")).getText();
		System.out.println(calyear);
		while(! calyear.equals(year))
		{
			driver.findElement(By.linkText("Next")).click();
			calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
			System.out.println(calyear);
		}
		String calmonth = driver.findElement(By.className("ui-datepicker-month")).getText();
		System.out.println(calmonth);
		while(! calmonth.equalsIgnoreCase(month))
		{
			driver.findElement(By.linkText("Next")).click();
			calmonth = driver.findElement(By.className("ui-datepicker-month")).getText();
			System.out.println(calmonth);

	}
		WebElement cal = driver .findElement(By.className("ui-datepicker-calendar"));
        List<WebElement> rows,cols;
	


rows = cal.findElements(By.tagName("tr"));
for (int i =1;i<rows.size();i++)
{

	cols = rows.get(i).findElements(By.tagName("td"));
	for(WebElement element : cols)
	{
		
	
		if(element.getText().equals(dt))
		{
			
		
			element.click();
			break;
		}
	}
}
	}
}
	
	