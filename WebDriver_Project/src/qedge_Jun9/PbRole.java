package qedge_Jun9;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class PbRole extends Reusable {
	public static void pbRoleCreation(String rolename, String description,String roletype)
	{
		driver.findElement(By.xpath("//img[@src='images/Roles_but.jpg']")).click();
		driver.findElement(By.xpath("//input[@id='btnRoles']")).click();
		driver.findElement(By.name("txtRname")).sendKeys(rolename);
		driver.findElement(By.name("txtRDesc")).sendKeys(description);
		new Select(driver.findElement(By.linkText("//select[@id='lstRtypeN']"))).selectByVisibleText(roletype);
		driver.findElement(By.name("btninsert")).click();
	}
	

	public static void main(String[] args) {
		Reusable.pbLogin("http://primusbank.qedgetech.com/", "Admin", "Admin");
		PbRole.pbRoleCreation("clek", "work for 24 hours", "C");
		Reusable.pbClose();
	

	}

}
