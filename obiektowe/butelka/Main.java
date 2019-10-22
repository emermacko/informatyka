package butelka;

import java.util.Scanner;

public class Main {
	
	public static Scanner read = new Scanner(System.in);

	public static void przelewanie(Butelka[] Butelki) {
		
		int b1; boolean error = false;
		do {
			error = false;
			System.out.print("Z jakiej butelki przelac? [>] "); b1 = read.nextInt(); b1--;
			if(b1 >= Butelki.length || b1 < 0) { // error jak zla butelka
				System.out.println("Nie ma takiej butelki");
				error = true;
			}
			if(!error && Butelki[b1].getIleLitrow() == 0) { // error jak butelka jest pusta
				System.out.println("Butelka pusta");
				error = true;
			}
		} while(error);
				
		int z_b1;
		do {
			 error = false;
			System.out.print("Ile litrow przelac z butelki " + (b1+1) + "? [>] "); z_b1 = read.nextInt();
		} while(error);
		
		int b2;
		do {
			error = false;
			System.out.print("Do jakiej butelki przelac? [>] "); b2 = read.nextInt(); b2--;
			if(b2 >= Butelki.length || b2 < 0) { // error jak zla butelka
				System.out.println("Nie ma takiej butelki");
				error = true;
			}
			if(b2 == b1) { // error jak ta sama dwa razy
				System.out.println("Nie mozna przelac do tej samej butelki");
				error = true;
			}
			if(Butelki[b2].getIleLitrow() == Butelki[b2].getPojemnosc()) { // error jak butelka jest pelna
				System.out.println("Butelka pelna");
				error = true;
			}
		} while(error);
		
		double zajete1 = Butelki[b1].getIleLitrow();
		double zajete2 = Butelki[b2].getIleLitrow(); double pojemnosc2 = Butelki[b2].getPojemnosc();
	
		if(z_b1 > zajete1) {
			if((z_b1 + zajete2) > pojemnosc2) {
				double wolne = pojemnosc2 - zajete2;
				Butelki[b1].wylej(wolne);
				Butelki[b2].wlej(wolne);
			} else {
				Butelki[b1].wylej(zajete1);
				Butelki[b2].wlej(zajete1);
			}
		} else if((z_b1 + zajete2) > pojemnosc2) {
			double wolne = pojemnosc2 - zajete2;
			Butelki[b1].wylej(wolne);
			Butelki[b2].wlej(wolne);
		} else {
			Butelki[b1].wylej(z_b1);
			Butelki[b2].wlej(z_b1);
		}	
		
		for(Butelka butelka : Butelki) { System.out.println(butelka); }
		//System.out.println("\n---------------------");
		
	}
	
	public static void butelka() {
		Butelka[] Butelki = new Butelka[3];
		Butelki[0] = new Butelka();
		Butelki[1] = new Butelka(5,7);
		Butelki[2] = new Butelka(10);
		
		for(Butelka butelka : Butelki) { System.out.println(butelka); }
		//System.out.println("---------------------");
				
		while(true) {
			System.out.println();przelewanie(Butelki);
		}
	}
	
	public static void main(String[] args) {
		butelka();	
	}
}
