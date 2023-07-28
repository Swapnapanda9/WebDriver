package qedge_May15;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Commands {

	public static void main(String[] args) throws Throwable {
		// Set chrome browser path
		//System.setProperty("webdriver.chrome.driver", "D:\\chromrdriver.exe");
		// Create instance object
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//Lunch Url
		driver.get("https://tatacliq.com");
		//Suspend tool foe 5 seconds
		Thread.sleep(5000);
		// print title and length of title
		String page_title = driver.getTitle();
		System.out.println(page_title);
		System.out.println(page_title.length());
		//Print url and length of url
		String str_url = driver.getCurrentUrl();
		System.out.println(str_url);
		System.out.println(str_url.length());
		//Suspend tool for 5 seconds
		Thread.sleep(5000);
		driver.quit();


	}

}
