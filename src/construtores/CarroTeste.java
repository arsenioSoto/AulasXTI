package construtores;

public class CarroTeste {

	public static void main(String[] args) {
		Carro ferrari = new Carro(); //chamada de um construtor (Carro())
		ferrari.modelo = "Ferrari Enzo";
		ferrari.velocMaxima = 300;
		ferrari.segundZeroACem = 3.2;
		
		Carro toyota = new Carro("Toyota Mazda", 180, 1.0);//chamada do segundo construtor
		
		System.out.println(ferrari.modelo);
		System.out.println(toyota.modelo);
		
		

	}

}
