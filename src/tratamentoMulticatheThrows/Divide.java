package tratamentoMulticatheThrows;
/*multi catch possibilidade de tratar varios tipos de excepcao
 * no mesmo bloco*/
 
import java.util.InputMismatchException;
import java.util.Scanner;



public class Divide {

	public static void main(String[] args) { 
		Scanner ler = new Scanner(System.in);
		boolean continua = true;
		do {
			try {
				System.out.println("Digite o primeiro numero: ");
				int a = ler.nextInt();
				System.out.println("Digite o numero divisor: ");
				int b = ler.nextInt();
				System.out.println(a/b);
				continua = false;
			}
			catch(InputMismatchException | ArithmeticException e) {
				System.err.println("Numeros Invalido");
				ler.nextLine();//descarta a entrada que deu erro e libera novamente para o usuario
			}
			
		}while(continua);
		
		
		
	}

}
