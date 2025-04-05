package week5.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsBigBasket {

	public static void main(String[] args) throws InterruptedException, IOException {
		//launching the browser
		ChromeDriver driver = new ChromeDriver(); 
		//load the url
		driver.get("https://www.bigbasket.com/"); 
		//maximize the browser window
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//click  on shop by category
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[text()='Shop by'])[2]")).click();
		Thread.sleep(3000);
		// Mouse over "Foodgrains, Oil & Masala"
		WebElement mo1 = driver.findElement(By.xpath("(//a[contains(text(),'Foodgrains')])[2]"));
		//instantiate action class
		Actions mh1 = new Actions(driver);
		mh1.moveToElement(mo1).perform(); 
		// Mouse over Rice & Rice Products
		WebElement mo2 = driver.findElement(By.linkText("Rice & Rice Products"));
		Actions mh2 = new Actions(driver);
		mh2.moveToElement(mo2).perform();
		// Mouse over Boiled & Steam Rice
		WebElement mo3 = driver.findElement(By.linkText("Boiled & Steam Rice"));
		Actions mh3 = new Actions(driver);
		mh3.moveToElement(mo3).perform();
		mo3.click();
		Thread.sleep(3000);
		//click brand - bbroyal
		WebElement scroll = driver.findElement(By.xpath("//label[text()='BB Royal']"));
		driver.executeScript("arguments[0].click();", scroll); //clicks directly in the dom
		//Click on "Tamil Ponni Boiled Rice"
		Thread.sleep(3000);
		WebElement ponni = driver.findElement(By.xpath("//input[@id='i-PonniBoiledRice']"));
		driver.executeScript("arguments[0].click();", ponni);
		//Select the 5 Kg bag - as the product is out of stock i have uncommanded this
		//Thread.sleep(3000);
		//WebElement bag = driver.findElement(By.xpath("//input[@id='i-5kg(18+MonthsOld)']"));
		//driver.executeScript("arguments[0].click();", bag);
		//Check and note the price of the rice. 
		Thread.sleep(3000);
		String price = driver.findElement(By.xpath("(//span[@class='Label-sc-15v1nk5-0 Pricing___StyledLabel-sc-pldi2d-1 gJxZPQ AypOi'])[1]")).getText();
		System.out.println(price);
		//Click "Add" to add the bag to your cart. 
		driver.findElement(By.xpath("(//button[text()='Add'])[1]")).click();
		//Verify the success message that confirms the item was added to your cart. 
		String text = driver.findElement(By.xpath("//p[@class='mx-4 flex-1']")).getText();
		System.out.println(text);
		//Take a snapshot of the current page 
		//Use TakesScreenshot method to capture screenshot
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		//Saving the screenshot in desired location
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		//Path to the location to save screenshot
		FileUtils.copyFile(source, new File("./SeleniumScreenshots/Screen.png"));
		System.out.println("Screenshot captured");
		//Close the current window. 
		driver.close();
		//Close the main window.
		driver.quit();
		
		
		
		
		

	}

}
