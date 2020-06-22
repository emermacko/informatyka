package matura;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class M2017 {
	
	public static void Zad6_1(File input, File output) {
		try (Scanner read = new Scanner(input);
			 PrintWriter zapis = new PrintWriter(output);) {
			
			int max = 0;
			int min = 255;
			while(read.hasNext()) {
				String[] linia = read.nextLine().split(" ");
				
				for(int i=0; i<linia.length; i++) {
					int val = Integer.valueOf(linia[i]);
					
					if(val > max) max = val;
					if(val < min) min = val;
				}
				
			}
			System.out.println("6.1\tmin:" + min);
			System.out.println("\tmax:" + max + "\n");
			
			zapis.println("6.1\tmin:" + min);
			zapis.println("\tmax:" + max + "\n");
			
		} catch (FileNotFoundException e) {
			System.out.println("Blad pliku");
		}
	}

	public static void Zad6_2(File input, File output) {
		try (Scanner read = new Scanner(input);
			 PrintWriter zapis = new PrintWriter(output);) {
			
			int licznik = 0;
			while(read.hasNext()) {
				String[] linia = read.nextLine().split(" ");
				
				for(int i=0; i<linia.length/2; i++) {
					int lewa = Integer.valueOf(linia[i]);
					int prawa = Integer.valueOf(linia[linia.length-1-i]);
					
					if(lewa != prawa) {
						licznik++;
						break;
					}
				}
				
			}
			
			System.out.println("6.2\t" + licznik + "\n");
			zapis.println("6.2\t" + licznik + "\n");
	
		} catch (FileNotFoundException e) {
			System.out.println("Blad pliku");
		}
	}

	public static void Zad6_3(File input, File output) {
		try (Scanner read = new Scanner(input);
			 PrintWriter zapis = new PrintWriter(output);) {
			
			int[][] tablica = new int[200][320];
			
			int wiersz = 0;
			while(read.hasNext()) {
				String[] linia = read.nextLine().split(" ");
				
				for(int i=0; i<linia.length; i++) {
					tablica[wiersz][i] = Integer.valueOf(linia[i]);
				}
				wiersz++;
			}
			
			int licznik = 0;
			for(int i=0; i<200; i++) {
				
		kolumna: for(int j=0; j<320; j++) {
					int pixel = tablica[i][j];
					
					if(j+1 < 320) {
						int prawo = tablica[i][j+1];
						if(Math.abs(prawo - pixel) > 128) {
							licznik++;
							continue kolumna;
						}
					}
					
					if(j-1 > 0) {
						int lewo = tablica[i][j-1];
						if(Math.abs(lewo - pixel) > 128) {
							licznik++;
						}
					}
					
					if(i+1 < 200) {
						int dol = tablica[i+1][j];
						if(Math.abs(dol - pixel) > 128) {
							licznik++;
						}
					}
					
					if(i-1 > 0) {
						int gora = tablica[i-1][j];
						if(Math.abs(gora - pixel) > 128) {
							licznik++;
						}
					}					
				} 
			}
						
			System.out.println("6.3\t" + licznik + "\n");
			zapis.println("6.3\t" + licznik + "\n");
			
		} catch (FileNotFoundException e) {
			System.out.println("Blad pliku");
		}
	}
	
	public static void Zad6_4(File input, File output) {
		try (Scanner read = new Scanner(input);
			 PrintWriter zapis = new PrintWriter(output);) {
			
			int max = 0;
			
			int[][] tablica = new int[200][320];
			
			int wiersz = 0;
			while(read.hasNext()) {
				String[] linia = read.nextLine().split(" ");
				
				for(int i=0; i<linia.length; i++) {
					tablica[wiersz][i] = Integer.valueOf(linia[i]);
				}
				wiersz++;
			}

			for(int i=0; i<320; i++) {
				int licznik = 1;
				for(int j=0; j<199; j++) {
					
					if(tablica[j][i] == tablica[j+1][i]) {
						licznik++;
					} else {
						if(licznik > max) {
							max = licznik;
						}
						licznik = 1;
					}
				} 
			}
			
			System.out.println("6.4\t" + max);
			zapis.println("6.4\t" + max);
			
		} catch (FileNotFoundException e) {
			System.out.println("Blad pliku");
		}
	}
	
	public static void main(String[] args) {
		//File przyklad = new File("przyklad-2017.txt");
		File input = new File("dane-2017.txt");
		File output = new File("D:\\Desktop\\wyniki6.txt");
		
		//Zad6_1(przyklad);
		Zad6_1(input, output);
		
		//Zad6_2(przyklad);
		Zad6_2(input, output);
		
		//Zad6_3(przyklad);
		Zad6_3(input, output);
		
		//Zad6_4(przyklad);
		Zad6_4(input, output);	
	}

}
