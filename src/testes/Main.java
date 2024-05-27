package testes;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Saída de dados
		/*
		 * int y = 32; double x = 10.35784; String nome = "Maria"; int idade = 31;
		 * double renda = 4000.0;
		 * 
		 * System.out.println("O valor de y é: " + y);
		 * 
		 * System.out.println("O valor de x é: " + x);
		 * 
		 * System.out.printf("%.2f%n" , x);
		 * 
		 * System.out.printf("%.4f%n" , x);
		 * 
		 * Locale.setDefault(Locale.US);
		 * 
		 * System.out.printf("%.4f%n" , x);
		 * 
		 * System.out.println("O resultado é " + y + " metros.");
		 * 
		 * System.out.printf("O resultado é: %.2f metros%n" , x);
		 * 
		 * System.out.printf("%s tem %d anos e ganha R$ %.2f ",nome, idade, renda );
		 */

		// Entrada de Dados

		Scanner sc = new Scanner(System.in);

		String nome;
		int n;
		double d;

		nome = sc.nextLine();
		n = sc.nextInt();
		d = sc.nextDouble();

		System.out.println("Dados digitados: ");
		System.out.println(nome);
		System.out.println(n);
		System.out.println(d);

		sc.close();

	}

}
