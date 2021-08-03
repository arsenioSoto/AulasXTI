package tratamentoExcepcao;

/*uma execepcao e uma indicacao de um problema que ocorre durante 
 * execucao do programa
 * o nome excepcao significa que o problema na ocoree frequentemente
 * */
import java.util.InputMismatchException;
import java.util.Scanner;

//InputMismatchException quando introduzimos texto ou um valor diferente do pedido
//ArithmeticException quando introduzimos um divisor invalido 0

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
			catch(InputMismatchException e) {
				System.err.println("Numeros devem ser inteiros");
				ler.nextLine();//descarta a entrada que deu erro e libera novamente para o usuario
			}
			
			catch(ArithmeticException e) {
				System.err.println("Divisor deve ser diferente de 0");
				
			}
		}while(continua);
		
		
		
	}

}
