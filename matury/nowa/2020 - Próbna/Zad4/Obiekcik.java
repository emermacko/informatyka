package matura;

public class Obiekcik {
	
	public int luka;
	public int krotnosc = 1;
	
	Obiekcik(int luka){
		this.luka = luka;
	}
	
	public int getLuka() {
		return this.luka;
	}
	
	public int getKrotnosc() {
		return this.krotnosc;
	}
	
	public void zwiekszKrotnosc() {
		krotnosc++;
	}
	
}
