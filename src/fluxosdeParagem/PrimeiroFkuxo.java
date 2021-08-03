package fluxosdeParagem;

public class PrimeiroFkuxo {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i ++) {
			if(i == 5) {
				System.out.println("Numero: "+i); //imprime apenas o 5
				break;//para todo loop
			}
			System.out.println(i); //imprime os numeros antes do 5
		}
	}
}
