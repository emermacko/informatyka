package Obiektowe;

public class Kolo {
	
	private double promien;
	
	Kolo(){
		promien = 1;
	}
	
	public Kolo(double promien) {
		this.promien = promien;
	}
	
	public void setPromien(double promien) {
		this.promien = promien;
	}
	
	public double getPromien() {
		return this.promien;
	}
	
	public double obliczPole() {
		double pole = Math.PI*Math.pow(this.promien, 2);
		return pole;
	}

}
