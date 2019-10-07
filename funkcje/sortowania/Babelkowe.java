public static void babelkowe(int tab[]) {
	int pomoc;
	for(int j=tab.length-1; j>0; j--) {
		for(int i=0; i<j; i++) {
			if(tab[i] > tab[i+1]) {
				pomoc = tab[i];
				tab[i] = tab[i+1];
				tab[i+1] = pomoc;
			}
		}
	}
}
