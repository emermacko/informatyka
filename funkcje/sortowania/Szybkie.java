public static void szybkie(int[] tab, int poczatek, int koniec) {
	int i; int j; int pivot; int pomoc;
	i = poczatek;
	j = koniec;
	pivot = tab[(i+j)/2];

	do {
		while(tab[i] < pivot) i++;
		while(tab[j] > pivot) j--;
		if(i <=j ) {
			pomoc = tab[j];
			tab[j] = tab[i];
			tab[i] = pomoc;
			i++; j--;
		}
	} while (i <= j);
	if(i<koniec) sortowanie(tab, i, koniec);
	if(j>poczatek) sortowanie(tab, poczatek, j);
}
