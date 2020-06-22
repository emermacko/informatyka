import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class M2015R {

	public static void Zad4_1(File input) {
		try (Scanner read = new Scanner(input);){
			
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
		try (Scanner read = new Scanner(input);){
			
			int licznik = 0;
			
			while(read.hasNext()) {
				String s = read.nextLine();
				boolean zmiana = false;
				
				for(int i=1; i<s.length(); i++) {
					if(s.charAt(0) == '0') {
						if(s.charAt(i) == '0') {
							if(zmiana) break;
						} else {
							if(i == s.length()-1) licznik++;
							zmiana = true;
						}
					}
				}
				
			}
			
			System.out.println("2. " + licznik + "\n");
			
		} catch (FileNotFoundException e) {System.out.println("Blad pliku");}
	}
	

	public static void Zad4_3(File input) {
		try {
			Scanner read = new Scanner(input);
			int max = 0;
			
			System.out.print("");
			while(read.hasNext()) {
				String s = read.nextLine();
				int licznik=0;
				
				for(int i=0; i<s.length(); i++) {
					if(s.charAt(i) == '0') licznik++;
					else {
						if(licznik > max) max = licznik;
						licznik=0;
					}
				}
			}
			
			System.out.println("3. max zer: " + max);

			read = new Scanner(input);
			while(read.hasNext()) {
				String s = read.nextLine();
				int licznik = 0;
				
				for(int i=0; i<s.length(); i++) {
					if(s.charAt(i) == '0') {
						licznik++;
						if(licznik == max) System.out.println(s);
					} else {
						licznik=0;
					}
				}
			}
			
		} catch (FileNotFoundException e) {System.out.println("Blad pliku");}
	}
	
	public static void main(String[] args) {

		File input = new File("slowa.txt");
		
		Zad4_1(input);
		Zad4_2(input);
		Zad4_3(input);
	}

}
