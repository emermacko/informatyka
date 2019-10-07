// Sprawdzenie czy pierwiastek będzie liczba calkowitą
static boolean RownyKwadrat(double x) { 
	double Pierwiastek = Math.sqrt(x);
	return ((Pierwiastek - Math.floor(Pierwiastek)) == 0 );
}
