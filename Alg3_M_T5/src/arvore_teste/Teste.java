package arvore_teste;

import arvore_bin.numeros_inteiros.ArvoreBin;
import arvore_bin.numeros_inteiros.NodoDadoInteiro;

public class Teste {
	
	public static void main(String[] args) {

		NodoDadoInteiro n = new NodoDadoInteiro(3);

		ArvoreBin ab = new ArvoreBin();

		ab.inserir(n, 3);
		ab.inserir(n, 5);
		ab.inserir(n, 2);
		ab.inserir(n, 7);
		ab.inserir(n, 4);

		ab.travessiaPre(n);

	}

}
