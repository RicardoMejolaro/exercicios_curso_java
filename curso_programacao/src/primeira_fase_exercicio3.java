import java.util.Scanner;

public class primeira_fase_exercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		int diferenca = (A * B) - (C * D);
		
		System.out.printf("A diferen�a de: %d e %d em rela��o a: %d e %d �: %d", A, B, C, D, diferenca);
		
		sc.close();
		
		
	}

}
