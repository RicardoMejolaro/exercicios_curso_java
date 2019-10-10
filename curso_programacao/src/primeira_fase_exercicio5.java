import java.util.Locale;
import java.util.Scanner;

public class primeira_fase_exercicio5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int codPeca01 = sc.nextInt();
		int qtdPecas01 = sc.nextInt();
		double valorUnitarioPeca01 = sc.nextDouble();		
		int codPeca02 = sc.nextInt();
		int qtdPecas02 = sc.nextInt();
		double valorUnitarioPeca02 = sc.nextDouble();
		
		double valorTotalCompra = ((qtdPecas01 * valorUnitarioPeca01) + (qtdPecas02 * valorUnitarioPeca02));
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", valorTotalCompra);
		
		sc.close();
		
		
	}

}
