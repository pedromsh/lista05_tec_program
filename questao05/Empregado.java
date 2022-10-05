package questao05;

import java.util.Arrays;

public class Empregado {

	private int id;
	private String nome;
	private String sobrenome;
	private double salario;
	private boolean[] array;
	private int comparecimento;
	
	public Empregado(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	public Empregado(String nome, String sobrenome, int id) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.id = id;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void setComparecimento(int comparecimento) {
		this.comparecimento = comparecimento;
	}
	
	private boolean[] CalcularDiasTrabalhados() {
		this.array = new boolean[30];
		
			for (int i = 0, cont = this.comparecimento; i < array.length; i++, cont--) {
				if(cont > 0)
					array[i] = true;
				else
				    array[i] = false;
			}
		
		return array;
	}
	
	public double CalcularSalario() {
		CalcularDiasTrabalhados();
		
		int cont = 0;
		double desconto = 0;
		
		for (int i = 0; i < array.length; i++) {
			if(array[i] == false)
				cont++;
		}
		
		if(cont == 0) {
			salario = salario * 1.01;
		}
		else if(cont >= 3 && cont <= 5) {
			desconto = cont * 0.02;
			salario = salario * (1 - desconto);
		}
		else if(cont >= 6 && cont <= 10) {
			desconto = cont * 0.03;
			salario = salario * (1 - desconto);
		}
		else {
			salario = salario * 0.2;
		}
		
		return salario;
	}
}
