import java.util.Scanner;

public class Fibonaczi {
  
	//n-ty wyraz ciągu Fibonacciego
	public static int obliczCiag(int n) {
		if(n==1 || n==2) {
			return 1;
		} else {
			return obliczCiag(n-1)+obliczCiag(n-2);
		}
	}

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int n;
		do {
			System.out.print("Podaj n [ > ] ");
			n = read.nextInt();
		} while(n<=0);
		read.close();
		System.out.println(obliczCiag(n));
	}
}
