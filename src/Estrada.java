import java.io.Serializable;

public class Estrada extends DesenhoMovel implements Serializable{
		public Estrada() {
			super();
		}
		
		public Estrada(int x, int y, String path) {
			setX(x);
			setY(y);
			setImg(path);
		}
	}
