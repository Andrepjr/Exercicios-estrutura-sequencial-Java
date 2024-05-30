package estrutura.condicional;

import java.util.Scanner;

public class ExpressaoCondicionalTernaria {

	public static void main(String[] args) {
		
		/*
		 * Estrutura opcional ao if-else quando se deseja decidir um VALOR com base em
		 * uma condição. Sintaxe: ( condição ) ? valor_se_verdadeiro : valor_se_falso
		 */

	//Exemplo com if else
		
//		Scanner sc = new Scanner (System.in);
//		
//		System.out.println("Digite o preço: ");
//		
//		double preco= sc.nextDouble();
//		double desconto;
//		double valorTotal;
//		if (preco < 20.0) {
//		desconto = preco * 0.1;
//		}
//		else {
//		desconto = preco * 0.05;
//		}
//		valorTotal = preco - desconto;
//		System.out.printf("Desconto: %.2f%nValor total da compra: %.2f ", desconto, valorTotal);
		
		//Exemplo com Condicional ternaria

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o preço: ");

		double preco = sc.nextDouble();
		double valorTotal;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		valorTotal = preco - desconto;

		System.out.printf("Desconto: %.2f%nValor total da compra: %.2f ", desconto, valorTotal);

	}

}
