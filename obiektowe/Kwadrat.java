package Obiektowe;

public class Kwadrat {
	
	private double bok;
	
	Kwadrat(){
		bok = 1;
	}
	
	public Kwadrat(double bok) {
		this.bok = bok;
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

}
