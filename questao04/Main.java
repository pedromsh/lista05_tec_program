package questao04;

import java.util.Scanner;

public class Main {
	
	public Produto carregarProduto(Scanner input) {
		Produto produto = new Produto();
		
		System.out.print("Informe o nome do produto: ");
		produto.setNome(input.next());
		
		System.out.print("Informe o preço de custo do produto: ");
		produto.setCusto(input.nextDouble());
		
		System.out.print("Informe o preço de venda do produto: ");
		produto.setVenda(input.nextDouble());
		
		System.out.print("Informe as despesas: ");
		produto.setDespesas(input.nextDouble());
		
		return produto;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Main m = new Main();
		
		Produto produto1 = m.carregarProduto(input);
		
		System.out.println("Margem de lucro: " + produto1.calcularMargem() + "%");

	}

}
