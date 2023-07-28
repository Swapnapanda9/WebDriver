package qedge_May15;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Title {

	public static void main(String[] args) throws Throwable {
		// create instance object
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//Lunch url
		driver.get("https://google.com");
		//Suspend tool for 5 seconds
		Thread.sleep(5000);
		String expected ="Gmail";
		// get run time title
		String Actual = driver.getTitle();
		//Verify Expected title with actual title
		if(expected.equalsIgnoreCase(Actual))
		{
			System.out.println("Title is matching::"+expected+"  "+Actual);
			
		}
		
		else {
			System.out.println("Title is not matching:::"+expected+ "  "+Actual);
		
		}
          driver.close();
	}

}
