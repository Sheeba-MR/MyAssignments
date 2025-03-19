package week3.day2;

public class Safari extends Browser {
	
	// implemented hierarchial inheritance 
	
	public void readerMode() {
		System.out.println("Read only - sub class");
	}
	
	public void fullScreenMode() {
		System.out.println("Fullscreen view - sub class");
	}
	
	public static void main(String[] args) {
		Safari s = new Safari();
		s.readerMode();
		s.fullScreenMode();
		s.openURL();
		s.closeBrowser();
	}
	
}
