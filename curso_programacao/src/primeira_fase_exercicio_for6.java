import java.util.Scanner;

public class primeira_fase_exercicio_for6 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			
			if ((n % i) == 0) {
								
				System.out.println(i);
			}
		}
		
		sc.close();
		
	}

}
