package matura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class M2011 {

	public static void Zad6(File input) {
		try (Scanner read = new Scanner(input);){
			
			int licznikParzystych = 0;
			long maxI = 0; String maxS = "";
			int licznik9 = 0; int suma9 = 0;
			
			while(read.hasNext()) {
				String s = read.nextLine();
				long l = Integer.parseInt(s, 2);
				
	/* a) */	if(l%2 == 0) licznikParzystych++;

	/* b) */	if(l>maxI) {
					maxI=l; maxS=s;
				}

	/* c) */	if(s.length()==9) {
					licznik9++;
					suma9 += l;
				}
				
			}
			
			System.out.println("a)\t" + licznikParzystych);
			System.out.println("\nb)\t" + maxI + "\n\t" + maxS);
			System.out.println("\nc)\t" + licznik9 + "\n\t" + Integer.toBinaryString(suma9));
			
		} catch (FileNotFoundException e) {
			System.out.println("Blad pliku");
		}
	}
	
	public static void main(String[] args) {
		File input = new File("liczby.txt");
		Zad6(input);
	}

}
