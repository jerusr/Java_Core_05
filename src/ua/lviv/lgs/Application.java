package ua.lviv.lgs;

public class Application {

	public static void main(String[] args) {
		
		System.out.println("Animal");
		System.out.println("-------------------");
		System.out.println();
// Завдання 1
		Cat cat = new Cat("Василь", 13);
		Cow cow = new Cow("Маруська", 4);
		Dog dog = new Dog("Петька", 10);
		
		cat.voice();
		cow.voice();
		dog.voice();
		
// Завдання 3
		System.out.println();
		System.out.println("Frog");
		System.out.println("-------------------");
		System.out.println();
		
		Amphibia frog = new Frog("земноводні", "жовтого");
		
		frog.eat();
		frog.sleep();
		frog.swim();
		frog.walk();
		
	}

}
