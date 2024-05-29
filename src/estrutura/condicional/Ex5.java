package estrutura.condicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		/*
		 * Com base na tabela abaixo, escreva um programa que leia o código de um item e
		 * a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
		 */

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();

		double total = codigo * quantidade;
		if (codigo == 1) {
			total = 4 * quantidade;
		} else if (codigo == 2) {
			total = 4.50 * quantidade;
		} else if (codigo == 3) {
			total = 5 * quantidade;
		} else if (codigo == 4) {
			total = 2 * quantidade;
		} else if (codigo == 5) {
			total = 1.50 * quantidade;
		}

		System.out.printf("Total: %.2f", total);

	}

}
