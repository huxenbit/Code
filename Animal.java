interface Meowable {void meow();}
interface Barkable {void bark();}
interface Huntable {void hunt();}
interface Swimable {void swim();}
interface Chillable {void chill();}
interface Keeper {void perform(Animal animal);}


public class Animal {
	String name;
	int age;
	
	
	public static void main(String[] args) {
		ZooKeeper zk = new ZooKeeper();
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.name = "Enzo";
		dog.breed = "Chihuahua";
		cat.name = "Minka";
		cat.fur = "Schwarz/Weiß";
		zk.perform(dog);
		zk.perform(cat);
	}
	

	void makeSound() {
		
	}
}

class Dog extends Animal implements Barkable, Swimable, Huntable {
	String breed;
	
	public void bark() {
		System.out.println("Wuff! Wuff!");
	}
	
	public void swim() {
		System.out.println(name + " der " + breed + " ist am schwimmen!");
	}
	
	public void hunt() {
		System.out.println(name + " der " + breed + " ist am jagen!");
	}
	
	
}

class Cat extends Animal implements Chillable, Meowable, Huntable {
	String fur;
	
	public void chill() {
		System.out.println(name + "mit dem Fell: " + fur + " ist am chillen!");
	}
	
	public void meow() {
		System.out.println("Meow!");
	}
	
	public void hunt() {
		System.out.println(name + " mit dem Fell: " + fur + " ist am jagen!");
	}
	
}

class ZooKeeper implements Keeper {
	
	public void perform(Animal animal) {
		if (animal instanceof Meowable) {
			((Meowable) animal).meow();
		}
		
		if (animal instanceof Barkable) {
			((Barkable) animal).bark();
		}
	}
}