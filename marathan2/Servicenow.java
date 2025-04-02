package marathan2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.sukgu.Shadow;

public class Servicenow {

	public static void main(String[] args) throws InterruptedException {
		//launching the browser
		ChromeDriver driver = new ChromeDriver(); 
		//load the url
		driver.get("https://dev186929.service-now.com/"); 
		//maximize the browser window
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//click username
		driver.findElement(By.id("user_name")).sendKeys("admin");
		//click password
		driver.findElement(By.id("user_password")).sendKeys("2AqjN!lC2!Vy");
		//click login
		driver.findElement(By.id("sysverb_login")).click();
		
		//Click All
		Shadow shado = new Shadow(driver);
		shado.setImplicitWait(20);
		shado.findElementByXPath("//div[text()='All']").click();
	    //Click Service catalog
		shado.findElementByXPath("//span[text()='Service Catalog']").click();
		//click on mobiles
		// switch to frame
		WebElement element = shado.findElementByXPath("//iframe[@id='gsft_main']"); //this is in shadow root
		driver.switchTo().frame(element);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//h2[contains(text(),'Mobiles')]")).click();
		//select iphone 13 pro
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='scRecentSearches']")).click();
		driver.findElement(By.xpath("//div[text()='Apple Iphone 13 pro']")).click();
		driver.findElement(By.xpath("(//img[@alt='Request for Apple iPhone 13 pro'])[2]")).click();
		//Choose yes option in lost or broken iPhone
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//label[@class='radio-label'])[1]")).click();
		//Enter phonenumber as 99 in original phone number field
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@aria-required='true']")).sendKeys("99");
		// select unlimited
		//clicking the dropdown
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='col-xs-6  form-field input_controls sc-form-field '])[3]")).click();
		WebElement drpdwn = driver.findElement(By.id("IO:ff1f478e9747011021983d1e6253af68"));
		//as the element is in select tag, instantiate the select class
		Select dd = new Select(drpdwn); //shortcut to import ctrl+shift+O
		//select by value method
		dd.selectByVisibleText("Unlimited [add $4.00]");
		//Update color field to SierraBlue
		driver.findElement(By.xpath("(//label[@class='radio-label'])[7]")).click();
		//storage field to 512GB
		driver.findElement(By.xpath("(//label[@class='radio-label'])[10]")).click();
		//click order now
		driver.findElement(By.id("oi_order_now_button")).click();
		//Verify order is placed and copy the request number
		String reqID = driver.findElement(By.id("requesturl")).getText();
		System.out.println(reqID);
		
	}

}
