package Inheritance_Example;

public class VehicleApp {

	
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.setBrand("Opel");
		myCar.setColor("Black");
		myCar.setWeight(1410);
		myCar.setNumOfPassengers(4);
		System.out.println("The brand of the car: " +myCar.getBrand());
		System.out.println("The color of the car: " +myCar.getColor());
		System.out.println("The weight of the car: " +myCar.getWeight());
		System.out.println("The weight of the car: " +myCar.getWeight());
		System.out.println("The num of passengers"  + myCar.getNumOfPassengers());
	}


	
}
