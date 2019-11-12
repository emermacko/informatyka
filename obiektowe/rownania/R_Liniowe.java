
public class R_Liniowe extends Rownania{

	private double a;
	private double b;
	
	R_Liniowe(){
		this(1, 1);
	}
	
	R_Liniowe(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	public String rozwiaz() {
		if(a != 0) {
			return "x = " + (-b/a);
		} else {
			if(b == 0) {
				return "Rownanie ma nieskonczenie wiele rozwiazan";
			} else {
				return "Rownanie nie ma rozwiazan";
			}
		}
	}
	
	public double getA() {
		return this.a;
	}
	
	public double getB() {
		return this.b;
	}
	
	public String toString() {
		return a + "x + " + b + " = 0";
	}
	
}
