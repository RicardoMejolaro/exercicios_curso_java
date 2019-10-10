import java.util.Locale;
import java.util.Scanner;

public class primeira_fase_exercicio4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		int numeroFuncionario = sc.nextInt();
		double horasTrabalhadas = sc.nextDouble();
		double valorHoraTrabalhada = sc.nextDouble();
		
		double salario = horasTrabalhadas * valorHoraTrabalhada;
		
		System.out.printf("O funcionário número: %d, receberá este mês o total de: R$ %.2f como salário!", numeroFuncionario, salario);
		
		sc.close();
	}

}
