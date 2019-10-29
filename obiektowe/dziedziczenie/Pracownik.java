
public class Pracownik {
	protected String imie;
	private double wyplata;
	
	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public double getWyplata() {
		return wyplata;
	}

	public void setWyplata(double wyplata) {
		this.wyplata = wyplata;
	}

	public Pracownik(String imie, double wyplata) {
		this.imie = imie;
		this.wyplata = wyplata;
	}
	
	public void przedstawSie() {
		System.out.println("Czesc jestem podstawowym pracownikiem");
	}
	
	public double pobieraWyplate() {
		return wyplata;
	}
	
}
