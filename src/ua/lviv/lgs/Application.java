package ua.lviv.lgs;

public class Application {

	public static void main(String[] args) {
		
		System.out.println("Animal");
		System.out.println("-------------------");
		System.out.println();
// �������� 1
		Cat cat = new Cat("������", 13);
		Cow cow = new Cow("��������", 4);
		Dog dog = new Dog("������", 10);
		
		cat.voice();
		cow.voice();
		dog.voice();
		
// �������� 3
		System.out.println();
		System.out.println("Frog");
		System.out.println("-------------------");
		System.out.println();
		
		Amphibia frog = new Frog("���������", "�������");
		
		frog.eat();
		frog.sleep();
		frog.swim();
		frog.walk();
		
	}

}
