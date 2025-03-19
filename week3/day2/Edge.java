package week3.day2;

public class Edge extends Chrome {
	
	// implemented multi level inheritance
	
	public void takeSnap() {
		System.out.println("Take a snap - sub class");
	}
	
	public void clearCookies() {
		System.out.println("Clear the cookies - sub class");
	}
	
	public static void main(String[] args) {
		Edge e = new Edge();
		e.takeSnap();
		e.clearCookies();
		e.openIncognito();
		e.clearCache();
		e.navigateBack();
		
	}
}
