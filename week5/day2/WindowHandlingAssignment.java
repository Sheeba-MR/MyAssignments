package week5.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingAssignment {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver(); // launching the browser
		
		driver.get("http://leaftaps.com/opentaps/"); //load the url
		
		driver.manage().window().maximize(); //maximize the browser window
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		//click on contact
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		//click on merge contacts
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		//Click on the widget of the "From Contact"
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
		//giving driver control to the child window i.e) handling child window
		//get all windows
		Set<String> Cwindow = driver.getWindowHandles();
		//as we don't have index in set we are converting the set into list
		List <String> ListCwindow = new ArrayList<String>(Cwindow);
		//switch to child window
		driver.switchTo().window(ListCwindow.get(1));
		Thread.sleep(3000);
		//Click on the first resulting contact
		driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
		//now we have to come back to the parent window
		Set<String> Pwindow = driver.getWindowHandles();
		//as we don't have index in set we are converting the set into list
		List <String> ListPwindow = new ArrayList<String>(Pwindow);
		//switch to parent window
		driver.switchTo().window(ListPwindow.get(0));
		//Click on the widget of the "To Contact"
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		//giving driver control to the child window i.e) handling child window
		//get all windows
		Set<String> Cwindow2 = driver.getWindowHandles();
		//as we don't have index in set we are converting the set into list
		List <String> ListCwindow2 = new ArrayList<String>(Cwindow2);
		//switch to child window
		driver.switchTo().window(ListCwindow2.get(1));
		//Click on the second resulting contact
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class='linktext'])[6]")).click();
		//now we have to come back to the parent window
		Set<String> Pwindow1 = driver.getWindowHandles();
		//as we don't have index in set we are converting the set into list
		List <String> ListPwindow1 = new ArrayList<String>(Pwindow1);
		//switch to parent window
		driver.switchTo().window(ListPwindow1.get(0));
		//click on merge button
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		//accept the alert
		Alert alr = driver.switchTo().alert();
		alr.accept();
		//title page
		Thread.sleep(3000);
		String title = driver.getTitle();
		System.out.println(title);
		
		

	}

}
