package qedge_Jun6;
import java.io.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebText_Write_Text {

	public static void main(String[] args) throws Throwable {
		// create new file
		File f = new File("D://Primus.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://primusbank.qedgetech.com/");
		//Store that para into one variable
		String para1 = driver.findElement(By.xpath("//tbody/tr[2]/td[1]/p[1]")).getText();
		String para2 = driver.findElement(By.xpath("//tbody/tr[2]/td[1]/p[2]")).getText();
		bw.write(para1);
		bw.newLine();
		bw.newLine();
		bw.write(para2);
		bw.flush();
		bw.close();
		
		

	}

}
