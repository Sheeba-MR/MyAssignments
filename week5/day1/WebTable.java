package week5.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.leafground.com/table.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//locate the table
		WebElement table = driver.findElement(By.xpath("(//table[@role='grid'])[2]/tbody"));
		
		//rowcount
		List<WebElement> rSize = driver.findElements(By.xpath("(//table[@role='grid'])[2]/tbody/tr"));
		int size = rSize.size();
		System.out.println(size);
		
		//columncount
		List<WebElement> cSize = driver.findElements(By.xpath("(//table[@role='grid'])[2]/thead/tr/th"));
		int size2 = cSize.size();
		System.out.println(size2);
		
		//retreive a particular data
		String text = driver.findElement(By.xpath("(//table[@role='grid'])[2]/tbody/tr[3]/td[3]")).getText();
		System.out.println(text);
		
		//print paricular row
		List<WebElement> singleRow = driver.findElements(By.xpath("(//table[@role='grid'])[2]/tbody/tr[3]"));
		
		for (WebElement each : singleRow) {
			System.out.println(each.getText());
			
		}
		
		//all datas
		List<WebElement> allDatas = driver.findElements(By.xpath("(//table[@role='grid'])[2]/tbody/tr/td"));
		for (WebElement each1 : allDatas) {
			System.out.println(each1.getText());
			
		}
		
		//dynamic values
		
		//for (int i = 1; i < rSize.size(); i++) {
			
			//driver.findElement(By.xpath("(//table[@role='grid'])[2]/tbody/tr["+i+"]/td"));
			
			//System.out.println("---------------");
			
			//for (int j = 1; j < cSize.size(); j++) {
				
				//WebElement dynDatas = driver.findElement(By.xpath("(//table[@role='grid'])[2]/tbody/tr["+i+"]/td["+j+"]"));
				//System.out.println(dynDatas.getText());
				
			//}
			
		//}

	}
	
}
