import java.util.Scanner;

public class comando_if_else {

	public static void main(String[] args) {
		
		System.out.println("Que horas s�o?");
		
		Scanner sc = new Scanner(System.in);
		int hora = sc.nextInt();
		
		if(hora < 12) {
			System.out.println("Bom dia!");
		}
		
		else if(hora < 18) {
			
			System.out.println("Boa tarde!");				
		}
			
		else {				
			
			System.out.println("Boa noite!");
		}			
		
		sc.close();
	}

}
