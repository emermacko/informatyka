package Obiektowe;

public class Kwadrat {
	
	static int ID=1;
	
	private double bok;
	private int id = 1;
	
	Kwadrat(){
		this(1);
	}
	
	public Kwadrat(double bok) {
		this(bok, "cos innego");
	}
	
	public Kwadrat(double bok, String s) {
		this.id = ID; ID++;
		if(s.equals("km")) this.bok = bok*1000;
		else this.bok = bok;
	}
	
	public int getID() {
		return this.id;
	}
	
	public void setBok(double bok) {
		this.bok = bok;
	}
	
	public double getBok() {
		return this.bok;
	}
	
	public double obliczPole() {
		return Math.pow(this.bok, 2);
	}
	
	public double obliczObwod() {
		return this.bok*4;
	}
	
	public String toString() {
		return "ID:" + this.getID() + " Bok: " + this.getBok() + " Pole: " + this.obliczPole();
	}

}
