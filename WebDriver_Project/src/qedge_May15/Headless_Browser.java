package qedge_May15;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Headless_Browser {

	public static void main(String[] args) {
		// Create instance object
		WebDriver driver = new HtmlUnitDriver();
		// lunch url
		driver.get("http:/google.com");
		// print title and length of title
				String page_title = driver.getTitle();
				System.out.println(page_title);
				System.out.println(page_title.length());
				//Print url and length of url
				String str_url = driver.getCurrentUrl();
				System.out.println(str_url);
				System.out.println(str_url.length());
				driver.quit();
				

	}

}
