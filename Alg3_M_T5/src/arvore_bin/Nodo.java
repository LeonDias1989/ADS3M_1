package arvore_bin;

public class Nodo {

	private int dado;
	private Nodo esq, dir, pai;

	public Nodo() {
		super();
	}

	public Nodo(int dado) {
		super();
		this.dado = dado;
	}

	public int getDado() {
		return dado;
	}

	public void setDado(int dado) {
		this.dado = dado;
	}

	public Nodo getEsq() {
		return esq;
	}

	public void setEsq(Nodo esq) {
		this.esq = esq;
	}

	public Nodo getDir() {
		return dir;
	}

	public void setDir(Nodo dir) {
		this.dir = dir;
	}

	public Nodo getPai() {
		return pai;
	}

	public void setPai(Nodo pai) {
		this.pai = pai;
	}

	@Override
	public String toString() {
		return "Dado:" + dado + ", Esq: " + esq + ", Dir: " + dir;
	}
	
	

}