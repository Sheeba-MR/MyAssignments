package week3.day2;

public class Bmw extends Car {
	
	public void voiceCommand() {
		System.out.println("Class: Voice command is enabled");
	}
	
	public void turnOnAc() {
		System.out.println("Class: turn on ac");
	}
	
	public static void main(String[] args) {
		Bmw b = new Bmw();
		//here i can access methods from Vehicle(because car class extends vehicle class method), Car and Bmw class
		b.applyBrake();
		b.soundHorn();
		b.applyGear();
		b.voiceCommand();
		b.turnOnAc();
	}

}
