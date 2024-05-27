package testes;

import java.util.Locale;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {

		/*
		 * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o
		 * valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e
		 * o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int c1, n1, c2, n2;
		double v1, v2, valor;

		c1 = sc.nextInt();
		n1 = sc.nextInt();
		v1 = sc.nextDouble();
		c2 = sc.nextInt();
		n2 = sc.nextInt();
		v2 = sc.nextDouble();

		valor = n1 * v1 + n2 * v2;

		System.out.printf("Valor a pagar: %.2f", valor);
		
	}

}
