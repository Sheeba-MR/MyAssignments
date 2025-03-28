package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesClassAssignment {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver(); // launching the browser
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm"); //load the url
		driver.manage().window().maximize(); //maximize the browser window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// switch to frame
		driver.findElement(By.id("accept-choices")).click();
		driver.switchTo().frame("iframeResult");
		//click try it
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		driver.switchTo().alert().accept();
		String text = driver.findElement(By.id("demo")).getText();
		System.out.println(text);

	}

}
