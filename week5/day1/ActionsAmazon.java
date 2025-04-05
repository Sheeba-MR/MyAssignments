package week5.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionsAmazon {

	public static void main(String[] args) throws IOException {
		//launching the browser
		ChromeDriver driver = new ChromeDriver(); 
		//load the url
		driver.get("https://www.amazon.in/"); 
		//maximize the browser window
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//as captcha page is appearing, i have refreshed the window
		driver.navigate().refresh();
		//search oneplus 9 pro
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");
		driver.findElement(By.id("nav-search-submit-button")).click();
		//getting price for the first product
		String price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		System.out.println("The price is :"+price);
		//number of customer ratings
		String ratings = driver.findElement(By.xpath("//span[@class='a-size-base s-underline-text']")).getText();
		System.out.println("The rating is :"+ratings);
		//click the first text link
		driver.findElement(By.xpath("//h2[@class='a-size-medium a-spacing-none a-color-base a-text-normal']")).click();
		//Use TakesScreenshot method to capture screenshot
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		//Saving the screenshot in desired location
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		//Path to the location to save screenshot
		FileUtils.copyFile(source, new File("./SeleniumScreenshots/Screen.png"));
		System.out.println("Screenshot captured");
		//click add to cart
		driver.findElement(By.id("a-autoid-1-announce")).click();
		//subtotal
		String subTotal = driver.findElement(By.xpath("//div[@class='a-row ewc-subtotal-value']")).getText();
		System.out.println("The subtotal is :"+subTotal);
		//close the browser
		driver.close();
		
		
	}

}
