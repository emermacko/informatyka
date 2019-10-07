import java.util.Random;

public class Sortowanie2D {
	
	public static void wprowadzanie(int tab[][], int w, int k) {
		Random los = new Random();
		for(int i=0; i<w; i++) {
			for(int j=0; j<k; j++) {
				tab[i][j] = los.nextInt(2);
			}
		}
	}
	
	public static void wypisanie(int tab[][], int w, int k) {
		for(int i=0; i<w; i++) {
			for(int j=0; j<k; j++) {
				System.out.print(tab[i][j]);
			}
			System.out.println();
		}
	}
	
	
	public static int ileCyfrNaWiersz(int tab[][], int w, int k, int wiersz, int cyfra) {
		int suma=0;
		for(int i=0; i<k; i++) {
			if(tab[wiersz][i] == cyfra) suma++;
		}	
		return suma;
	}
	
	public static void sortowanie(int tab[][], int w, int k) {
		
//		int[] zera = new int[3];
//		zera[0] = ileCyfrNaWiersz(tab, w, k, 0, 0);
//		zera[1] = ileCyfrNaWiersz(tab, w, k, 1, 0);
//		zera[2] = ileCyfrNaWiersz(tab, w, k, 2, 0);
		
		int[] jedynki = new int[3];		
		jedynki[0] = ileCyfrNaWiersz(tab, w, k, 0, 1);
		jedynki[1] = ileCyfrNaWiersz(tab, w, k, 1, 1);
		jedynki[2] = ileCyfrNaWiersz(tab, w, k, 2, 1);
		
//		System.out.println("Jedynek w 1 wierszu: " + ileCyfrNaWiersz(tab, w, k, 0, 1));
//		System.out.println("Jedynek w 2 wierszu: " + ileCyfrNaWiersz(tab, w, k, 1, 1));
//		System.out.println("Jedynek w 3 wierszu: " + ileCyfrNaWiersz(tab, w, k, 2, 1));
//		System.out.println();

		for(int i=0; i<w; i++) {
			for(int j=0; j<jedynki[i]; j++) {
				tab[i][j] = 1;
			}
			for(int l=jedynki[i]; l<k; l++) {
				tab[i][l] = 0;
			}
		}
	}

	public static void main(String[] args) {
		int w = 3;
		int k = 10;
		
		int[][] tab = new int [w][k];
		
		wprowadzanie(tab, w, k);
		System.out.println();
		wypisanie(tab, w, k);
		System.out.println();System.out.println();
		sortowanie(tab, w, k);
		wypisanie(tab, w, k);
		
	}

}
