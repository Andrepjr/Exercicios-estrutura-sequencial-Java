package estruturas.repetitivas;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int soma = 0;
	for (int i=0; i<N; i=i+1) {
			int x = sc.nextInt();
		soma = soma + x;
		}
		
		System.out.println(soma);
	
		sc.close();
		
//		//Contagem
//		for (int i=0; i<5; i=i+1) {
//			System.out.println("Valor de i: " + i);
//			}
//		
//		
//		//Contagem regressiva
//		System.out.println("\n");
//		for (int i=4; i>=0; i=1-1) {
//			System.out.println("Valor de i: " + i);
//			}

	}

}
