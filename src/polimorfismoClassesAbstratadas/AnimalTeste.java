package polimorfismoClassesAbstratadas;

public class AnimalTeste {
	
	/*metodo que usa polimofirmos*/
	public static void fazerBarulho(Animal animal) {
		animal.fazerBarulho();
	}

	public static void main(String[] args) {
		Cachoro bill = new Cachoro();
		bill.comida = "carne";
		
		
		Galinha gal = new Galinha();
	
		fazerBarulho(bill);
		fazerBarulho(gal);
	}

}
