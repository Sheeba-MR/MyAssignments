package week3.day2;

public class SBI extends Axis implements RBI, Intrfc { //we are accessing the methods from Axis class

	@Override
	public void withDrawlLimit() { 
		// method from interface
		System.out.println("25000");
	}

	@Override
	public void knowYourCustomer() {
		// method from interface
		System.out.println("AADHAR");
	}
	//other than the methods in the interface, the class can have it's own method too
	public void goldLoan() {
		System.out.println("rate of interest is 7%");
	}
	
	public static void main(String[] args) {
		SBI s = new SBI();
		s.withDrawlLimit();
		s.knowYourCustomer();
		s.goldLoan();
		s.housingLoan(); //using implements keyword this method has came from Axis class
	}

	@Override
	public void systemDesign() { //this method is from Intrfc - we can implement multiple interface
		// TODO Auto-generated method stub
		
	}

}
