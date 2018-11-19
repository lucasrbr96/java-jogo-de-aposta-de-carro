import java.io.Serializable;

public class Carro extends DesenhoMovel implements Serializable{
	
	private String nome;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Carro() {
		super();
	}
	
	public Carro(int x, int y, String path) {
		setX(x);
		setY(y);
		setImg(path);
	}
}
