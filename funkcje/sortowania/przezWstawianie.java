public static void wstawianie(int tab[]) {
  int x; int k = tab.length-2;

  while(k>=0) {
    x = tab[k];
    int i = k+1;

    while(i<tab.length && tab[i]<x) {
      tab[i-1] = tab[i];
      i++;
    }
    tab[i-1] = x;
    k--;
  }
}
