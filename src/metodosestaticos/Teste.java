package metodosestaticos;

public class Teste {

	public static void main(String[] args) {
		Galinha galinha = new Galinha();
		galinha.botar().botar().botar();
		
		Galinha galinha2 = new Galinha();
		galinha2.botar().botar();
		
		System.out.println("Sao ovos: "+galinha.ovos + "\n" + galinha2.ovos);
        System.out.println(Galinha.ovosGranja);
        System.out.println(Galinha.mediaOvos(2));
	}

}
