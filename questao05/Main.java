package questao05;

public class Main {

	public static void main(String[] args) {
		Empregado empregado1 = new Empregado("Pedro", "Morais", 1);
		empregado1.setComparecimento(19);
		empregado1.setSalario(2500);
		
		System.out.println("Seu salário: R$" + empregado1.CalcularSalario());
	}

}
