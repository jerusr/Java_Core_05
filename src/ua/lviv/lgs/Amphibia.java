package ua.lviv.lgs;

public class Amphibia {
	
	private String subspecies;
	private String color;
	
	public Amphibia(String subspecies, String color) {
		super();
		this.subspecies = subspecies;
		this.color = color;
	}

	public String getSubspecies() {
		return subspecies;
	}

	public void setSubspecies(String subspecies) {
		this.subspecies = subspecies;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void eat () {
		System.out.println("Я амфібія, підвиду - " + this.subspecies + ", я " + this.color + " кольору і я їм");
	}
	public void sleep () {
		System.out.println("Я амфібія, підвиду - " + this.subspecies + ", я " + this.color + " кольору і я сплю");
	}
	public void swim () {
		System.out.println("Я амфібія, підвиду - " + this.subspecies + ", я " + this.color + " кольору і я плаваю");
	}
	public void walk () {
		System.out.println("Я амфібія, підвиду - " + this.subspecies + ", я " + this.color + " кольору і я гуляю");
	}

}
