package qedge_May13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

	public static void main(String[] args) {
		// set path for chromebrowser
		System.setProperty("webdriver.chromedriver", "D:/chromedriver.exe");
		//create instance object for webdriver
		WebDriver driver = new ChromeDriver();
		//set path for firefox
		System.setProperty("webdriver.gecko.driver", "D:/geckodriver");
		WebDriver dr = new FirefoxDriver();
		
	}
	
}

