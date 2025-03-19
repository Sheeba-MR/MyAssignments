package week3.day2;

public class Car extends Vehicle {
	
	public void applyGear() {
		System.out.println("Sub class: Gear is applied");
	}
	
	public static void main(String[] args) {
		Car c = new Car();
		c.applyGear();
		//Vehicle v = new Vehicle(); // to access methods form another class we have created the object for that class
		//v.applyBrake();
		//v.soundHorn();
		//in real time we have 100s of classes so, for each class it is not possible to create object seperately, hence we go for inheritance
		//for inheritance we should use extends keyword to inherit the method for other classed
		c.applyBrake();//after mentioning extends keyword we can access the methods from vechile class to car class using the object created for car class
		c.soundHorn();
		
	}

}
