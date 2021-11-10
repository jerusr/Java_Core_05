package ua.lviv.lgs;

public class Cow extends Pet{
	
	public Cow(String name, int act){
		super (name, act);
	}
	
	@Override
	void voice() {
		System.out.println("ß êîğîâà - Ìóóó-Ìóóó");
		
	}
	
}
