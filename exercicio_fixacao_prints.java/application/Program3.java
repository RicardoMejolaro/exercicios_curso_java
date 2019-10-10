package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Estudante;

public class Program3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Estudante estudante = new Estudante();
		
		System.out.println("Digite o nome do Aluno: ");
		estudante.nome = sc.nextLine();
		
		System.out.println("Digite a Primeira nota do aluno: ");
		estudante.nota1 = sc.nextDouble();
		
		System.out.println("Digite a Segunda nota do aluno: ");
		estudante.nota2 = sc.nextDouble();
		
		System.out.println("Digite a terceira nota do aluno: ");
		estudante.nota3 = sc.nextDouble();
		
		System.out.println();
		
		if(estudante.media() < 60.0) {
			
			System.out.printf("Nota final: %.2f %n", estudante.media());
			System.out.println("N�o passou de ano!");
			System.out.println("Faltaram, " + estudante.pontosFaltantes() + " pontos para bater a media!");
		} else {
			
			System.out.printf("Nota final: %.2f %n", estudante.media());
			System.out.println("Aluno passou de ano!");
			
		}
		
		sc.close();
	}

}
