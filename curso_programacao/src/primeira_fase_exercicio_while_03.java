import java.util.Scanner;

public class primeira_fase_exercicio_while_03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o c�digo do produto ou 4 para finalizar:");
		
		int cod = sc.nextInt();

		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		while (cod != 4) {
			
			if (cod == 1) {
				
				alcool = alcool + 1;
				
			} else if (cod == 2) {
				
				gasolina = gasolina + 1;
				
			} else if (cod == 3) {
				
				diesel = diesel + 1;

			} 
			
			cod = sc.nextInt();			
		}

		System.out.println("MUITO OBRIGADO");
		System.out.printf("Alcool: %d %n", alcool);
		System.out.printf("Gasolina: %d %n", gasolina);
		System.out.printf("Diesel: %d %n", diesel);
		
		sc.close();
		
	}

}
