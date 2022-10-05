package questao01;

public class Controle {

	private int volume;
	private int canal;
	
	public Controle() {
		this.canal = 0;
		this.volume = 0;
	}
	
	public int aumentarVolume() {
		return this.volume = this.volume + 1;
	}
	
	public int diminuirVolume() {
		return this.volume = this.volume - 1;
	}
	
	public int subirCanal() {
		return this.canal = this.canal + 1;
	}
	
	public int descerCanal() {
		return this.canal = this.canal + 1;
	}
	
	public int trocarCanal(int canal) {
		return this.canal = canal;
	}
	
	public int volumeAtual() {
		return volume;
	}
	
	public int canalAtual() {
		return canal;
	}
}
