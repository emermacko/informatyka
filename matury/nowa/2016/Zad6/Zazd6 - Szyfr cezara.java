import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class M2016 {
	
	public static void Zad6_1(File input) {
		try (Scanner read = new Scanner(input); PrintWriter zapis = new PrintWriter("wyniki_6_1.txt")){

			while(read.hasNext()) {
				String s = read.nextLine();
				String szyfr = "";
				
				for(int i=0; i<s.length(); i++) {
					int char_val = Integer.valueOf(s.charAt(i))+107;
					while(char_val>90) char_val-=26;
					szyfr += (char)(char_val);
				}
				
				zapis.println(szyfr);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Blad pliku");
		}
	}
	
	public static void Zad6_2(File input) {
		try (Scanner read = new Scanner(input); PrintWriter zapis = new PrintWriter("wyniki_6_2.txt")){

			while(read.hasNext()) {
				String s = read.nextLine();
				
				if(s.split(" ").length != 2) {
					zapis.println("BRAK KLUCZA");
				} else {
					String szyfr = s.split(" ")[0];
					int klucz = Integer.valueOf(s.split(" ")[1]);
					
					String wynik = "";
					for(int i=0; i<szyfr.length(); i++) {
						int char_val = Integer.valueOf(szyfr.charAt(i))-klucz%26;
						if(char_val<65) char_val += 26;
						wynik += (char)(char_val);
					}
					
					zapis.println(wynik);
				}
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Blad pliku");
		}
	}
	
	public static void Zad6_3(File input) {
		try (Scanner read = new Scanner(input); PrintWriter zapis = new PrintWriter("wyniki_6_3.txt")){

			while(read.hasNext()) {
				String s = read.nextLine();
				String s1 = s.split(" ")[0];
				String s2 = s.split(" ")[1];
				
				int roznica = Math.abs(s1.charAt(0) - s2.charAt(0));
				
				for(int i=1; i<s.length()/2-1; i++) {
					int r = Math.abs(s1.charAt(i) - s2.charAt(i));
					if(r != roznica && r != 26-roznica) {
						zapis.println(s1);
						break;
					}
				}
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Blad pliku");
		}
	}

	public static void main(String[] args) {
		File input1 = new File("dane_6_1.txt");
		File input2 = new File("dane_6_2.txt");
		File input3 = new File("dane_6_3.txt");
		
		Zad6_1(input1);
		Zad6_2(input2);
		Zad6_3(input3);
	}

}
