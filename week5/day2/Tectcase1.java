package week5.day2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Tectcase1 extends AnnotAssignment {
@Test
	public void test1() throws InterruptedException {
		
		//enter the name
		driver.findElement(By.className("slds-input")).sendKeys("Salesforce Automation by Sheeba MR");
		//click save
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		
		

	}

}
