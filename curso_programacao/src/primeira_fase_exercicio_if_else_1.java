import java.util.Scanner;

public class primeira_fase_exercicio_if_else_1 {

	public static void main(String[] args) {

		System.out.println("Informe uma n�mero qualquer:");
			
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		if(numero < 0) {
			
			System.out.println("Seu n�mero � Negativo");
			
		}else {
			
			System.out.println("Seu n�mero � Positivo");			
		}
		
		sc.close();
	}

}
