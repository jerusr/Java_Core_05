package ua.lviv.lgs;

public class Dog extends Pet {
	public Dog(String name, int act){
		super (name, act);
	}
	
	@Override
	void voice() {
		System.out.println("ί οερ - Γΰσσσ-Γΰσσσ");
		
	}
}
