package Pliki;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class M-2013 {
	
	public static void zad4a(File plik) {
        int licznik = 0; 
        
        try (Scanner read = new Scanner(plik);) {
               while(read.hasNext()){
                   String s = read.nextLine();
                   if(s.length()%2 == 0) licznik++;
               }
           } catch (FileNotFoundException e) {
               System.out.println("Blad pliku");
               e.printStackTrace();
           }
        
        System.out.println("Zad4a: " + licznik + "\n");
	}
	
	public static void zad4b(File plik) {
        int licznik = 0; 
        
        try (Scanner read = new Scanner(plik);) {
               while(read.hasNext()){
            	   int jeden = 0;
            	   int zero = 0;
            	   
                   String s = read.nextLine();
                   for(int i=0; i<s.length(); i++) {
                	   if(s.charAt(i) == '1') {
                		   jeden++;
                	   } else {
                		   zero++;
                	   }        	   
                   }
                   
                   if(jeden == zero) licznik++;
               }
           } catch (FileNotFoundException e) {
               System.out.println("Blad pliku");
               e.printStackTrace();
           }
        
        System.out.println("Zad4b: " + licznik + "\n");
	}
	
	public static void zad4c(File plik) {
        int licznik0 = 0; int licznik1 = 0;
        
        try (Scanner read = new Scanner(plik);) {
               while(read.hasNext()){
            	   int jeden = 0;
            	   int zero = 0;
            	   
                   String s = read.nextLine();
                   for(int i=0; i<s.length(); i++) {
                	   if(s.charAt(i) == '1') {
                		   jeden++;
                	   } else {
                		   zero++;
                	   }        	   
                   }
                   
                   if(zero == 0) licznik1++;
                   if(jeden == 0) licznik0++;
               }
           } catch (FileNotFoundException e) {
               System.out.println("Blad pliku");
               e.printStackTrace();
           }
        
        System.out.println("Zad4b:\n0: " + licznik0 + "\n1: " + licznik1 + "\n");
	}
	
	public static void zad4d(File plik) {
		
		try (Scanner read = new Scanner(plik);) {
    		int k = 2;
    		System.out.println("Zad4c:");
    		while(k<=16) {
        		int licznik = 0;
                while(read.hasNext()){
                    String s = read.nextLine();
                    System.out.println(s.length() + " = " + k);
                    if(s.length() == k) licznik++;
                    System.out.println("licznik: ");
                }
                System.out.println("Długosc " + k + ": " + licznik);
                k++;
    		}
        } catch (FileNotFoundException e) {
            System.out.println("Blad pliku");
            e.printStackTrace();
        }
	}

	public static void main(String[] args) {
		String source = "napisy.txt";
        String output = "WynikNapis.txt";
        File plik = new File(source);
        
        zad4a(plik);
        zad4b(plik);
        zad4c(plik);
        zad4d(plik);

	}

}
