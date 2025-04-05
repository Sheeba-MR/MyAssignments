package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drop {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver(); // launching the browser
		driver.get("https://jqueryui.com/droppable/"); //load the url
		driver.manage().window().maximize(); 
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//drop
		//as the drop is inside frame we have to handle that first
		driver.switchTo().frame(0);
		//now interacting with the webelement for dragging
		WebElement drag = driver.findElement(By.id("draggable"));
		//now interacting with the webelement for dropping
		WebElement drop = driver.findElement(By.id("droppable"));
		//instantiate the Actions
		Actions dg = new Actions(driver);
		dg.dragAndDrop(drag, drop).perform();

	}

}
