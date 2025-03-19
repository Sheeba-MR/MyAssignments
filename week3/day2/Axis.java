package week3.day2;

public class Axis implements RBI {

	@Override
	public void withDrawlLimit() {
		// method from interface
		System.out.println("AADHAR1");
		
	}

	@Override
	public void knowYourCustomer() {
		// method from interface
		System.out.println("10000");
		
	}
	
	//other than the methods in the interface, the class can have it's own method too
	public void housingLoan() {
		System.out.println("rate of interest is 8%");
	}
	
	public static void main(String[] args) {
		Axis a = new Axis();
		a.withDrawlLimit();
		a.knowYourCustomer();
		a.housingLoan();
		
	}

}
