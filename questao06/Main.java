package questao06;

public class Main {

	public static void main(String[] args) {
		Elevador predio1 = new Elevador(10, 30);
		
		System.out.println(predio1.subir());
		System.out.println(predio1.subir());
		System.out.println(predio1.entrar());
		System.out.println(predio1.entrar());
		System.out.println(predio1.descer());
		System.out.println(predio1.sair());

	}

}
