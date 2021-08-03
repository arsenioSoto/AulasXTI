package fluxosdeParagem;

public class SegundoFluxo {

	public static void main(String[] args) {
		for(int i =0; i < 10; i++) {
			if(i == 5) {
				continue;//para a intercao actual
			}
			System.out.println(i); //imprime todos numeros menos o 5(salta o 5)
		}
	}

}
