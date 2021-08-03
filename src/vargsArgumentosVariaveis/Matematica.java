package vargsArgumentosVariaveis;

public class Matematica {
	public double soma(double ... numeros) { //nao e possivel ter dois argumentos variaveis
		double total = 0;
		
		for(double n: numeros) {
			total += n;
		}
		return total;
	}
}
