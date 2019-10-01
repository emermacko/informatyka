package Obiektowe;

import java.util.Scanner;

public class Main {
	
	public static void Kwadrat() {
		Scanner read = new Scanner(System.in);
		double bok;
		
		do {
			System.out.print("Podaj bok kwadartu [ > ] ");
			bok = read.nextDouble();
		} while(bok<=0); read.close();
		
		Kwadrat kw1 = new Kwadrat(bok);
		//Kwadrat kw1 = new Kwadrat();
		
		System.out.print("\nObwod kwadratu o boku [" + kw1.getBok() + "] = ");
		System.out.println(kw1.obliczObwod());
		System.out.print("Pole kwadratu o boku [" + kw1.getBok() + "] = ");
		System.out.println(kw1.obliczPole());

	}
	
	public static void Kolo() {
		Scanner read = new Scanner(System.in);
		double promien;
		
		do {
			System.out.print("Podaj prmien kola [ > ] ");
			promien = read.nextDouble();
		} while(promien <= 0); read.close();
		
		Kolo kolo1 = new Kolo(promien);
		//Kwadrat kw1 = new Kwadrat();
		
		System.out.print("Pole kwadratu o boku [" + kolo1.getPromien() + "] = ");
		System.out.println(kolo1.obliczPole());

	}

	public static void main(String[] args) {
		//Kwadrat();
		Kolo();
	}

}
