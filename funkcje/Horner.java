public static double horner(int stopienWielomianu, double[] wspolczynniki, double argument) {
	double wynik = wspolczynniki[stopienWielomianu];

	for(int i=stopienWielomianu-1; i>=0; i--) {
		wynik = wynik*argument + wspolczynniki[i];
	}
	return wynik;
}
