package week5.day2;



import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Testcase2 extends AnnotAssignment {
	@Test
	public void test2() throws InterruptedException {
		
				//enter the Company name as 'TestLeaf'
				driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("TestLeaf");
				//Enter Description as 'Salesforces'
				driver.findElement(By.className("slds-textarea")).sendKeys("Salesforces");
				//select status as active
				driver.findElement(By.id("combobox-button-170")).click();
				driver.findElement(By.xpath("//span[text()='Active']")).click(); // this is not inside select tag so i selected normally
				//click save
				driver.findElement(By.xpath("//button[text()='Save']")).click();
	}
}
