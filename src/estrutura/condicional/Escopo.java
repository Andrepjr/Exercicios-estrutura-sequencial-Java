package estrutura.condicional;

public class Escopo {

	public static void main(String[] args) {
		
		double price = 400;
		double discount = 0;
		if (price > 100.0) {
		discount = price * 0.1;
		}
		System.out.println(discount);

	}

}
