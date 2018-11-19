import java.io.Serializable;
import java.util.Random;

public class DesenhoMovel extends Desenho implements Serializable{
	
	private int valor = new Random().nextInt(3)+1;
	public void setValor(int Valor){
		this.valor = valor;
	}
	public int getValor() {
		return this.valor;
	}
	
	public void moverDireita(Carro carro) throws LinhaDeChegadaException{
		if(super.getX() >= 750){
			throw new LinhaDeChegadaException(carro);
		}
		else{
			this.setX(this.getX() + valor);
			System.out.println(carro.getNome() + this.getX());
		}
	}
}
