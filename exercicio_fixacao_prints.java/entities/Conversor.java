package entities;

public class Conversor {
	
	public static double IOF = 0.06;
	
	public static double calculo(double dolarValor, double montante) {
		
		return dolarValor * montante * (1.0 + IOF);		
		
	}

}
