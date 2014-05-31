package arvore_bin;

public class ArvoreBinaria<T extends Comparable<T>> {

	public ArvoreBinaria() {
		super();

	}

	public void inserir(Nodo<T> n, T valor) {

		int compare = n.getDado().compareTo(valor);

		if (compare > 0) {

			if (n.getEsq() != null) {
				inserir(n.getEsq(), valor);
			} else {

				Nodo<T> novoNodo = new Nodo<>(valor);
				n.setEsq(novoNodo);
			}
		} else if (compare < 0) {

			if (n.getDir() != null) {
				inserir(n.getDir(), valor);
			} else {

				Nodo<T> novoNodo = new Nodo<>(valor);
				n.setDir(novoNodo);
			}
		}

	}

	public T getRaiz(Nodo<T> nodo) {

		return nodo.getDado();
	}

	public void travessiaPre(Nodo<T> nodo) {
		if (nodo != null) {

			nodo.imprimePrefixa();
		}
	}

	public void travessiaPos(Nodo<T> nodo) {
		if (nodo != null) {

			nodo.imprimePosFixa();
		}
	}

	public void travessiaInf(Nodo<T> nodo) {
		if (nodo != null) {
			nodo.imprimeInfixa();
		}
	}

}
