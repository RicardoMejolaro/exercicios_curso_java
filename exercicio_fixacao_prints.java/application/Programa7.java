package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario2;


public class Programa7 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos funcionários deseja cadastrar?: ");
		Integer qtd = sc.nextInt();
		
		List<Funcionario2> funcionarios = new ArrayList();
		
		for(int i=1; i<=qtd; i++) {
			
			System.out.println();
			System.out.println(" Funcionário: #" + i + ": ");
			System.out.println("Informe o ID do Funcionário: ");
			Integer id = sc.nextInt();
			
			System.out.print("Informe o nome do funcionário: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("Informe o salário do funcionário: ");
			double salario = sc.nextDouble();
			
			funcionarios.add(new Funcionario2(id, nome, salario));
		}
		
		System.out.println();
		System.out.print("Informe o ID do funcionário que deseja aumentar o salario: ");
		int id = sc.nextInt();
		
		Funcionario2 verifica = funcionarios.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

		if (verifica == null) {
			
			System.out.println("O ID informado não existe!");
			
		}else {
			
			System.out.print("Informe a porcentagem de aumento: ");
			Double porcentagem = sc.nextDouble();
			verifica.aumentoSalarial(porcentagem);
		}
		
		System.out.println();
		System.out.println("Lista de Funcionarios: ");
			
		for (Funcionario2 obj : funcionarios) {
			
			System.out.println(obj);
			
		}
		
		sc.close();
	}
		
}
