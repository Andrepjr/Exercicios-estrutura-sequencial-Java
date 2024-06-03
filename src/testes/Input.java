package testes;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		
		//Neste código, %15s é usado para formatar a String para que ela seja justificada à esquerda em 15 caracteres, e %03d é usado para formatar o número para que ele tenha exatamente 3 dígitos, com zeros à esquerda, se necessário.
		Scanner sc = new Scanner (System.in);
		
		String A = sc.nextLine();
		int B = sc.nextInt();
		
		System.out.printf("%-15s%02d\n", A, B);

	}

}
