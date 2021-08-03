package tiposdeExcepcao;

import java.util.Scanner;

public class SenhaTest {
	
	static void autenticar(String senha) throws SenhaInvalidaExcepcao {
		if("123".equals(senha)) {
			//autenticado
			System.out.println("Autenticado");
		}else {
			//senha incorreta
			throw new SenhaInvalidaExcepcao("Senha Invalida, volte a tentar");
		}
	}
	public static void main(String[] args)  {
		
		boolean x = true;
		do {
			try {
				Scanner ler = new Scanner(System.in);
				System.out.println("Digite a Senha: ");
				String senha = ler.nextLine();
				autenticar(senha);
				x = false;
				
			}catch(SenhaInvalidaExcepcao e) {
				System.out.println(e.getMessage());
				}
		}while(x);
	}
		

}
