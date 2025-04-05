package week5.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Erail {

		public static void main(String[] args) {
			ChromeDriver driver = new ChromeDriver(); // launching the browser
			driver.get("https://erail.in/"); //load the url
			driver.manage().window().maximize(); 
			//implicit wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			//clear the previous station
			driver.findElement(By.id("txtStationFrom")).clear();
			//enter MAS from station
			driver.findElement(By.id("txtStationFrom")).sendKeys("MAS");
			//click the MAS station
			driver.findElement(By.xpath("//div[text()='Mgr Chennai Ctr']")).click();
			//clear the previous station
			driver.findElement(By.id("txtStationTo")).clear();
			//enter MDU to station
			driver.findElement(By.id("txtStationTo")).sendKeys("MDU");
			//click the MDU station
			driver.findElement(By.xpath("//div[text()='Madurai Jn']")).click();
			//unselect sort date
			driver.findElement(By.xpath("(//input[@id='chkSelectDateOnly'])[1]")).click();
			//all trains
			List<WebElement> allTrains = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr/td[2]"));
			for (WebElement each : allTrains) {
				String trains = each.getText();
				System.out.println(trains);
				
			}
			
		}
		
}

		