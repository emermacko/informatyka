package matura;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class M2015 {

	public static void Zad4_1(File input) {
		try {
			Scanner read = new Scanner(input);
			int licznik = 0;
			
			while(read.hasNext()) {
				String s = read.nextLine();
				int licznik0 = 0; int licznik1 = 0;
				
				for(int i=0; i<s.length(); i++) {
					if(s.charAt(i) == '0') licznik0++;
					if(s.charAt(i) == '1') licznik1++;
				} 
				
				if(licznik0 > licznik1) licznik++;
			}
			
			System.out.println("1. " + licznik + "\n");
			
		} catch (FileNotFoundException e) {System.out.println("Blad pliku");}
	}
	
	public static void Zad4_2(File input) {
		try {
			Scanner read = new Scanner(input);
			int licznik2 = 0; int licznik8 = 0;
			
			while(read.hasNext()) {
				String s = read.nextLine();
				if(s.charAt(s.length()-1) == '0') {
					if(s.charAt(s.length()-2) == '0' && s.charAt(s.length()-3)=='0') {
						licznik8++;
					}
					licznik2++;
				}
			}
			
			System.out.println("2. Podzielnych przez 8: " + licznik8 + "\n   Podzielnych przez 2: " + licznik2 + "\n");
		} catch (FileNotFoundException e) {System.out.println("Blad pliku");}
	}
	
	public static void Zad4_3(File input) {
		try {
			Scanner read1 = new Scanner(input);		// Wyszukanie najwiekszej dlugosci
			Scanner read2 = new Scanner(input);		// Wyszukanie najmniejszej dlugosci
			Scanner read3 = new Scanner(input);		// Znalezienie najwiekszej liczby
			Scanner read4 = new Scanner(input);		// Znalezienie najmniejszej liczby
			
			String min = ""; String max = "";
			int num_max = 0; int num_min = 0;
			int maxlen = 0; int minlen = 100;
			
			/* max */ while(read1.hasNext()) {String s = read1.nextLine();if(s.length() > maxlen) {maxlen = s.length(); max = s;}}
			/* min */ while(read2.hasNext()) {String s = read2.nextLine();if(s.length() < minlen) {minlen = s.length(); min = s;}}
			
			int wiersz = 0;		
			while(read3.hasNext()) {
				wiersz++;
				String s = read3.nextLine();
				if(s.length() == maxlen) {
					int i=1;
					while(i<maxlen) {
						if(s.charAt(i) != max.charAt(i)) {
							if(s.charAt(i) > max.charAt(i)) {
								num_max = wiersz; max = s;
								break;
							} else break;
						} else i++;
					}
				}
			} System.out.println("3. Max wiersz: " + num_max);
			
			wiersz = 0;			
			while(read4.hasNext()) {
				wiersz++;
				String s = read4.nextLine();
				if(s.length() == minlen) {
					int i=1;
					while(i<minlen) {
						if(s.charAt(i) != min.charAt(i)) {
							if(s.charAt(i) < min.charAt(i)) {
								num_min = wiersz; min = s;
								break;
							} else break;
						} else i++;
					}
				}
			} System.out.println("   Min wiersz: " + num_min);

		} catch (FileNotFoundException e) {System.out.println("Blad pliku");}
	}
	
	public static void main(String[] args) {
		File input = new File("liczby.txt");
		
		Zad4_1(input);
		Zad4_2(input);
		Zad4_3(input);
	}

}
