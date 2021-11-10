package ua.lviv.lgs;

public abstract class Pet {
	
	private String name;
	private int act;
	
	public Pet(String name, int act) {
		super();
		this.name = name;
		this.act = act;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAct() {
		return act;
	}
	public void setAct(int act) {
		this.act = act;
	}
	
	public void doid () {
		System.out.println("ß " + this.name + " - ÿ " + this.act);
	}
	
	abstract void voice();

}
