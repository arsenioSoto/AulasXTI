package polimorfismo;


public class OperacaoTest {
	
	/*metodo que usa o polimorfismo*/
	public static void calcule(OperacaoMatematica opera, double x, double y) {
		System.out.println(opera.calcular(x, y));
	}
	
	public static void main(String[] args) {
		calcule(new Soma(), 5, 5);
		calcule(new Multiplicacao(), 5, 5);
	}
}
