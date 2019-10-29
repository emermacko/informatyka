
public class Main {

	public static void main(String[] args) {
		Pracownik dyzurny = new Pracownik("Kacper Jankowski", 100);
		Informatyk informatyk = new Informatyk("Janusz Ignaszak", 30000, "HTML");
		Ksiegowy ksiegowy = new Ksiegowy("PAwel Kalka", 69, 13);
		
		Pracownik[] pracownicy = new Pracownik[3];
		
		pracownicy[0] = dyzurny;
		pracownicy[1] = informatyk;
        pracownicy[2] = ksiegowy;
        
        for(Pracownik p : pracownicy) {
        	System.out.println(p.pobieraWyplate());
        }
	}
}
