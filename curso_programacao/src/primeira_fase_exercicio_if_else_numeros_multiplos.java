import java.util.Scanner;

public class primeira_fase_exercicio_if_else_numeros_multiplos {

	public static void main(String[] args) {

		System.out.println("Digite os n�meros para saber se eles s�o m�ltiplos ou n�o: ");
	
		Scanner sc = new Scanner(System.in);	
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if((num1 % num2) == 0 || (num2 % num1) == 0) {
			
			System.out.println("Seus n�meros s�o m�ltiplos");
			
		}else {
			
			System.out.println("Seus n�meros n�o s�o m�ltiplos");
		}
		
		sc.close();
	}

}
