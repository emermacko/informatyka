import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	
	public static void Zad4_1(String source, String output, File plik) {
		 try (Scanner read = new Scanner(plik);
	          PrintWriter zapis1 = new PrintWriter(output);) {
	        	
	        	int licznik=0;
	        	
	        	while(read.hasNext()){
	        		int licznik0=0; int licznik1=0;
	        		String s = read.nextLine();
	        		
	        		for(int i=0; i<s.length(); i++) {
	        			if(s.charAt(i) == '0') {
	        				licznik0++;
	        			} else {
	        				licznik1++;
	        			}
	        		}
	        		if(licznik0 > licznik1) licznik++;
	        	}
	        	
	        	System.out.println("4.1 -> " + licznik);
	        	
	        } catch (FileNotFoundException e) {
	        	System.out.println("Blad pliku");
	        	e.printStackTrace();
	        }
	}
	
	
	public static void Zad4_2(String source, String output, File plik) {
		try (Scanner read = new Scanner(plik);
		     PrintWriter zapis1 = new PrintWriter(output);) {
			
			int licznik=0;
			while(read.hasNext()){
				String s = read.nextLine();
				char firstChar = s.charAt(0);
				boolean check = true;
	
				if(s.contains("0") && s.contains("1") && firstChar == '0') {
					for(int i=1; i<s.length(); i++) {
						if(s.charAt(i) != firstChar) {
							for(int j=i; j<s.length(); j++) {
								if(s.charAt(j) == firstChar) check = false;
							}
						}
					}
				} else {
					check=false;
				}
				if(check) licznik++;
			}
			
			System.out.println("4.2 -> " + licznik);
			
		} catch (FileNotFoundException e) {
        	System.out.println("Blad pliku");
        	e.printStackTrace();
		}
	}
	
	public static void Zad4_3(String source, String output, File plik) {
		try(Scanner read = new Scanner(plik);
		    PrintWriter zapis1 = new PrintWriter(output);) {
			
			int max=0;
			String liczby = "";
			
			while(read.hasNext()){
				String s = read.nextLine();
				int licznik=0;
				int localmax=0;
				
				if(s.contains("0")) {
										
					for(int i=0; i<s.length(); i++) {
						if(s.charAt(i) == '0') {
							licznik++;
						} else {
							if(licznik > localmax) localmax = licznik;
							licznik=0;
						}
					}
					
					if(localmax == max || licznik >= max) {
						liczby += s + "\n";
					}
					if(localmax > max) {
						max = localmax;
						liczby = s + "\n";
					}
				}

			
			}
			
			System.out.println("4.3 -> " + max + "\n");	
			System.out.println(liczby);
			
		} catch (FileNotFoundException e) {
        	System.out.println("Blad pliku");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String source = "slowa.txt";
	     String output = "wynik4.txt";
	     File plik = new File(source);

	     Zad4_1(source, output, plik);
	     Zad4_2(source, output, plik);
	     Zad4_3(source, output, plik);
	}

}
