import java.util.Locale;
import java.util.Scanner;

public class entrada_de_dados {

	public static void main(String[] args) {

		// Testanto scanner com todos os tipos de varáveis://

		// Váriavel tipo String

		Scanner sc = new Scanner(System.in);

		String x;
		x = sc.next();

		System.out.println("Você digitou o valor: " + x);

		// Variável tipo int
		int y;
		y = sc.nextInt();

		System.out.println("Você digitou o número inteiro: " + y);

		// Variável tipo double
		double z;
		z = sc.nextDouble();

		// Conversor de estilo português , para estilo americano .
		Locale.setDefault(Locale.US);

		System.out.println("Você digitou o valor double: " + z);

		// Variável tipo caracter
		char a;
		a = sc.next().charAt(0);

		System.out.println("Voçê digitou a letra: " + a);

		// Ler mais de uma variável de tipos iguais ou diferentes

		String b;
		int c;
		double d;

		b = sc.next();
		c = sc.nextInt();
		d = sc.nextDouble();

		System.out.println("Os dados digitados foram: ");
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

		// Leitura de dados até a próxima linha (TEXTO INTEIRO)

		String s1, s2, s3;

		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();

		System.out.println("Dados digitados: ");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		// Como limpar o buffer de leitura, quando a entrada anterior não é nextLine

		int w;
		String r1, r2, r3;
		w = sc.nextInt();
		sc.next(); // incluir um next isolado a mais antes da próxima instrução
		r1 = sc.nextLine();
		r2 = sc.nextLine();
		r3 = sc.nextLine();
		System.out.println("DADOS DIGITADOS:");
		System.out.println(w);
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);

		sc.close();

	}

}
