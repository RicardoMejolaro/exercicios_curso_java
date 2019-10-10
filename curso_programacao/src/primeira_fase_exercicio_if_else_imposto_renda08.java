import java.util.Locale;
import java.util.Scanner;

public class primeira_fase_exercicio_if_else_imposto_renda08 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double salario = sc.nextDouble();
		double imposto = 0;
		
		if (salario <= 2000.00) {
			
			imposto = 0.0;
			
		}
		
		else if (salario <= 3000.0) {
			
			imposto = (salario - 3000.0) * 0.08;
			
		}else if (salario <= 4500.0) {
			
			imposto = (salario - 3000.0) * 0.18 + (1000.0 * 0.08);
			
		}else {
			
			imposto = (salario - 4500.0) * 0.28 + (1500.0 * 0.18) + (1000.0 * 0.08);
		
		}
		
		System.out.printf("Imposto de renda � o total de: R$ %.2f", imposto);
		
		sc.close();
	}

}
