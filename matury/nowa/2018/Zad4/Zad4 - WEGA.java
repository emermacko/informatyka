package matura;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class M2018 {
	
	static String[] tab = new String[1000];
	static File przyklad = new File("przyklad.txt");
	static File sygnaly = new File("sygnaly.txt");
	
	static void wczytanie(File input) {
		try (Scanner read = new Scanner(input);
			PrintWriter zapis = new PrintWriter("wyniki4_1.txt")){
				
				int i = 0;
				while(read.hasNext()) {
					tab[i] = read.nextLine();
					i++;
				}			
				
			} catch (FileNotFoundException e) {
				System.out.println("Blad pliku");
			}
	}
	
	static void zad4_1() {
									
			String zlaczone = "";
			for(int i=39; i<1000; i+=40) {
				zlaczone += tab[i].charAt(9);
			}
			
			System.out.println("4.1\t" + zlaczone);
	}

	static void zad4_2() {

		String slowo = ""; int maxliter = 0;
		
		for(int i=0; i<1000; i++) {
			
			String s = tab[i];
			String litery = "" + s.charAt(0);
			
			for(int j=1; j<s.length(); j++) {
				if(!litery.contains(String.valueOf(s.charAt(j)))) {
					litery += s.charAt(j);
				}
				
				if(litery.length() > maxliter) {
					slowo = s;
					maxliter = litery.length();
				}
			}
		}
						
		System.out.println("\n4.2\t" + slowo + " " + maxliter);
	}
	
	static void zad4_3() {
		
		System.out.print("\n4.3");
		for(int i=0; i<tab.length; i++) {
			
			String s = tab[i];
			boolean x = false;
			
	outerfor: for(int k=0; k<s.length(); k++) {
				for(int j=k+1; j<s.length(); j++) {
					if(Math.abs(s.charAt(k) - s.charAt(j)) > 10) {
						x = true;
						break outerfor;
					}
				}
			}
			
			if(!x) System.out.println("\t" + s);
		}
	}
		
	public static void main(String[] args) {
		wczytanie(sygnaly);
		
		zad4_1();
		zad4_2();
		zad4_3();
		
	}

}
