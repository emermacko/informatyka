package matura;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class M2017_CZ {
	
	static void zad1(File input1, File input2) {
		try (Scanner read1 = new Scanner(input1);
			 Scanner read2 = new Scanner(input2);
			 PrintWriter zapis = new PrintWriter("wynik4_1.txt")){
			 
			 int licznik = 0;
			 while(read1.hasNext()) {
				 String s1 = read1.nextLine().split(" ")[9];
				 String s2 = read2.nextLine().split(" ")[9];
				 
				 if(s1.equals(s2)) licznik++;
			 }
			 
			 System.out.println("4.1 " + licznik); 
			 zapis.println("4.1 " + licznik);
			
		} catch (FileNotFoundException e) {
			System.out.println("Blad pliku");
		}
	}
	
	static void zad2(File input1, File input2) {
		try (Scanner read1 = new Scanner(input1);
			 Scanner read2 = new Scanner(input2);
			 PrintWriter zapis = new PrintWriter("wynik4_2.txt")){
				 
				 int licznik = 0;
				 while(read1.hasNext()) {
					 int licznikP = 0, licznikNP = 0;
					 
					 String[] s1 = read1.nextLine().split(" ");
					 String[] s2 = read2.nextLine().split(" ");
					 
					 for(int i=0; i<10; i++) {
						 int val = Integer.valueOf(s1[i]);
						 if(val % 2 == 0) {
							 licznikP++;
						 } else {
							 licznikNP++;
						 }
					 }
					 
					 if(licznikP == 5 && licznikNP == 5) {
						 licznikP = 0; licznikNP = 0;
						 
						 for(int i=0; i<10; i++) {
							 int val = Integer.valueOf(s2[i]);
							 if(val % 2 == 0) {
								 licznikP++;
							 } else {
								 licznikNP++;
							 }
						 }
						 
						 if(licznikP == 5 && licznikNP == 5) {
							 licznik++;
						 }
					 }
				 }
				 
				 System.out.println("4.2 " + licznik); 
				 zapis.println("4.2 " + licznik);
				
			} catch (FileNotFoundException e) {
				System.out.println("Blad pliku");
			}
	}

	static void zad3(File input1, File input2) {
		try (Scanner read1 = new Scanner(input1);
			 Scanner read2 = new Scanner(input2);
			 PrintWriter zapis = new PrintWriter("wynik4_3.txt")){
			 
			 System.out.println("4.3 ");
			 zapis.println("4.3 ");
			 System.out.print("a) Wiersze: ");
			 zapis.println("a) Wiersze: ");
			 
			 int licznik = 0; int wiersz = 1;
			 while(read1.hasNext()) {
				 
				 List<Integer> trim1 = new ArrayList<>();
				 List<Integer> trim2 = new ArrayList<>();
				 
				 String[] s1 = read1.nextLine().split(" ");
				 String[] s2 = read2.nextLine().split(" ");
				 
				 for(String s : s1) {
					 int i = Integer.valueOf(s);
					 if(!trim1.contains(i)) {
						 trim1.add(i);
					 }
				 }
				 for(String s : s2) {
					 int i = Integer.valueOf(s);
					 if(!trim2.contains(i)) {
						 trim2.add(i);
					 }
				 }
				 
				 //System.out.println("#1" + trim1);
				 //System.out.println("#2" + trim2);
				 
				 if(trim1.equals(trim2)) {
					 licznik++;
					 System.out.print(wiersz + ", ");
					 zapis.println(wiersz + ", ");
				 }
				 wiersz++;
				 
			 } System.out.println();
			 
			 System.out.println("b) Ilosc: " + licznik);
			 zapis.println("b) Ilosc: " + licznik);
			 
			
		} catch (FileNotFoundException e) {
			System.out.println("Blad pliku");
		}
	}
	
	static void zad4(File input1, File input2) {
		try (Scanner read1 = new Scanner(input1);
			 Scanner read2 = new Scanner(input2);
			 PrintWriter zapis = new PrintWriter("wynik4_4.txt")){
			 
			 while(read1.hasNext()) {
				 String[] s1 = read1.nextLine().split(" ");
				 int[] i1 = new int[10]; 
					 for(int i=0; i<10; i++) i1[i] = Integer.valueOf(s1[i]);
				 		
				 String[] s2 = read2.nextLine().split(" ");
				 int[] i2 = new int[10]; 
					 for(int i=0; i<10; i++) i2[i] = Integer.valueOf(s2[i]);
				 
				 List<Integer> wynikowy = new ArrayList<>();
				 
				 int i=0; int j=0;
				 while(true) {
					 //System.out.println(i1[i] + " ## " + i2[j]);
					 if(i1[i] < i2[j]) {
						 wynikowy.add(i1[i]);
						 if(i<9) i++;
						 else {
							 for(int k=j; k<10; k++) {
								 wynikowy.add(i2[k]);
							 }
							 break;
						 }
					 } else {
						 wynikowy.add(i2[j]);
						 if(j<9) j++; 
						 else {
							 for(int k=i; k<10; k++) {
								 wynikowy.add(i1[k]);
							 }
							 break;
						 }
					 }
				 }
				 //System.out.println(wynikowy);
				 zapis.println(wynikowy);
			 }
			
		} catch (FileNotFoundException e) {
			System.out.println("Blad pliku");
		}
	}
	
	
	public static void main(String[] args) {
		File dane1 = new File("dane1.txt");
		File dane2 = new File("dane2.txt");
		
		File przyklad1 = new File("przyklad1.txt");
		File przyklad2 = new File("przyklad2.txt");
		
		// zad1(przyklad1, przyklad2);
		zad1(dane1, dane2);
		System.out.println();
		
		// zad2(przyklad1, przyklad2);
		zad2(dane1, dane2);
		System.out.println();

		// zad3(przyklad1, przyklad2);
		zad3(dane1, dane2);
		System.out.println();

		//zad4(przyklad1, przyklad2);
		zad4(dane1, dane2);
	}

}
