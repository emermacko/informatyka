package matura;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class M2016 {
	
	public static void Zad4_1(File punkty) {
		
		try (Scanner read = new Scanner(punkty);) {
			int licznikWewn = 0;
			
			System.out.print("1. Na brzegu:\t ");
			while(read.hasNext()) {
				String s = read.nextLine();
				int x = Integer.valueOf(s.split(" ")[0]);
				int y = Integer.valueOf(s.split(" ")[1]);
				
				if( Math.pow(x-200,2) + (Math.pow(y - 200,2)) == 40_000 ) {
					System.out.print("(" + x + " " + y + "), ");
				}
				if( Math.pow(x-200,2) + (Math.pow(y - 200,2)) < 40_000 ) licznikWewn++;
			}
			
			 System.out.println("\n   Wewnątrz:\t " + licznikWewn);
			
		} catch (FileNotFoundException e) {
			System.out.println("Blad pliku");
		}
	}
	
	public static void Zad4_2(File punkty) {
		
//		 nk		 40_000pi		 nk		 pi				  4nk
//		----- = ----------	=>	----- = -----	=>	pi = -----
//		  n		 160_000		  n		  4				   n
		
		try { Scanner read = new Scanner(punkty);
			
			int nk = 0;
			for(int i=0; i<1000; i++) {
				String s = read.nextLine();
				int x = Integer.valueOf(s.split(" ")[0]);
				int y = Integer.valueOf(s.split(" ")[1]);
				if( Math.pow(x-200,2) + (Math.pow(y - 200,2)) <= 40_000 ) nk++;
			}
			
			System.out.println("\n2. a) " + (double)4*nk/1000);
			
			read = new Scanner(punkty);
			nk = 0;
			for(int i=0; i<5_000; i++) {
				String s = read.nextLine();
				int x = Integer.valueOf(s.split(" ")[0]);
				int y = Integer.valueOf(s.split(" ")[1]);
				if( Math.pow(x-200,2) + (Math.pow(y - 200,2)) <= 40_000 ) nk++;
			}
			
			System.out.println("   b) " + (double)4*nk/5_000);
			
			read = new Scanner(punkty);
			nk = 0;
			for(int i=0; i<10_000; i++) {
				String s = read.nextLine();
				int x = Integer.valueOf(s.split(" ")[0]);
				int y = Integer.valueOf(s.split(" ")[1]);
				if( Math.pow(x-200,2) + (Math.pow(y - 200,2)) <= 40_000 ) nk++;
			}
			
			System.out.println("   c) " + (double)4*nk/10_000);
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Blad pliku");
		}
	}
	
	public static void Zad4_3(File punkty) {
				
		try (Scanner read = new Scanner(punkty); PrintWriter export = new PrintWriter("exportDoExcela.txt")){

			int nk = 0;	
			for(int i=1; i<=10_000; i++) {
				String s = read.nextLine();
				int x = Integer.valueOf(s.split(" ")[0]);
				int y = Integer.valueOf(s.split(" ")[1]);
				if( Math.pow(x-200,2) + (Math.pow(y - 200,2	)) <= 40_000 ) nk++;
				export.println((double)4*nk/i);
			}
		} catch (FileNotFoundException e) {}

	}

	public static void main(String[] args) {
		File punkty = new File("punkty.txt");
		Zad4_1(punkty);
		Zad4_2(punkty);
		Zad4_3(punkty);
	}


}
