package week3.day2;

public abstract class ICICI implements RBI {
	
	
	// below method is implemented method
	public void cibilScore() {
		System.out.println("5000");
	}
	
	// below method is unimplemented method
		public abstract void convertCurrency(); //abstract keyword is mentioned to denote this is unimplemented method
		
		//as we couldn't create object in the abstract method we create normal class / concrete class / implementation class to access methods
	

}
