package estrutura.condicional;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		/*
		 * Fazer um programa para ler um número inteiro, e depois dizer se este número é
		 * negativo ou não.
		 */

		Scanner sc = new Scanner(System.in);
		int n1;

		System.out.println("Digite um numero: ");
		n1 = sc.nextInt();

		if (n1 >= 0) {
			System.out.println("POSITIVO");
		} else {
			System.out.println("NEGATIVO");
		}

	}

}
