package Butelka;

import java.util.Scanner;

public class Main {
	
	public static Scanner read = new Scanner(System.in);

	public static void butelka() {
		Butelka[] B = new Butelka[3];
		B[0] = new Butelka();
		B[1] = new Butelka(2);
		B[2] = new Butelka(10);
		
		for(Butelka butelka : B) {
			System.out.println(butelka.toString());
		}
		
		System.out.println("\nWlewanie 2L do butelki 1 ...");
		B[0].wlej(2);
		System.out.println("Wylewanie 1L z butelki 1 ...");
		B[1].wylej(1);
		System.out.println("Wylewanie 5L z butelki 1 ...\n");
		B[2].wylej(5);
		
		for(Butelka butelka : B) {
			System.out.println(butelka.toString());
		}
	}
	
	public static void main(String[] args) {
		butelka();
	}

}
