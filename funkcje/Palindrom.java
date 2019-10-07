/* Na stringu */
public static boolean palindrom(String wiersz) {
	boolean palindrom = true;

	for(int i=0; i<(wiersz.length()/2); i++) {
		if(wiersz.charAt(i) != wiersz.charAt(wiersz.length()-1-i)) {
			palindrom = false;
		}
	}
	return palindrom;
}

/* Na tablicy */
public static boolean palindrom2(char[] w) {
	boolean palindrom = true;
	for(int i=0; i<(w.length/2); i++) {
		if(w[i] != w[w.length-1-i]) {
			palindrom = false;
		}
	}
	return palindrom;
}
