package week3.day2;

public class Browser {
	String browser1 = "browserName";
	String browser2 = "browserVersion";
	
	public void openURL () {
		System.out.println("Open the url - super class");
	}
	
	public void closeBrowser () {
		System.out.println("Close the browser - super class");
	}
	
	public void navigateBack () {
		System.out.println("Navigate to the previous page - super class");
	}
	
	public static void main(String[] args) {
		Browser b = new Browser();
		b.openURL();
		b.closeBrowser();
		b.navigateBack();
	}
}
