package estrutura.condicional;

import java.util.Scanner;

public class AulaTestes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int hora;

		System.out.println("Quantas horas?");
		hora = sc.nextInt();

		if (hora < 12) {
			System.out.println("Bom dia");
		} else if (hora < 18) {
			System.out.println("Boa tarde");
		} else if (hora < 23) {
			System.out.println("Boa noite");
		} else {
			System.out.println("Vá dormir");
		}

		sc.close();

	}

}


