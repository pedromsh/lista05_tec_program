package questao03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Circulo circulo1 = new Circulo();
		
		System.out.print("Informe o raio do círculo: ");
		double raio = input.nextDouble();
		
		circulo1.setRaio(raio);
		
		System.out.println("Área: " + circulo1.calcularArea());
		System.out.println("Circunferência: " + circulo1.calcularCircunferencia());
		
		System.out.println("Informe o percentual para aumentar o círculo: ");
		double valor = input.nextDouble();
		
		System.out.println("Nova área: " + circulo1.aumentarArea(valor));
		System.out.println("Nova circunferência: " + circulo1.aumentarCircuferencia(valor));
		
		input.close();
	}

}
