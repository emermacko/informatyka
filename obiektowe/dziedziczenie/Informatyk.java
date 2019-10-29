
public class Informatyk extends Pracownik {
	
	private String jezykProgramowania;
	
	public Informatyk(String imie, double wyplata, String jezykProgramowania) {
		super(imie, wyplata);
		this.jezykProgramowania = jezykProgramowania;
	}

	public void wyswietlJezykprogramowania() {
		System.out.println("Imie: " + imie + "\nJezyk Programowania: " + this.jezykProgramowania);
	}
	
	@Override
	public void przedstawSie() {
		System.out.println("Jestem roszczeniowym programista gdzie sa moje owocowe wtorki");
	}
}
