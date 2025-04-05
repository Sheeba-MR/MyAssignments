package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrolldown {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver(); // launching the browser
		driver.get("https://www.amazon.in/"); //load the url
		driver.manage().window().maximize(); 
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//scroll down
		WebElement scroll = driver.findElement(By.xpath("//span[contains(text(),'Amazon.com')]"));
		//instantiate action class
		Actions sd = new Actions(driver);
		sd.scrollToElement(scroll).perform(); //if we don't mention perform method it won't work - BUT IT WON'T THROW ANY EXCEPTION
		//get the text
		System.out.println(scroll.getText());
		
	
	}

}
