import java.awt.Graphics;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class Principal extends JFrame implements Serializable{

	private Carro carro;
	private Carro carro2;
	private Estrada pista;
	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	public Carro getCarro2() {
		return this.carro2;
	}

	public void setCarro2(Carro carro2) {
		this.carro2 = carro2;
	}
	
	public static void main(String[] args) throws IOException {
		 new Principal();
	}
	
	public Principal() {
		this.setSize(1050, 720);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //encerra a principal ao fechar		
		pista = new Estrada(0, 250, "estrada.jpg");
		carro = new Carro(0, 370, "vermelho.jpg");
		carro.setNome("Ferrari");
		carro2 = new Carro(0, 240, "preto.jpg");
		carro2.setNome("Bugati");
		new Mover().start();
		
	}
	
	public class Mover extends Thread{
		public void run(){
			
			while(true){
				try {sleep(20);} catch(Exception erro){}
				try {
					carro.moverDireita(carro);
				} catch (LinhaDeChegadaException e) {
					System.out.println("Vencedor: " + e.getCarro().getNome());
					break;
				}
				try {
					carro2.moverDireita(carro2);
				} catch (LinhaDeChegadaException e) {
					System.out.println("Vencedor: " + e.getCarro().getNome());
					break;
				}
			}
		}
	}
		
		public void paint(Graphics g) {
		g.drawImage(pista.getImg(), pista.getX(), pista.getY(), null);
		g.drawImage(getCarro().getImg(), getCarro().getX(), getCarro().getY(), null);
		g.drawImage(getCarro2().getImg(), carro2.getX(), carro2.getY(), null);
		repaint();
		}
		
  }