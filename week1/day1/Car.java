package week1.day1;

public class Car {
	
	public void driveCar() {
	
		System.out.println("driving car");
	}
	public void applyBrake() {
		
		System.out.println("applied brakes");
	}
	public void soundHorn() {
		
		System.out.println("horn is pressed");
	}
	public void isPuncture() {
		
		System.out.println("trye is punctured");
	}
	public static void main(String[] args) {
	
		Car benz = new Car();
		benz.applyBrake();
		benz.driveCar();
		benz.isPuncture();
		benz.soundHorn();
		// TODO Auto-generated method stub

	}

}
