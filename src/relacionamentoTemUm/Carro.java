package relacionamentoTemUm;

public class Carro {
/* construtores sao blocos de comandos que sao usados para inicializar objectos
 * todas as classes tem construtores padroes
 * o compilador cria automaticamente*/
	
	public String modelo;
	public int velocMaxima;
	public double segundZeroACem;
	
	public Carro() { // esse construtor e feito automaticamente
	}
	
	public Carro(String modelo, int veloci, double segundos) { //outro construtot inicializado
		this.modelo = modelo;
		this.segundZeroACem = segundos;
		this.velocMaxima = veloci;
	}
}
