package marathan1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestcaseOne {

	public static void main(String[] args) {
		//launching the browser
		ChromeDriver driver = new ChromeDriver(); 
		//load the url
		driver.get("https://www.pvrcinemas.com/"); 
		//maximize the browser window
		driver.manage().window().maximize(); 
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		//selecting the location as chennai
		driver.findElement(By.xpath("(//div[@class='p-dropdown-trigger'])[1]")).click();
		driver.findElement(By.xpath("//h6[text()='Chennai']")).click();
		//Click on Cinema under Quick Book
		driver.findElement(By.xpath("//span[text()='Cinema']")).click();
		//Select Your Cinema
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		driver.findElement(By.xpath("//span[text()='INOX National,Virugambakkam Chennai']")).click();
		//Select Your Date as Tomorrow
		driver.findElement(By.xpath("//span[text()='Tomorrow']")).click();
		//Select Your Movie
		//driver.findElement(By.xpath("//span[text()='Select Movie']")).click();
		driver.findElement(By.xpath("(//span[text()='ASTHRAM'])[2]")).click();
		//Select Your Show Time
		driver.findElement(By.xpath("//span[text()='03:25 PM']")).click();
		//Click on Book Button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//Click Accept on Term and Condition
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		//Click any one available seat
		driver.findElement(By.xpath("(//span[text()='8'])[7]")).click();
		//Click Proceed Button
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		//Print the Seat info under book summary
		String text = driver.findElement(By.xpath("//div[@class='seat-number']/p")).getText();
		System.out.println("The seat number is: "+text);
		String text1 = driver.findElement(By.xpath("//p[text()='SILVER']")).getText();
		System.out.println("The seat info is: "+text1);
		//Print the grand total under book summary
		String text2 = driver.findElement(By.xpath("(//span[text()='221.27'])[2]")).getText();
		System.out.println("Grand total : "+text2);
		//Click Proceed Button
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		//Close the popup
		driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();
		//Print Your Current Page title
		String title = driver.getTitle();
		System.out.println(title);
		//Close Browser
		driver.close();
		
		
		
		
		
		
		

	}

}
