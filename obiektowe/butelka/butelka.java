package Butelka;

public class Butelka {
	
	private double pojemnosc;
	private double ileLitrow;
	
	Butelka(){
		ileLitrow = 1;
	}
	
	Butelka(double ileLitrow) {
		this.ileLitrow = ileLitrow;
	}
	
	public double getIleLitrow() {
		return ileLitrow;
	}

	public void setIleLitrow(double ileLitrow) {
		this.ileLitrow = ileLitrow;
	}
	
	public void wlej(double ilosc) {
		ileLitrow += ilosc;
	}
	
	public void wylej(double ilosc) {
		ileLitrow -= ilosc;
	}
	
	public String toString() {
		return "Pojemnosc: " + this.ileLitrow;
	}

}


/* 
 	••••  ZAD DOM  •••• 
 	
 	Dodac max pojemnosc
 	Mozliwosc wlewania tylko do max pojemnosci
 	Mozliwosc wyleawnia tylko do 0
 	Mozliwosc przelewania pomiedzy butelkami
 	
*/
