public static int silnia(int n) {
 int wynik = 1;
  while(n>0) {
    wynik*=n;
    n-=1;
  }
  return wynik;
 }
