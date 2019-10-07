public static void inverse(int[] tab) {
	int pomoc;		

	for(int i=0; i<tab.length/2; i++) {
		pomoc = tab[i];
		tab[i] = tab[tab.length-1-i];
		tab[tab.length-1-i] = pomoc;
	}
}
