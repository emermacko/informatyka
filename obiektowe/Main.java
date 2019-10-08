package Obiektowe;

import java.util.Scanner;

public class Main {
	
	public static Scanner read = new Scanner(System.in);
	
	public static void Kwadrat() {
		double bok;
		
		do {
			System.out.print("Podaj bok kwadartu [ > ] ");
			bok = read.nextDouble();
		} while(bok<=0);
		
		Kwadrat kw1 = new Kwadrat(bok);
		
		System.out.print("Obwod kwadratu o boku [" + kw1.getBok() + "] = ");
		System.out.println(kw1.obliczObwod());
		System.out.print("Pole kwadratu o boku [" + kw1.getBok() + "] = ");
		System.out.println(kw1.obliczPole());

	}
	
	public static void Kwadrat2() {
		Kwadrat kw[] = new Kwadrat[3];
		kw[0] = new Kwadrat(2.6);
		kw[1] = new Kwadrat();
		kw[2] = new Kwadrat(3, "km");
		
		System.out.println(kw[0]);System.out.println(kw[1]);System.out.println(kw[2]);
		System.out.println();
	}
	
	public static void Kolo() {
		double promien;
		
		do {
			System.out.print("\nPodaj promien [ > ] ");
			promien = read.nextDouble();
		} while(promien<=0);
		
		Kolo kolo1 = new Kolo(promien);
		//Kolo kolo1 = new Kolo();
		
		System.out.print("Pole kola o boku [" + kolo1.getPromien() + "] = ");
		System.out.println(kolo1.obliczPole());

	}

	public static void main(String[] args) {
		//Kwadrat();
		//Kolo();
				
		Kwadrat2();
		read.close();
	
	}

}
