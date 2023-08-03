package basics;

public class InheritanceDemo {

	public static void main(String[] args) {
		Vehicle myVehicle = new Vehicle();
		myVehicle.start();
		myVehicle.move();
		myVehicle.move();
		myVehicle.stop();
		
		Scooter myScooter = new Scooter();
		myScooter.manufacturer="TVS";
		myScooter.model="Jupiter";
		myScooter.color="Black";
		myScooter.price=99000;
		
		myScooter.start();
		myScooter.move();
		myScooter.move();
		myScooter.information();
		myScooter.stop();
		
	}

}
// parent class
class Vehicle{
	// member variables/attributes
	String manufacturer;
	String model;
	String color;
	int price;
	int speed;
	
	public void start() {
		speed = 0;
		System.out.println("Vehicle:start with speed "+speed);
	}
	
	public void stop() {
		speed = 0;
		System.out.println("Vehicle:stop with speed "+speed);
	}
	
	public void move() {
		speed = speed+10;
		System.out.println("Vehicle:move with speed "+speed);
	}
	

	
	public void information() {
		System.out.println("manufacturer : "+manufacturer +" model: "+model +" color "+color + " price : "+price +" speed :"+speed );
	}
}
// child class
//class Scooter {
class Scooter extends Vehicle{
	//method overriding - run time polymorphism
	public void move() {
		speed = speed+20;
		System.out.println("Scooter:move with speed "+speed);
	}
	
}