package estruturas.repetitivas;

import java.util.Scanner;

public class DoWhileTeste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int soma = 0;
		int N;

		do {
			System.out.println("Insira um número: ");
			N = sc.nextInt();
			soma = soma + N;
		} while (N != 0);
		System.out.println(soma);
	}

}
