package Polymorphism_Example;

public class AnimalApp {
	
	public static void main(String[] args) {
		
		Animal animal = new Animal();
		Animal cat = new Cat();
		Dog dog = new Dog();
		cat.animalSound();
		animal.animalSound();
		dog.animalSound();
		
		
	}

}
