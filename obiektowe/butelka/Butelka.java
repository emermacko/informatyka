package Butelka;

public class Butelka {
	
	private double pojemnosc;
	private double ileLitrow;
	
	Butelka(){
		this(1);
	}
	
	Butelka(double ileLitrow) {
		this(ileLitrow, 10);
	}
	
	Butelka(double ileLitrow, double pojemnosc) {
		if(pojemnosc >= 10)
				this.pojemnosc = 10;
			else 
				this.pojemnosc = pojemnosc;
		
		if(ileLitrow >= pojemnosc)
				this.ileLitrow = pojemnosc;
			else
				this.ileLitrow = ileLitrow;
	}
	
	public double getPojemnosc() {
		return pojemnosc;
	}
	
	public double getIleLitrow() {
		return ileLitrow;
	}

	public void setIleLitrow(double ileLitrow) {
		this.ileLitrow = ileLitrow;
	}
	
	public void wlej(double ilosc) {
		double current = this.getIleLitrow();
		this.ileLitrow += ilosc;
		if((this.getIleLitrow()) >= this.getPojemnosc()) {
			this.ileLitrow = this.getPojemnosc();
		} else {
			this.ileLitrow = current + ilosc;
		}
	}
	
	public void wylej(double ilosc) {
		double current = this.getIleLitrow();
		this.ileLitrow -= ilosc;
		if((this.getIleLitrow()) <= 0)
			this.ileLitrow = 0;
		else
			this.ileLitrow = current - ilosc;
	}
	
	public String toString() {
		String output = "Pojemnosc: " + this.pojemnosc
						+ "\nObecnie: " + this.ileLitrow
						+ "\n-------------------";
		return output;
	}

}


/* 
 	••••  ZAD DOM  •••• 
 	
 	Dodac max pojemnosc
 	Mozliwosc wlewania tylko do max pojemnosci
 	Mozliwosc wylewania tylko do 0
 	Mozliwosc przelewania pomiedzy butelkami
 	
*/
