import java.util.Locale;
import java.util.Scanner;

public class primeira_fase_exercicio2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		double valorEntrada = sc.nextDouble();
		double constante = 3.14159;
		
		double raio = Math.pow(valorEntrada, 2.0);
				
		double areaCirculo = constante * raio;
		
		System.out.printf("A área do círculo é %.4f ", areaCirculo);
		
		sc.close();
		
	}

}
