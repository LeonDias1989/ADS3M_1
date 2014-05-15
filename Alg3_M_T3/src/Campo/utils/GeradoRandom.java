package Campo.utils;

import java.util.Random;

public class GeradoRandom {

	Random r = new Random();

	public int gerarNumero() {

		return r.nextInt(10);
	}

	public int gerarBin() {

		return r.nextInt(2);

	}

}
