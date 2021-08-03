package tratamentoMulticatheThrows;
/*stackTrace e a sua pilha de erros
 * um erro pode comecar numa classe se se propagar em outras*/

//somente lancar excepcoes com thorws
import java.util.InputMismatchException;
import java.util.Scanner;

public class Operacao {
	//mostramos as execepcoes que esse bloco de codigo pode lancar
	public static void  dividir(Scanner ler) throws InputMismatchException, ArithmeticException{
		System.out.println("Digite o primeiro numero: ");
		int a = ler.nextInt();
		System.out.println("Digite o numero divisor: ");
		int b = ler.nextInt();
		System.out.println(a/b);
		
	}

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		boolean continua = true;
		do {
			try {
				dividir(ler);
				continua = false;
			}
			catch(InputMismatchException | ArithmeticException e) {
				System.err.println("Numeros Invalido");
				e.getMessage();
				ler.nextLine();//descarta a entrada que deu erro e libera novamente para o usuario
			}
			
		}while(continua);
		
		

	}

}
