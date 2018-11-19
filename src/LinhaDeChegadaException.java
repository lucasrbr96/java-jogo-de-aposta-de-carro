public class LinhaDeChegadaException extends Exception {
	
	private Carro carro;
	
	public LinhaDeChegadaException(Carro carro) {
		this.carro = carro;
	}
	
	public Carro getCarro() {
		return this.carro;
	}
}
