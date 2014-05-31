package arvore_bin;

public class Nodo<T extends Comparable<T>> {

	private T dado;
	private Nodo<T> esq, dir, pai;

	public Nodo(T dado) {
		super();
		this.dado = dado;
	}

	public T getDado() {
		return dado;
	}

	public void setDado(T dado) {
		this.dado = dado;
	}

	public Nodo<T> getEsq() {
		return esq;
	}

	public void setEsq(Nodo<T> esq) {
		this.esq = esq;
	}

	public Nodo<T> getDir() {
		return dir;
	}

	public void setDir(Nodo<T> dir) {
		this.dir = dir;
	}

	public Nodo<T> getPai() {
		return pai;
	}

	public void setPai(Nodo<T> pai) {
		this.pai = pai;
	}

	public void imprimePrefixa() {

		System.out.print("(" + dado);
		if (esq != null) {
			esq.imprimePrefixa();
		} else
			System.out.print("()");

		if (dir != null) {
			dir.imprimePrefixa();
		} else
			System.out.print("()");
		System.out.print(")");
	}

	public void imprimePosFixa() {

		if (esq != null) {
			esq.imprimePosFixa();
		} else
			System.out.print("()");

		if (dir != null) {
			dir.imprimePosFixa();
		} else
			System.out.print("()");

		System.out.print(dado + ")");
	}

	public void imprimeInfixa() {

		if (esq != null) {
			esq.imprimeInfixa();
		} else
			System.out.print("()");

		System.out.print(dado);

		if (dir != null) {
			dir.imprimeInfixa();
		} else
			System.out.print("()");
	}
}
