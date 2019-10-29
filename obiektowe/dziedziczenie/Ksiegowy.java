
public class Ksiegowy extends Pracownik {
	private int stanowisko;
	
	public Ksiegowy(String imie, double wyplata, int stanowisko) {
		super(imie, wyplata);
		this.stanowisko = stanowisko;
	}

	public void wyswietlStanowisko() {
		System.out.println("Imie: " + imie + "\nJezyk Stanowisko: " + this.stanowisko);
	}
	
	@Override
	public void przedstawSie() {
		System.out.println("Jestem dumnym mezczyzna, spelniam sie jako ksiegowy");
	}
}
