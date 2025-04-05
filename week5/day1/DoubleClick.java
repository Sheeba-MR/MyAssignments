package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver(); // launching the browser
		driver.get("https://myntra.com/"); //load the url
		driver.manage().window().maximize(); 
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//double click
		WebElement doubleClick = driver.findElement(By.xpath("//a[text()='Men']"));
		//instantiate the action class
		Actions dc = new Actions(driver);
		dc.doubleClick(doubleClick).perform();

	}

}
