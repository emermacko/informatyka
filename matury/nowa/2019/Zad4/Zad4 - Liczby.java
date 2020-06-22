package matura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class M2019 {
	
	public static int[] wpisywanie(File file) {
		try {
			//int[] tab = new int[500];
			int[] tab = new int[17];
			Scanner read = new Scanner(file);
			
			int i = 0;
			while(read.hasNext()) {
				tab[i] = read.nextInt();
				i++;
			}
			return tab;
			
		} catch (FileNotFoundException e) {System.out.println("Blad pliku");} return null;
	}
	
	public static int NWD(int a, int b) {
		int mniejsza = Integer.min(a, b);
		int wieksza = Integer.max(a, b);
	
		int dzielnik = 1;
		
		for(int i=1; i<=mniejsza; i++) {
			if(mniejsza%i == 0 && wieksza%i == 0) dzielnik = i;
		}
		return dzielnik;
	}
	
	public static int silnia(int liczba) {
		if(liczba == 0) return 1;
		
		int iloczyn = 1;
		for(int i=1; i<=liczba; i++) {
			iloczyn *= i;
		}
		return iloczyn;
	}
	
	public static void zad1(File file) {
		
		try {
			Scanner read = new Scanner(file);
			
			int licznik4_1 = 0;
			while(read.hasNext()) {
				int x = read.nextInt();
				
				for(int i=0; i<11; i++) {
					if(x == Math.pow(3, i)) {
						licznik4_1++;
						break;
					}
				}
			}
			
			System.out.println(licznik4_1);
			
		} catch (FileNotFoundException e) {
			System.out.println("Blad pliku");
		}
	}

	public static void zad2(File file) {
		try {
			Scanner read = new Scanner(file);
			
			while(read.hasNext()) {
				int x = read.nextInt();
				int x_var = x;
				int licznik = 0;

				while(x > 0) {
					int last = x%10;
					licznik += silnia(last);
					x /= 10;
				}
				
				if(x_var == licznik) System.out.println(" " + x_var);

			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Blad pliku");
		}
	}

	public static void zad3(File file) {
		try {
			Scanner read = new Scanner(file);
			int dlugosc = 1; int pierwsza = -1; int dzielnik = -1;
			int maxdlugosc = 1; int maxpierwsza = -1; int maxdzielnik = -1;
			int NWDprev = -1;
			
			int[] tab = wpisywanie(file);
			
			System.out.println("\n Pierwsza liczba: " + maxpierwsza);
			System.out.println(" Dlugosc ciagu: " + maxdlugosc);
			System.out.println(" NWD: " + maxdzielnik);
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Blad pliku");
		}
	}
	
	public static void nice(File file) {
		try {
			Scanner read = new Scanner(file);
			int licznik = 0;
			while(read.hasNext()) {
				int x = read.nextInt();
				int suma=0;
				
				while(x > 0) {
					int last = x%10;
					suma += last;
					x /= 10;
				}
				if(suma%7 == 0) licznik++;

			}
			System.out.println("Liczb podzielnych przez 7: " + licznik);
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Blad pliku");
		}
	}
	
	public static void main(String[] args) {
		File file = new File("liczby.txt");
		File test = new File("przyklad.txt");
		
		System.out.print("4.1 [>] "); zad1(file);
		System.out.print("\n4.2 [>] \n"); zad2(file);
		nice(file);
		
//		 try (	Scanner read = new Scanner(plik);
//				PrintWriter zapis = new PrintWriter("WynikNapis.txt");) { 
//		
//			[ ... ]
//		
//			zapis1.println(WYNIK);
//		} catch {}
		
		
		
	}

	
}
