package marathan1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestcaseTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//launching the browser
		ChromeDriver driver = new ChromeDriver(); 
		//load the url
		driver.get("https://www.amazon.in/"); 
		//maximize the browser window
		driver.manage().window().maximize(); 
		//to refresh the page
		driver.navigate().refresh();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		//Type "Bags for boys" in the Search box
		WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
		text.sendKeys("Bags for boys");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//Print the total number of results (like 50000)
		String message = driver.findElement(By.xpath("(//div[@class='sg-col-inner']//span)[1]")).getText();
		System.out.println("Total number of results: "+message);
		//Select the first 2 brands in the left menu
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]")).click();
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[2]")).click();
		//Choose New Arrivals (Sort)
		driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
		driver.findElement(By.linkText("Newest Arrivals")).click();
		//Print the first resulting bag info (name, discounted price)
		String message2 = driver.findElement(By.xpath("//span[text()='Charm 02 Coral School Backpack']")).getText();
		System.out.println("The name of the bag is: "+message2);
		//Get the page title and close the browser(driver.close())
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();	

	}

}
