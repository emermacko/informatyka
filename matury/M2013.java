package matura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class M2013 {
	
	public static void zad3(File file) {
		try {
			Scanner read = new Scanner(file);
			int licznik = 0;
			int max = 0;
			int min = 2000001;
			
			while(read.hasNext()) {
				String s = read.nextLine();
				int num = Integer.valueOf(s);
				
				for(int i=0; i<s.length()-1; i++) {
					if(s.charAt(i) <= s.charAt(i+1)) {
						if(i == s.length()-2) {
							licznik++;
							if(num > max) max = num;
							if(num < min) min = num;
						} else {
							continue;
						}
					} else {
						break;
					}
				}
			}
			
			System.out.println("Zad3:\nLacznie liczb: " + licznik + "\nmax: " + max + "(8)\nmin: " + min + "(8)");

		} catch (FileNotFoundException e) {
			System.out.println("Blad pliku");
			e.printStackTrace();
		}
	}
		
	public static void zad2(File file) {
		
		try {
			Scanner read = new Scanner(file);
			int licznik = 0;
			
			while(read.hasNext()) {
				String s = String.valueOf(Integer.parseInt(read.nextLine(), 8));
				if(s.charAt(0) == s.charAt(s.length()-1)) licznik++;
			}
			
			System.out.println("Zad2: " + licznik);

		} catch (FileNotFoundException e) {
			System.out.println("Blad pliku");
			e.printStackTrace();
		}
	}
	
	public static void zad1(File file) {
		
		try {
			Scanner read = new Scanner(file);
			int licznik = 0;
			
			while(read.hasNext()) {
				String s = read.nextLine();
				if(s.charAt(0) == s.charAt(s.length()-1)) licznik++;
			}
			
			System.out.println("Zad1: " + licznik);

		} catch (FileNotFoundException e) {
			System.out.println("Blad pliku");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		String plik = "dane.txt";
		File file = new File(plik);

		zad1(file);
		zad2(file);
		zad3(file);
		
	}

}
