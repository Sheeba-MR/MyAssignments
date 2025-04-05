package week5.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver(); // launching the browser
		driver.get("https://www.leafground.com/window.xhtml"); //load the url
		driver.manage().window().maximize(); 
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//address of the parent window
		String Pwindow = driver.getWindowHandle();
		System.out.println(Pwindow); //1st time - A06089E2A95ECFB1730D9D75699D4C7F, 2nd time - 048D1688740148E2F9BB70A8ED31622C
		System.out.println();
		//get title of the parent window
		System.out.println(driver.getTitle());
		//click open
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		//giving driver control to the child window i.e) handling child window
		//get all windows
		Set<String> Cwindow = driver.getWindowHandles();
		//as we don't have index in set we are converting the set into list
		List <String> ListCwindow = new ArrayList<String>(Cwindow);
		//switch to child window
		driver.switchTo().window(ListCwindow.get(1));
		//get the adderess of the child window
		String CwindowAddress = driver.getWindowHandle();
		System.out.println(CwindowAddress);
		//title of the child window
		String cWindowTitle = driver.getTitle();
		System.out.println(cWindowTitle);
		driver.close(); //closes the current tab
		driver.quit(); //closes the entire browser (all tabs)
	}

}
