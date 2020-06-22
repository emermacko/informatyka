package matura;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class M2015_CZ {
	
	static String START = "11011010";
	static String STOP = "11010110";
	
	static String[] kody = {
			"10101110111010",
			"11101010101110",
			"10111010101110",
			"11101110101010",
			"10101110101110",
			"11101011101010",
			"10111011101010",
			"10101011101110",
			"11101010111010",
			"10111010111010"
	};
	
	static void zad6_1(File input) {
		try (Scanner read = new Scanner(input); PrintWriter zapis = new PrintWriter("kody1.txt")){
			
			while(read.hasNext()) {
				String s = read.nextLine();
				zapis.println(sumy(s)[0] + " " + sumy(s)[1]);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Blad pliku");
		}
	}
	
	static void zad6_2(File input) {
		try (Scanner read = new Scanner(input); PrintWriter zapis = new PrintWriter("kody2.txt")){
			
			while(read.hasNext()) {
				String s = read.nextLine();

				zapis.print(suma_kontrolna(sumy(s)) + " ");
				zapis.println(kod(String.valueOf(suma_kontrolna(sumy(s)))));
			}
		} catch (FileNotFoundException e) {
			System.out.println("Blad pliku");
		}
	}

	static void zad6_3(File input) {
		try (Scanner read = new Scanner(input); PrintWriter zapis = new PrintWriter("kody3.txt")){
			
			while(read.hasNext()) {
				String s = read.nextLine();

				String cyfra_kontrolna = kod(String.valueOf(suma_kontrolna(sumy(s))));
				zapis.println(START+kod(s)+cyfra_kontrolna+STOP);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Blad pliku");
		}
	}
	
	static String kod(String liczba) {
		
		String zakodowana = "";
		for(int i=0; i<liczba.length(); i++) {
			int cyfra = Character.getNumericValue(liczba.charAt(i));
			zakodowana += kody[cyfra];
		}
		
		return zakodowana;
	}
	
	static int[] sumy(String liczba) {
		int suma_parz = 0, suma_nparz = 0;
		
		for(int i=liczba.length()-1; i>=0; i-=2) {
			suma_parz += liczba.charAt(i)-'0';
		}
		for(int i=liczba.length()-2; i>=0; i-=2) {
			suma_nparz += liczba.charAt(i)-'0';
		}
		
		int[] sumy = {suma_parz, suma_nparz};
		return sumy;
	}

	static int suma_kontrolna(int[] sumy) {
				
		int suma = sumy[0] + sumy[1];
		int mod = suma%10;
		int kontrolna = (10-mod)%10;
		
		return kontrolna;
	}
	
	public static void main(String[] args) {
		File input = new File("kody.txt");
		
		zad6_1(input);
		zad6_2(input);
		zad6_3(input);
	}

}
