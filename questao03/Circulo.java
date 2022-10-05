package questao03;

public class Circulo {
	
	public static final double PI = 3.14;

	private double raio;
	
	public double calcularArea() {
		double area = 0;
		
		area = PI * Math.pow(raio, 2);
		
		return area;
	}
	
	public double calcularCircunferencia() {
		double circunferencia = 0;
		
		circunferencia = 2 * PI * raio;
		
		return circunferencia;
	}
	
	public double aumentarArea(double valor) {
		double novaArea = 0;
		
		novaArea = calcularArea() * (1 + valor / 100);
		
		return novaArea;
	}
	
	public double aumentarCircuferencia(double valor) {
		double novaCircunferencia = 0;
		
		novaCircunferencia = calcularCircunferencia() * (1 + valor / 100);
		
		return novaCircunferencia;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	
	
	
}
