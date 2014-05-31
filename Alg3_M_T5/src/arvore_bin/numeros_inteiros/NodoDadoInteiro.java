package arvore_bin.numeros_inteiros;

public class NodoDadoInteiro {

	private int dado;
	private NodoDadoInteiro esq, dir, pai;

	public NodoDadoInteiro() {
		super();
	}

	public NodoDadoInteiro(int dado) {
		super();
		this.dado = dado;
	}

	public int getDado() {
		return dado;
	}

	public void setDado(int dado) {
		this.dado = dado;
	}

	public NodoDadoInteiro getEsq() {
		return esq;
	}

	public void setEsq(NodoDadoInteiro esq) {
		this.esq = esq;
	}

	public NodoDadoInteiro getDir() {
		return dir;
	}

	public void setDir(NodoDadoInteiro dir) {
		this.dir = dir;
	}

	public NodoDadoInteiro getPai() {
		return pai;
	}

	public void setPai(NodoDadoInteiro pai) {
		this.pai = pai;
	}

	@Override
	public String toString() {
		return "Dado:" + dado + ", Esq: " + esq + ", Dir: " + dir;
	}
	
	

}
