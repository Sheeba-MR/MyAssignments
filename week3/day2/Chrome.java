package week3.day2;

public class Chrome extends Browser {
	
	// implemented simple inheritance
	
	public void openIncognito() {
		System.out.println("Open incognito mode - sub class");
	}
	
	public void clearCache() {
		System.out.println("Clear the cache - sub class");
	}
	
	public static void main(String[] args) {
		Chrome c = new Chrome();
		c.openURL();
		c.closeBrowser();
		c.openIncognito();
		c.clearCache();
	}
}
