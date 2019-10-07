import java.util.Scanner;

public class SitoEratostenesa {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int liczba;
		
		do {
			System.out.print("Podaj do ktorej liczby chcesz sprawdzic [ > ] ");
			liczba = read.nextInt();
		} while(liczba<=0);
		
		read.close();
		
		int[] tab = new int[liczba+1];
		
		tab[0] = 0;		// 0 nie jest pierwsza
		tab[1] = 0;		// 1 nie jest pierwsza
		
		for(int i=0; i<tab.length; i++) {
			tab[i] = 1;
		}
		
		System.out.println();
		System.out.print("Liczby pierwsze: ");
		for(int i=2; i<tab.length; i++) {
			if(tab[i] == 1) {
				for(int j=i; j<tab.length; j++) {
					if(j%i == 0) {
						tab[j] = 0;
					}
				}
				System.out.print(i + ", ");
			}
		}
	}
}
