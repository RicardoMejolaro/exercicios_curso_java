import java.util.Scanner;

public class primeira_fase_exercicio_if_else_2 {
	
	public static void main(String[] args) {

		System.out.println("Digite um n�mero para descobrir se ele � par ou �mpar:");
		
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		if((numero % 2) == 0) {
			
			System.out.println("O seu n�mero � par");
			
		}else {
		
			System.out.println("Seu n�mero � �mpar");	
		}
		
		sc.close();
	}

}
