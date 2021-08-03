package heranca;

public class AnimalTeste {

	public static void main(String[] args) {
		Cachoro bill = new Cachoro();
		bill.comida = "carne";
		bill.dormir();
		
		Galinha gal = new Galinha();
		gal.dormir();
	}

}
