package arvore_bin;

public class ArvoreBin {

	public void inserir(Nodo n, int valor) {

		if (n.getDado() > valor) {

			if (n.getEsq() != null) {
				inserir(n.getEsq(), valor);
			} else {

				Nodo novoNodo = new Nodo(valor);
				n.setEsq(novoNodo);
			}
		} else if (n.getDado() < valor) {

			if (n.getDir() != null) {
				inserir(n.getDir(), valor);
			} else {

				Nodo novoNodo = new Nodo(valor);
				n.setDir(novoNodo);
			}
		}

	}

	public int getRaiz(Nodo n) {

		return n.getDado();
	}

	public void travessiaPre(Nodo no) {
		if (no != null) {
			System.out.print(no.getDado() + " ");
			travessiaPre(no.getEsq());
			travessiaPre(no.getDir());
		}
	}

	public void travessiaPos(Nodo no) {
		if (no != null) {
			travessiaPos(no.getEsq());
			travessiaPos(no.getDir());
			System.out.print(no.getDado() + " ");
		}
	}

	public void travessiaInf(Nodo no) {
		if (no != null) {
			travessiaPos(no.getEsq());
			System.out.print(no.getDado() + " ");
			travessiaPos(no.getDir());
		}
	}

}
