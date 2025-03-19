package week3.day2;

public class Vehicle {
	
	public void applyBrake() {
		System.out.println("Super class: Brake is applied");
	}
	
	public void soundHorn() {
		System.out.println("Super class: Please give way");
	}
	
	//public static void main(String[] args) {
		//Vehicle v = new Vehicle();
		//v.applyGear();
		//v.applyBrake(); - usaualy we'll call methods by creating object in the main method
		// in inheritance concept no need to create the object in super class
		// but in inhertiance we'll use the below way to call methods from one class to another class
		
	//}

}
