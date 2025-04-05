package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver(); // launching the browser
		driver.get("https://jqueryui.com/draggable/"); //load the url
		driver.manage().window().maximize(); 
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//drag 
		//the draggable is present in frame, so we have to handle the frame first
		driver.switchTo().frame(0);
		//now interacting with the webelement
		WebElement drag = driver.findElement(By.id("draggable"));
		//instantiate the action class
		Actions d = new Actions(driver);
		d.dragAndDropBy(drag, 50, 70).perform();
		

	}

}
