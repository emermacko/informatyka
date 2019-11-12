public abstract class Rownania {
	
	static int nextID = 1;
	protected int ID;
	
	Rownania() {
		ID=nextID++;
	}
	
	public int getID() {
		return this.ID;
	}
	
	public abstract String rozwiaz();
	
	public String toString() {
		return "ID: " + this.getID();
	}
	
}
