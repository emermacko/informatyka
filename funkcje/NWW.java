public static int NWD (int a, int b) {
	while(b!=0) {
		int Pomoc = a%b;
		a=b;
		b=Pomoc;
	}
	return a;
}
  
public static int NWW (int a, int b) {
	return (a*b)/NWD(a,b);
}
