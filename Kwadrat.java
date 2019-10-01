package Obiektowe;

public class Kwadrat {
	
	private double bok;
	
	public Kwadrat(double Bok) {
		bok = Bok;
	}
	
	public void setBok(double Bok) {
		this.bok = Bok;
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
