public static void przezWybor(int tab[]) {
	int pomoc;
	int min;
	for(int k=0; k<tab.length-1; k++) {
		min = k;
		for(int i=k+1; i<tab.length; i++) {
			if(tab[i] < tab[min]) {
				min = i;
			}
		}
		pomoc = tab[k];
		tab[k] = tab[min];
		tab[min] = pomoc;
	}
}
