package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {
public static void main(String[] args) {
	WebDriverManager.edgedriver().setup();
	EdgeDriver driver = new EdgeDriver();
	
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("demosalesManager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	System.out.println(driver.getTitle());
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("ThirunavuKarasu");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sakthivel");
	driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Dinesh");
	driver.findElement(By.id("createLeadForm_description")).sendKeys("Good and Efficency to work in any stuation");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("thiru151095@gmail.com");
	driver.findElement(By.className("smallSubmit")).click();
	String title = driver.getTitle();
	System.out.println(title);
	driver.findElement(By.linkText("Duplicate Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).clear();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf-Selenium");
	driver.findElement(By.id("createLeadForm_firstName")).clear();
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Thiru");
	driver.findElement(By.className("smallSubmit")).click();
	String title2 = driver.getTitle();
	System.out.println(title2);
	}
}
