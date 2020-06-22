package matura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class M2014 {
	
	public static boolean czyPierwsza(int n) {
		
		if(n%2 == 0) return false	 ;
		
		for(int i=3; i*i<=n; i+=2) {
			if(n%i == 0) return false;
		}
		return true;
	}
	
	public static void Zad5a(File input) {
		try {
			Scanner read = new Scanner(input);
			int licznik = 0;
			
			while(read.hasNext()) {
				String s = read.nextLine();
				int suma = 0;
				
				for (int i=0; i<s.length(); i++) {
					suma += Integer.valueOf(s.charAt(i));
				}
								
				if(czyPierwsza(suma)) licznik++;
				
			}
			
			System.out.println("a) \t" + licznik);
			
		} catch (FileNotFoundException e) {
			System.out.println("Blad pliku");
		}
	}
	
	public static boolean czyRosnaca(String s) {
		int tmp = 0;
		
		for(int i=0; i<s.length(); i++) {
			int val = Integer.valueOf(s.charAt(i));
			
			if(val > tmp) tmp = val;
			else return false;			
		}
		return true;
	}
	
	public static void Zad5b(File input) {
		try {
			Scanner read = new Scanner(input);
			
			System.out.print("\nb) ");
			while(read.hasNext()) {
				String s = read.nextLine();
				
				if(czyRosnaca(s)) System.out.println("\t" + s);	
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Blad pliku");
		}
	}
		
	public static void Zad5c(File input) {
		String[] Wyr = new String[1000];
		try {
			Scanner read = new Scanner(input);
			
			for(int i=0; i<1000; i++) {
				Wyr[i] = read.nextLine();
			} read = new Scanner(input);
			
			System.out.print("\nc)");
			
			while(read.hasNext()) {
				String s = read.nextLine();
				
				int licznik = 0;
				boolean printed = false;
				
				for(int i=0; i<Wyr.length; i++) {
					
					if(Wyr[i].equals(s)) {
						licznik++;
						
						if(licznik>1) {
							Wyr[i] = "";
							
							if(!printed) {
								System.out.println("\t" + s);
								printed = true;
							}
						}
					}
				}
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Blad pliku");
		}
	}
	
	public static void main(String[] args) {
		File input = new File("NAPIS.TXT");
		Zad5a(input);
		Zad5b(input);
		Zad5c(input);
	}

}
