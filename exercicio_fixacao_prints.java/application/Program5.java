package application;

import java.util.Locale;

import java.util.Scanner;

import entities.Conta;

public class Program5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Conta conta;
		
		System.out.print("Digite o n�mero da conta: ");
		int numConta = sc.nextInt();
		
		System.out.print("Digite o nome do cliente: ");
		sc.nextLine();
		String nome = sc.nextLine();
		
				
		System.out.print("Cliente ir� realizar dep�sito inicial? (s/n)?: ");
		char opcao = sc.nextLine().charAt(0);
		
		if (opcao == 's' || opcao == 'S') {
			
			System.out.print("Por favor digite o valor do dep�sito: ");
			double primeiroDeposito = sc.nextDouble();
			
			conta = new Conta(numConta, nome, primeiroDeposito);
			
		}else {
			
			conta = new Conta(numConta, nome);
		}	
		
		
		System.out.println();
		System.out.println("Dados da conta:");
		System.out.println(conta);
		System.out.println();

		System.out.print("Entre com o valor do dep�sito: ");
		double quantia = sc.nextDouble();
		conta.depositoConta(quantia);
		
		System.out.println();
		System.out.println("Dados da conta:");
		System.out.println(conta);
		System.out.println();
		
		System.out.print("Entre com o valor do Saque: ");
		quantia = sc.nextDouble();
		conta.saqueConta(quantia);
		
		System.out.println();
		System.out.println("Dados da conta:");
		System.out.println(conta);
		System.out.println();

		sc.close();
	}

}
