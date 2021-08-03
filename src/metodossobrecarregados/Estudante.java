package metodossobrecarregados;

public class Estudante {
    //metodos sobrecaregados
	//sao metodos com mesmo nome
	//mais com assinaturas diferentes
	
	public double media(int x, int y) {
		System.out.println("Metodo double media(int x, int y)");
		return (x + y)/2;
	}
	
	public double media(String x, String y) {
		System.out.println("Metodo String(String x, String y)");
		int x1 = Integer.parseInt(x);
		int y1 = Integer.parseInt(y);
		return (x1 + y1)/2;
	}
	
	public static void main(String[] args) {
		Estudante est = new Estudante();
		double media = est.media(20, 10);
		
		System.out.println(media);
		
		double medi = est.media("12", "20");
		System.out.println(medi);
	}

}
