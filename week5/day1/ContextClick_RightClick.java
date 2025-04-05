package week5.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick_RightClick {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver(); // launching the browser
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html"); //load the url
		driver.manage().window().maximize(); 
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//click on rightclick button
		WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
		//instantiate the action class
		Actions rc = new Actions(driver);
		rc.contextClick(rightClick).perform();
		
		//click edit
		driver.findElement(By.xpath("//span[text()='Edit']")).click();
		//handle simple alert
		Alert alr = driver.switchTo().alert();
		String text = alr.getText();
		System.out.println(text);
		alr.accept();
	}

}
