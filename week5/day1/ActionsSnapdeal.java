package week5.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSnapdeal {

	public static void main(String[] args) throws InterruptedException {
		//launching the browser
		ChromeDriver driver = new ChromeDriver(); 
		//load the url
		driver.get("https://www.snapdeal.com/"); 
		//maximize the browser window
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//click men's fashion
		WebElement men = driver.findElement(By.xpath("(//span[@class='catText'])[1]"));
		Actions m = new Actions(driver);
		m.moveToElement(men).perform();
		//click sport shoes
		driver.findElement(By.xpath("(//span[text()='Sports Shoes'])[1]")).click();
		//get the count of sports shoe
		String count = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
		System.out.println("The total count of shoes :"+count);
		//click on training shoes
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		//click sort by
		driver.findElement(By.xpath("//div[@class='sort-selected']")).click();
		driver.findElement(By.xpath("(//li[@class='search-li'])[1]")).click();
		//click on color
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@for='Color_s-Black']")).click();
		//mouse over the first shoe
		Thread.sleep(3000);
		WebElement shoe = driver.findElement(By.xpath("//p[@class='product-title']"));
		Actions s = new Actions(driver);
		s.moveToElement(shoe).perform();
		//click quick view
		driver.findElement(By.xpath("//div[contains(text(),'Quick View')]")).click();
		Thread.sleep(3000);
		//get the price of the shoe
		String rate = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
		System.out.println(rate);
		//get the discount of the shoe
		String discount = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
		System.out.println(discount);
		
		
		
		
				
		
		

	}

}
