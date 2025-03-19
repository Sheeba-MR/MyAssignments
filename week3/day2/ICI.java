package week3.day2;

public class ICI extends ICICI {

	//methods from implemented class (RBI / interface) and unimplemented class (ICICI / abstract class have implemented below)
	@Override
	public void withDrawlLimit() { //method from RBI / interface
		System.out.println("5000");
		
	}

	@Override
	public void knowYourCustomer() { //method from RBI / interface
		System.out.println("pancard details");
		
	}

	@Override
	public void convertCurrency() { //method from ICICI / abstract class
		System.out.println("in dollars");
		
	}
	
	public static void main(String[] args) {
		ICI i = new ICI();
		i.cibilScore(); //implemented method in abstract class - ICICI
		i.withDrawlLimit();
		i.knowYourCustomer();
		i.convertCurrency();
	}

}
