package polimorfismoClassesAbstratadas;

/*uma classe nao pode ser instaciada*/
public abstract class Animal {
	public double peso;
	public String comida;
	
	public void dormir() {
		System.out.println("Dormiu");
	}
	
	/*as subclasses serao obtigadas a implementar esse metodo*/
	public abstract void fazerBarulho();
}
