package estruturas.repetitivas;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o combustível abastecido: ");
		int alcool = 0, gasolina = 0, diesel = 0;
		int combustivel = sc.nextInt();

		while (combustivel != 4) {
			if (combustivel == 1) {
				alcool = alcool + 1;
			} else if (combustivel == 2) {
				gasolina = gasolina + 1;
			} else if (combustivel == 3) {
				diesel = diesel + 1;
			}
			combustivel = sc.nextInt();

		}
		System.out.println("Muito Obrigado");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
	}

}
