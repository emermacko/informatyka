import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Zad4 {
	
	public static void Zad4a(File jawne, File klucze1) {
		try(PrintWriter zapis = new PrintWriter("wynik4a.txt");
			Scanner slowa = new Scanner(jawne);
			Scanner klucze = new Scanner(klucze1);){
			
			while(slowa.hasNext()) {
				String noweslowo = "";
				String slowo = slowa.nextLine();
				String klucz = klucze.nextLine();
				
				for (int i=0, j=0; i<slowo.length(); i++, j++) {
				
					if(j>=klucz.length()) j=0;
					
					int wart_ch_slowa = Integer.valueOf(slowo.charAt(i))-64;
					int wart_ch_klucza = Integer.valueOf(klucz.charAt(j));
					int suma = wart_ch_klucza + wart_ch_slowa;
					
					if(suma > 90) suma -= 26;
					noweslowo += (char)suma;
				}
				zapis.println(slowo + "--> " + noweslowo);
			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Blad pliku");
		}
		
	}
	
	public static void Zad4b(File zasz, File klucze2) {
		try(PrintWriter zapis = new PrintWriter("wynik4b.txt");
			Scanner slowa = new Scanner(zasz);
			Scanner klucze = new Scanner(klucze2);){
			
			while(slowa.hasNext()) {
				String noweslowo = "";
				String slowo = slowa.nextLine();
				String klucz = klucze.nextLine();
				
				for (int i=0, j=0; i<slowo.length(); i++, j++) {
				
					if(j>=klucz.length()) j=0;
					
					int wart_ch_slowa = Integer.valueOf(slowo.charAt(i));
					int wart_ch_klucza = Integer.valueOf(klucz.charAt(j)-64);
					int suma = wart_ch_slowa - wart_ch_klucza;
					
					if(suma < 65) suma += 26;
					noweslowo += (char)suma;
				}
				zapis.println(slowo + "--> " + noweslowo);
			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Blad pliku");
		}
	}

	public static void main(String[] args) {
		File jawne = new File("tj.txt");
		File klucze1 = new File("klucze1.txt");
		
		File zasz = new File("sz.txt");
		File klucze2 = new File("klucze2.txt");
		
		/*
		int liczba = 65;
		System.out.println("A = " + Integer.valueOf('A'));
		System.out.println(liczba + " = " + (char) liczba);
		*/
		
		Zad4a(jawne, klucze1);
		Zad4b(zasz, klucze2);
		
	}

}
