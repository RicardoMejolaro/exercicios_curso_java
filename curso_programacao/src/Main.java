import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		int y = 32;
		double x = 10.3589;
		
		String nome = "Maria";
		int idade = 30;
		double renda = 4000.0;
		
		System.out.println("Olá Mundo!");
		System.out.println("Bom dia!");
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
		
		System.out.println("O resultado é = " + x + "metros! ");
		
		System.out.printf("O resultado é = %.2f metros!%n%n", x);
		
		System.out.printf("%s possui %d anos de idade e sua renda é: R$ %.2f%n%n", nome, idade, renda);

		

		
	}

}
