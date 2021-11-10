package ua.lviv.lgs;

public class Cat extends Pet {
	public Cat(String name, int act){
		super (name, act);
	}
	
	@Override
	void voice() {
		System.out.println("ί κ³ς - Μÿσσσ-Μÿσσσ");
		
	}
}
