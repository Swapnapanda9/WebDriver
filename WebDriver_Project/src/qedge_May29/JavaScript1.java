package qedge_May29;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript1 {

	public static void main(String[] args) throws Throwable {
		// Create instance object 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//create object for java script
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//Lunch url using java script
		js.executeScript("window.location='https://tatacliq.com'");
		Thread.sleep(5000);
		//Print title and length of that title
		String pagetitle = js.executeScript("return document.title").toString();
		System.out.println(pagetitle);
		System.out.println(pagetitle.length());
		//print url and length of url
		String strurl = js.executeScript("return document.URL").toString();
		System.out.println(strurl);
		System.out.println(strurl.length());
		//Print domain name and length of domain
		String strdomain = js.executeAsyncScript("return document.domain").toString();
		System.out.println(strdomain);
		System.out.println(strdomain.length());
		Thread.sleep(4000);
		driver.close();
		
		
		 

	}

}
