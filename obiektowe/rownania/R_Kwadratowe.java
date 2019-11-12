public class R_Kwadratowe extends Rownania{
	
	private double a, b, c;
	
	R_Kwadratowe() {
		this(1, 0, 0);
	}
	
	R_Kwadratowe(double a, double b, double c) {
		super();
		
		if(a == 0)
			this.a = 1;
		else
			this.a = a;
		
		this.b = b;
		this.c = c;
	}
	
	public double getDelta() {
		return (b*b - 4*a*c);
	}
	
	public String rozwiaz() {
		double delta = getDelta();
		if (delta > 0) {
			double pierwiastek = Math.sqrt(delta);
			double x1 = (-b - pierwiastek) / (2 * a);
			double x2 = (-b + pierwiastek) / (2 * a);
			return " x1 = " + x1 + " , x2 = " + x2;
		} else if (delta == 0) {
			double x0 = (-b / 2 * a);
			return " x0 = " + x0;
		} else {
			return "Brak rozwiązań";
		}
	}
	
	@Override
	public String toString() {
		return a + "x^2 + " + b + "x" + c; 
	}
}

