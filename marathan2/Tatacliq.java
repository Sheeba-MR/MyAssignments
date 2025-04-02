package marathan2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Tatacliq {

	public static void main(String[] args) throws InterruptedException {
		//handle the notification
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		//launching the browser
		ChromeDriver driver = new ChromeDriver(options); 
		//load the url
		driver.get("https://www.tatacliq.com/"); 
		//maximize the browser window
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//type watches for
		driver.findElement(By.id("search-text-input")).sendKeys("watches for");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[@class='SearchResultItem__bolder'])[1]")).click();
		//print the result
		String text = driver.findElement(By.xpath("//div[text()='Showing \"7548\" items for \"']")).getText();
		String text1 = driver.findElement(By.xpath("//span[text()='watches for women\"']")).getText();
		System.out.println(text+" "+text1);
		
		//clicking sortby dropdown
		driver.findElement(By.className("SelectBoxDesktop__hideSelect")).click();
		WebElement sort = driver.findElement(By.className("SelectBoxDesktop__hideSelect"));
		//as the element is in select tag, instantiate the select class
		Select srt = new Select(sort); 
		//use any 1 method - using index
		srt.selectByVisibleText("New Arrivals");
		
		//click category - woman
		driver.findElement(By.xpath("(//div[text()='Women'])[1]")).click();
		
		//print all price of watches
		
		List<WebElement> allPrices = driver.findElements(By.xpath("//div[@class='ProductDescription__discount ProductDescription__priceHolder']"));
		System.out.println(allPrices);
		
		List<String> price = new ArrayList<String>();
		for (WebElement each : allPrices) {
			String text3 = each.getText();
			System.out.println(text3); 
			price.add(text3); 
			
		}
		System.out.println(price);
		
		//print the url
		String url = driver.getCurrentUrl();
		System.out.println("The URL is: "+url);
		
		//close the browser
		driver.close();
		
		
		
	}

}
