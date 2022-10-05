package questao01;

public class Main {

	public static void main(String[] args) {
		Controle controle = new Controle();

		System.out.println(controle.aumentarVolume());
		System.out.println(controle.diminuirVolume());
		System.out.println(controle.trocarCanal(23));
		System.out.println(controle.subirCanal());
		System.out.println(controle.descerCanal());
		

	}

}
