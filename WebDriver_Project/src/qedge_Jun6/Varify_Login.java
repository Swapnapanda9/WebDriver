package qedge_Jun6;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Varify_Login {

	public static void main(String[] args) throws Throwable {
		// Read data 
		FileReader fr = new FileReader("D://Logindata.txt");
		BufferedReader br = new BufferedReader(fr);
		//To store line by line data
		String str = "";
		while ((str = br.readLine())!=null) {
			//Create java time stamp
			Date date = new Date();
			DateFormat df = new SimpleDateFormat("YYYY_MM_dd hh_mm_ss");
			String datef = df.format(date);
			//Split into array variable
			String x[]=str.split(";");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("http://orangehrm.qedgetech.com/");
			Thread.sleep(5000);
			driver.findElement(By.cssSelector("#txtUsername")).sendKeys(x[0]);
			driver.findElement(By.cssSelector("#txtPassword")).sendKeys(x[1]);
			driver.findElement(By.cssSelector("#btnLogin")).click();
			String Expected = "dashboard";
			String Actual = driver.getCurrentUrl();
			if(Actual.contains(Expected))
			{
			System.out.println("Login Success::"+Expected+"  "+Actual);	
			}
			else
			{
			File screen =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screen, new File("./Screenshot/"+datef+"  "+"LoginPage.png"));
			System.out.println("Login Fail::"+Expected+"  "+Actual);	
			}
			driver.close();
		}
		

	}

}
