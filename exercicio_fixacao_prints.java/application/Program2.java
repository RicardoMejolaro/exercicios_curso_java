package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.println("Digite o nome do funcion�rio: ");
		funcionario.name = sc.nextLine();
		
		System.out.println("Digite o sal�rio bruto do funcion�rio: ");
		funcionario.grossSalary = sc.nextDouble();
		
		System.out.println("Digite o imposto cobrado sobre o sal�rio bruto: ");
		funcionario.tax = sc.nextDouble();
		
		System.out.println("Employee: " + funcionario);
		
		System.out.println();
		
		System.out.println("Which percentage to increase salary?:");
		double percentage = sc.nextDouble();
		funcionario.increaseSalary(percentage);
		
		System.out.println("Update data: " + funcionario);
		
		sc.close();

	}

}