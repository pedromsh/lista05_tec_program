package questao02;

public class Main {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Albert Einstein");
		pessoa1.ajustaDataDeNascimento(14, 3, 1879);
		pessoa1.calculaIdade(29, 9, 2022);
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setNome("Isaac Newton");
		pessoa2.ajustaDataDeNascimento(4, 1, 1643);
		pessoa2.calculaIdade(29, 9, 2022);
		
		System.out.println(pessoa1.informaNome() + ": " + pessoa1.informaIdade() + " anos");
		System.out.println(pessoa2.informaNome() + ": " + pessoa2.informaIdade() + " anos");

	}

}
