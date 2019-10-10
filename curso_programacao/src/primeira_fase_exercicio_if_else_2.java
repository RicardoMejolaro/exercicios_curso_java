import java.util.Scanner;

public class primeira_fase_exercicio_if_else_2 {
	
	public static void main(String[] args) {

		System.out.println("Digite um número para descobrir se ele é par ou ímpar:");
		
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		if((numero % 2) == 0) {
			
			System.out.println("O seu número é par");
			
		}else {
		
			System.out.println("Seu número é ímpar");	
		}
		
		sc.close();
	}

}
