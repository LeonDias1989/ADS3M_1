package arvore_bin.numeros_inteiros;

public class ArvoreBin {

	public void inserir(NodoDadoInteiro n, int valor) {

		if (n.getDado() > valor) {

			if (n.getEsq() != null) {
				inserir(n.getEsq(), valor);
			} else {

				NodoDadoInteiro novoNodo = new NodoDadoInteiro(valor);
				n.setEsq(novoNodo);
			}
		} else if (n.getDado() < valor) {

			if (n.getDir() != null) {
				inserir(n.getDir(), valor);
			} else {

				NodoDadoInteiro novoNodo = new NodoDadoInteiro(valor);
				n.setDir(novoNodo);
			}
		}

	}

	public int getRaiz(NodoDadoInteiro n) {

		return n.getDado();
	}

	public void travessiaPre(NodoDadoInteiro no) {
		if (no != null) {
			System.out.print(no.getDado() + " ");
			travessiaPre(no.getEsq());
			travessiaPre(no.getDir());
		}
	}

	public void travessiaPos(NodoDadoInteiro no) {
		if (no != null) {
			travessiaPos(no.getEsq());
			travessiaPos(no.getDir());
			System.out.print(no.getDado() + " ");
		}
	}

	public void travessiaInf(NodoDadoInteiro no) {
		if (no != null) {
			travessiaPos(no.getEsq());
			System.out.print(no.getDado() + " ");
			travessiaPos(no.getDir());
		}
	}

}
