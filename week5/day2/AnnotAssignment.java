package week5.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class AnnotAssignment {
	public ChromeDriver driver;
	
	@BeforeSuite
	public void startReport() {
		System.out.println("Report started");
	}
	
	@BeforeTest
	public void setValues() {
		System.out.println("Values are set");
	}
	
	@BeforeClass
	public void assignTestcaseDetails() {
		System.out.println("Assigned");
	}
	
	@BeforeMethod
	public void preConditions() throws InterruptedException {
		
				//handle the notification
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--disable-notifications");
				//launching the browser
				ChromeDriver driver = new ChromeDriver(options); 
				//load the url
				driver.get("https://login.salesforce.com"); 
				//maximize the browser window
				driver.manage().window().maximize(); 
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				//type username
				driver.findElement(By.id("username")).sendKeys("dilip@testleaf.com");
				//type password
				driver.findElement(By.id("password")).sendKeys("Test@2025");
				//click login
				driver.findElement(By.id("Login")).click();
				//click on the toggle menu
				driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
				//click view all
				driver.findElement(By.xpath("//button[text()='View All']")).click();
				//click Legal Entities from App Launcher 
				Thread.sleep(10000);
				//scroll down
				WebElement scroll = driver.findElement(By.xpath("//p[text()='Legal Entities']"));
				//instantiate action class
				Actions sd = new Actions(driver);
				sd.scrollToElement(scroll).perform();
				scroll.click();
				//Click on the Dropdown icon in the legal Entities tab
				driver.findElement(By.xpath("//span[@class='slds-truncate' and text()='Legal Entities']/following::one-app-nav-bar-item-dropdown")).click();
				Thread.sleep(3000);
				//click on new legal entity
				driver.findElement(By.xpath("//div[@title='New']")).click();
				//giving driver control to the child window i.e) handling child window
				//get all windows
				Set<String> Cwindow = driver.getWindowHandles();
				//as we don't have index in set we are converting the set into list
				List <String> ListCwindow = new ArrayList<String>(Cwindow);
				//switch to child window
				driver.switchTo().window(ListCwindow.get(1));

	}
	
	@AfterMethod
	public void postConditions() {
		driver.close();
	}
	
	@AfterSuite
	public void stopReport() {
		System.out.println("Report stopped");
	}


}
