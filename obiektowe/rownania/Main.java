public class Main {

	public static void main(String[] args) {
		Rownania[] rownanie = new Rownania[6];
		rownanie[0] = new R_Liniowe();
		rownanie[1] = new R_Liniowe(2, 4);
		rownanie[2] = new R_Kwadratowe();
		rownanie[3] = new R_Kwadratowe(1, 0, -4);
		rownanie[4] = new R_Trygonometryczne();
		rownanie[5] = new R_Trygonometryczne(0);

		for (Rownania r : rownanie) {
			System.out.println("ID: "+ r.getID());
			System.out.println("Rozwiazanie: "+r.rozwiaz());
		}
		
//		for(Rownania r : rownanie) {
//			if(r instanceof R_Liniowe) System.out.println(((R_Liniowe)r).rozwiaz());
//			else if(r instanceof R_Kwadratowe) System.out.println(((R_Kwadratowe)r).rozwiaz());
//			else System.out.println(((R_Trygonometryczne)r).rozwiaz());
//		}

	}

}
