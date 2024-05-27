package testes;

import java.util.Locale;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa que leia o número de um funcionário, seu número de horas
		 * trabalhadas, o valor que recebe por hora e calcula o salário desse
		 * funcionário. A seguir, mostre o número e o salário do funcionário, com duas
		 * casas decimais.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, horas;
		double valorHora, salario;

		System.out.println("Digite o seu número: ");
		n = sc.nextInt();

		System.out.println("Digite o número de horas trabalhadas: ");
		horas = sc.nextInt();

		System.out.println("Digite o valor recebido por hora: ");
		valorHora = sc.nextDouble();

		salario = horas * valorHora;

		System.out.printf("Number = %d%nSalary = $ %.2f", n, salario);

	}

}
