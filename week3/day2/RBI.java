package week3.day2;

public interface RBI {
	//point1: defining methods here in interface
	//public void loan(); //in interface we should mention the method body
	
	//point2: public abstract void withDrawlLimit(); - no need to mention the abstract implicitly or explicitly keyword because it is 100% abstract methods(unimplemented methods)
	public void withDrawlLimit();
	
	//point3: after java 1.7 it is possible to implement methods inside the interface using default and static keywords
	//public static void knowYourCustomer() {
		//System.out.println("kyc details");
	
	//}
	public void knowYourCustomer();
	
	
}
