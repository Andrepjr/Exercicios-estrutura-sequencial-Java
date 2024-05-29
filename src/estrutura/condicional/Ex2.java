package estrutura.condicional;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		/*
		 * Fazer um programa para ler um número inteiro e dizer se este número é par ou
		 * ímpar.
		 */

		Scanner sc = new Scanner(System.in);
		int n1;

		System.out.println("Digite um numero: ");
		n1 = sc.nextInt();

		if (n1 % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}

	}

}
