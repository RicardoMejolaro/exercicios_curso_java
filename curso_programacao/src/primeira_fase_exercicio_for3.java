import java.util.Locale;
import java.util.Scanner;

public class primeira_fase_exercicio_for3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quantas vezes deseja realizar o teste: ");
		int n = sc.nextInt();
				
		for (int i=0; i<n; i++) {
			
			System.out.println("Digite os 3 valores com uma casa decimal: ");
			
			double num1 = sc.nextDouble();
			
			double num2 = sc.nextDouble();

			double num3 = sc.nextDouble();
			
			double media = (num1 * 2.0 + num2 * 3.0 + num3 * 5.0) / 10.0;

			System.out.printf("%.1f %n", media);

		}
		
		sc.close();
	}

}
