public class Zad5 {
	public static double Zad5_3Rek(int r, double przyrost) {
		return r*przyrost;
	}
	
	public static void Zad5_3(File excel) {
		File export = new File("ExportZJavy.txt");
		try (Scanner read = new Scanner(excel); PrintWriter zapis = new PrintWriter(export);){
			
			int licznikPrzeludnienia = 0;
			int lacznaLiczbaMieszkancow = 0;
			String[] woj = new String[50];
			
			while(read.hasNext()) {
				String[] split = read.nextLine().split("\\t");
				String w = split[0]; int suma13 = Integer.valueOf(split[1]); int suma14 = Integer.valueOf(split[2]); double przyrost = Double.valueOf(split[3]);
				int liczbaMieszkancow = suma14;
				
				for(int i=14; i<=25; i++) {
					if(liczbaMieszkancow > 2*suma13) {
						licznikPrzeludnienia++;
						break;
					} else {
						liczbaMieszkancow = (int) Zad5_3Rek(liczbaMieszkancow, przyrost);
					}
				}
				zapis.println(w + ";" + liczbaMieszkancow);
				lacznaLiczbaMieszkancow += liczbaMieszkancow;
			}
			
			System.out.println("Łączna liczba mieszkancow w 2025: " + lacznaLiczbaMieszkancow);
			System.out.println("Liczba województw z przeludnieniem: " + licznikPrzeludnienia);
			
		} catch (FileNotFoundException e) {
			System.out.println("Blad pliku");
		}
	}
	public static void main(String[] args) {
		File excel = new File("Zad5.3-ExportDoJavy.txt");
		Zad5_3(excel);
	}
}