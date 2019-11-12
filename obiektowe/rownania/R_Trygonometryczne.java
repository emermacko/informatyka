public class R_Trygonometryczne extends Rownania {

	private double a;

	R_Trygonometryczne() {
		this(1);	
	}
	
	R_Trygonometryczne(double a) {
	super();
		this.a=a;
	}
	
	public double getA() {
		return a;
	}
	
	public String rozwiaz() {
		double x0 = Math.asin(a);
		return "Rozwiązaniem równani jest: " + x0 + " v " + (Math.asin(a)-x0);
	}
	
	public String toString() {
		return "sinx = " + a;
	}
}

