package questao04;

public class Produto {

	private String nome;
	private double custo;
	private double venda;
	private double margemLucro;
	private double despesas;
	
	public double calcularMargem() {
		margemLucro = ((venda - (custo + despesas)) / venda) * 100;
		
		return margemLucro;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCusto(double custo) {
		this.custo = custo;
	}
	
	public void setVenda(double venda) {
		this.venda = venda;
	}
	
	public double getMargemLucro() {
		return margemLucro;
	}
	
	public void setDespesas(double despesas) {
		this.despesas = despesas;
	}
	
	
}
