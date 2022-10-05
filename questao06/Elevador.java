package questao06;

public class Elevador {

	private int andarAtual;
	private int totalAndares;
	private int capacidade;
	private int presentes;
	
	public Elevador(int capacidade, int totalAndares) {
		this.capacidade = capacidade;
		this.totalAndares = totalAndares;
		presentes = 0;
		andarAtual = 0;
	}
	
	public int entrar() {
		if(presentes < capacidade)
			presentes = presentes + 1;
		
		return presentes;
	}
	
	public int sair() {
		if(presentes > 0)
			presentes = presentes - 1;
		
		return presentes;
	}
	
	public int subir() {
		if(andarAtual < totalAndares)
			andarAtual = andarAtual + 1;
		
		return andarAtual;
	}
	
	public int descer() {
		if(andarAtual > 0)
			andarAtual = andarAtual - 1;
		
		return andarAtual;
	}

	public int getTotalAndares() {
		return totalAndares;
	}

	public int getCapacidade() {
		return capacidade;
	}

}
