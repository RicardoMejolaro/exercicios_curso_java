package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conversor;

public class Program4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do d�lar em real: ");
		double dolarValor = sc.nextDouble();
		
		System.out.println("Digite o valor em d�lar que voc� deseja comprar: ");
		double montante = sc.nextDouble();
		
		double resultado = Conversor.calculo(dolarValor, montante);
		
		System.out.printf("O valor a ser pago pelo total de $ %.2f �: R$ %.2f", montante, resultado);
		
		sc.close();
	}

}
