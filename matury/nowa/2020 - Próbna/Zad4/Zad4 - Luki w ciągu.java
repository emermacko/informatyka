package matura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import matura.Obiekcik;

public class Zad4 {
	
	static int[] tab;
	
	public static void wczytanie(File input) {
		try (Scanner read = new Scanner(input);){
			
			tab = new int[1000]; int x=0; 
			while(read.hasNext()) {
				tab[x++] = read.nextInt();
			}
					
		} catch (FileNotFoundException e) {
			System.out.println("BŁAD PLIKU");
		}
	}
	
	public static void Zad4_1() {
		int max = 0; int min = 2*(int)Math.pow(10, 9);
		for(int i=0; i<tab.length-1; i++) {
			if(Math.abs(tab[i] - tab[i+1]) < min) min = Math.abs(tab[i] - tab[i+1]);
			if(Math.abs(tab[i] - tab[i+1]) > max) max = Math.abs(tab[i] - tab[i+1]);
		}
		
		
		System.out.println("1.");
		System.out.println("Najmniejsza luka: " + min);
		System.out.println("Najwieksza luka: " + max);
	}
	
	public static void Zad4_2() {
		int max = 0; int licznik = 2; int roznica = Math.abs(tab[0] - tab[1]); int poczatek = tab[0]; int koniec = tab[1];
		
		for(int i=1; i<tab.length-1; i++) {
			int luka = Math.abs(tab[i] - tab[i+1]);
			
			if(luka == roznica) licznik++;
			else {
				roznica = luka;
				if(licznik > max) {
					poczatek = tab[i-licznik+1]; koniec = tab[i-1];
					max = licznik;
				}
				licznik = 2;
			}
		}
		
		System.out.println("\n2.");
		System.out.println("Najdłuższy fragment: " + max);
		System.out.println("Pierwszy wyraz: " + poczatek); 
		System.out.println("Ostatni wyraz: " + koniec);
	}
	
	public static void Zad4_3() {
		int roznica = Math.abs(tab[0] - tab[1]);
		
		List<Obiekcik> obiekty = new ArrayList<Obiekcik>();
		obiekty.add(new Obiekcik(roznica));	// pierwszy
		
		for(int i=1; i<tab.length-1; i++) {
			int luka = Math.abs(tab[i] - tab[i+1]);
			
			if(luka == roznica) {
				for(Obiekcik o : obiekty) {
					if(o.getLuka() == luka) {
						o.zwiekszKrotnosc();
						break;
					}
				}
			} else {
				
				boolean ADD = true;
				for(Obiekcik o : obiekty) {
					if(o.getLuka() == luka) {
						ADD = false; o.zwiekszKrotnosc();
					}
				} if(ADD) obiekty.add(new Obiekcik(luka));
				
				roznica = luka;
			}
		}
		
		int maxKrotnosc = 0;
		for(Obiekcik o : obiekty) {
			if(o.getKrotnosc() > maxKrotnosc) maxKrotnosc = o.getKrotnosc();
		}
		
		
		System.out.println("\n3.");
		System.out.println("Krotnosc: " + maxKrotnosc);
		System.out.print("Luki: ");
		for(Obiekcik o : obiekty) {
			if(o.getKrotnosc() == maxKrotnosc) System.out.print(o.getLuka() + ", ");
		}
		
	}

	public static void main(String[] args) {
		File input = new File("dane4.txt");
		wczytanie(input);
		Zad4_1();
		Zad4_2();
		Zad4_3();
	}

}
