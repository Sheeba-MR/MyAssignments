package week5.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebtableAssignment {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver(); // launching the browser
		driver.get("https://finance.yahoo.com/"); //load the url
		driver.manage().window().maximize(); //maximize the browser window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//mouse over on more
		WebElement mouseHover = driver.findElement(By.xpath("//span[text()='More']"));
		//instantiate action class
		Actions mh = new Actions(driver);
		mh.moveToElement(mouseHover).perform();
		//click on crypto tab
		driver.findElement(By.xpath("(//a[text()='Crypto '])[3]")).click();
		//locate the table
		WebElement table = driver.findElement(By.xpath("//table[@class='markets-table freeze-col yf-hhhli1 fixedLayout']/tbody"));
		//all cryptocurrency names
		Thread.sleep(10000);
		List<WebElement> allCryptoCurrency = driver.findElements(By.xpath("//table[@class='body yf-hhhli1']/tbody/tr/td[2]"));
		for (WebElement each : allCryptoCurrency) {
			String currency = each.getText();
			System.out.println(currency);
			

	}

}
	
}
