package obiektowe;

import java.util.Scanner;

public class KwadratMain {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		double bok;
		
		do {
			System.out.print("Podaj bok kwadartu [ > ] ");
			bok = read.nextDouble();
		} while(bok <= 0); read.close();
		
		Kwadrat kw1 = new Kwadrat(bok);
		System.out.print("\nObwod kwadratu o boku [" + kw1.getBok() + "] = ");
		System.out.println(kw1.obliczObwod());
		System.out.print("Pole kwadratu o boku [" + kw1.getBok() + "] = ");
		System.out.println(kw1.obliczPole());

	}

}
