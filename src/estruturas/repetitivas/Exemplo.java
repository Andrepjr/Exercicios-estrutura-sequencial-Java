package estruturas.repetitivas;

import java.util.Scanner;

public class Exemplo {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//
//		int x = sc.nextInt();
//		
//		int soma = 0;
//		while (x != 0) {
//			soma = soma + x;
//			x = sc.nextInt();
//		}
//		
//		System.out.println(soma+"ola mundo");
//
//		sc.close();
//		
//		int x =0;
//		int y =4;
//		
//		while (x<3) {
//			y = y + 2;
//			x = x + 1;
//			System.out.println(x + "-" + y);
//		}

		int x = 5;
		int y = 0;
		
		while (x > 2) {
			System.out.println(x);
			x = y + x;
			x = x - 1;
		}
	}

}
