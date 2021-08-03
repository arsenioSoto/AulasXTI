package assertion;

import java.util.Scanner;

public class Assertions {

	public static void main(String[] args) {
		
		Scanner ler =new Scanner(System.in);
		System.out.println("Digite um numero entre 0 e 10");
		int num = ler.nextInt();
		
		assert (num >= 0 && num <= 10);
		System.out.println("Voce digitou: "+num);

	}

}
