package metodosestaticos;

public class Galinha {
	public int ovos;
	public static int ovosGranja;
	
	public Galinha botar() {
		this.ovos++;
		Galinha.ovosGranja++;
		return this;
	}
	
	public static double mediaOvos(int galinhas) {
		return ovosGranja / galinhas;
	}
}
