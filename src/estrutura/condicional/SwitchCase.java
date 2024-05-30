package estrutura.condicional;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("Digite o número da semana: ");
//		int x = sc.nextInt();
//		String dia;
//
//		if (x == 1) {
//			dia = "domingo";
//		} else if (x == 2) {
//			dia = "Segunda-feira";
//		} else if (x == 3) {
//			dia = "Terça-feira";
//		} else if (x == 4) {
//			dia = "Quarta-feira";
//		} else if (x == 5) {
//			dia = "Quinta-feira";
//		} else if (x == 6) {
//			dia = "Sexta-feira";
//		} else if (x == 7) {
//			dia = "Sábado";
//		} else {
//			dia = "valor inválido";
//		}
//		System.out.println("Dia da semana: " + dia);
//		sc.close();

		// Utilizando Switch Case no mesmo programa

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o número da semana: ");
		int y = sc.nextInt();
		String dia;

		switch (y) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "terça";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia = "sexta";
			break;
		case 7:
			dia = "sábado";
			break;
		default:
			dia = "valor inválido";
			break;
		}
		System.out.println("Dia da semana: " + dia);

	}

}
