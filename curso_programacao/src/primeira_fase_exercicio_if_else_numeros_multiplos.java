import java.util.Scanner;

public class primeira_fase_exercicio_if_else_numeros_multiplos {

	public static void main(String[] args) {

		System.out.println("Digite os números para saber se eles são múltiplos ou não: ");
	
		Scanner sc = new Scanner(System.in);	
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if((num1 % num2) == 0 || (num2 % num1) == 0) {
			
			System.out.println("Seus números são múltiplos");
			
		}else {
			
			System.out.println("Seus números não são múltiplos");
		}
		
		sc.close();
	}

}
