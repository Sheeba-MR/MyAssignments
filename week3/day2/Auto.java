package week3.day2;

public class Auto extends Bmw {
	
	public void applyMeter() {
		System.out.println("pay the amount");
	}
	
	public void bookAuto() {
		System.out.println("Booked the auto");
	}
	
	
	public static void main(String[] args)  {
		Auto a = new Auto();
		a.applyBrake(); //method from vehicle
		a.applyMeter(); //method from auto
		
		
 
		
	}

}
