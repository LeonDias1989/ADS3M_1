package Campo;

import java.util.Random;

public class GeradoRandom {

	Random r = new Random();

	public int gerarNumero() {

		return r.nextInt(10);
	}

}
