import java.util.Locale;
import java.util.Scanner;

public class primeira_fase_exercicio1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int soma = num1 + num2;
		
		System.out.printf("A soma de %d + %d é igual a: %d%n", num1, num2, soma);
		
		sc.close();
	}

}
