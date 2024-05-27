package testes;

import java.util.Locale;
import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		
		/*
		 * Fazer um programa que leia três valores com ponto flutuante de dupla
		 * precisão: A, B e C. Em seguida, calcule e mostre: a) a área do triângulo
		 * retângulo que tem A por base e C por altura. b) a área do círculo de raio C.
		 * (pi = 3.14159) c) a área do trapézio que tem A e B por bases e C por altura.
		 * d) a área do quadrado que tem lado B. e) a área do retângulo que tem lados A
		 * e B.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double A, B, C, TRIANGULO, CIRCULO, TRAPEZIO, QUADRADO, RETANGULO;

		System.out.println("Digite três valores: ");
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();

		TRIANGULO = (A * C) / 2;
		CIRCULO = 3.14159 * C * C;
		TRAPEZIO = (A + B) * C / 2;
		QUADRADO = B * B;
		RETANGULO = A * B;

		System.out.printf("%.3f%n%.3f%n%.3f%n%.3f%n%.3f", TRIANGULO, CIRCULO, TRAPEZIO, QUADRADO, RETANGULO);

	}

}
