package estruturas.repetitivas;

import java.util.Scanner;

public class Ex1For {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		for (int i = 1; i <= x; i = i + 1) {
			if (i % 2 !=0){
				System.out.println(i);
			}
			
		}
		sc.close();

	}

}
