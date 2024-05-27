package testes;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir,
		 * calcule e mostre a diferença do produto de A e B pelo produto de C e D
		 * segundo a fórmula: DIFERENCA = (A * B - C * D).
		 */

		Scanner sc = new Scanner(System.in);

		int A, B, C, D, DIFERENCA;

		System.out.println("Digite o primeiro número: ");
		A = sc.nextInt();
		System.out.println("Digite o segundo número: ");
		B = sc.nextInt();
		System.out.println("Digite o terceiro número: ");
		C = sc.nextInt();
		System.out.println("Digite o quarto número: ");
		D = sc.nextInt();
		DIFERENCA = (A * B - C * D);

		System.out.println("Diferença: " + DIFERENCA);
	}

}
