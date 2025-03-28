package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver(); // launching the browser
		driver.get("https://www.ajio.com/"); //load the url
		driver.manage().window().maximize(); //maximize the browser window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//enter bags in search box
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("bags");
		//click the search button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]")).click();
		//print the number of products found
		String items = driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println(items);
		
		//list of brands
		//1)number of phones - this brands list holds all phones
		List<WebElement> brands = driver.findElements(By.xpath("//div[@class='brand']"));
		//2)create an empty list
		List<String> list = new ArrayList <String>(); 
		//3) iterate for each mobile prices
			for (WebElement each : brands) {
				String text = each.getText();
				list.add(text); //adding each iterated values to the empty list
			
			}
		System.out.println(list);
		
		//list of bag names 
		//1)number of phones - this brands list holds all phones
		List<WebElement> names = driver.findElements(By.xpath("//div[@class='nameCls']"));
		//2)create an empty list
		List<String> list1 = new ArrayList <String>();
		//3) iterate for each mobile prices
			for (WebElement each : names) {
				String text1 = each.getText();
				list1.add(text1); //adding each iterated values to the empty list
					
				}
				System.out.println(list1);
	}

}
