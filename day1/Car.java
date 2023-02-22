package week1.day1;

public class Car {
   
	public void driveCar() {
		
           System.out.println("I am driving Tesla");
	}
	public void applyBrake() {
	
		System.out.println("Auto brakes Engaged");
	}
	public void soundHorn() {
		
		System.out.println("Make a Loud Horn to Passby");
	}
	public void isPuncture() {
		
		System.out.println("Tesla tyres are tubeless");
	}
	public static void main(String[] args) {
		
		Car t= new Car();
		t.driveCar();
		t.applyBrake();
		t.soundHorn();
		t.isPuncture();
		
	}

}
