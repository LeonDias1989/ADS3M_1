package Estrutura;
public class ListaDuplamenteEncadeada {

	private Nodo come�o;
	private Nodo fim;

	private int totalElementos = 0;

	public ListaDuplamenteEncadeada() {
		// Default Constructor
	}

	public void adicionaNoComeco(Object dado) {

		Nodo novo = new Nodo(dado);

		if (totalElementos == 0) {

			come�o = fim = novo;
		}

		novo.setProximo(come�o);
		come�o.setAnterior(novo);
		come�o = novo;

		totalElementos++;
	}

	public void adicionaNoFim(Object dado) {

		Nodo novo = new Nodo(dado);

		if (totalElementos == 0) {
			come�o = fim = novo;
		}

		fim.setProximo(novo);
		novo.setAnterior(fim);
		fim = novo;

		totalElementos++;

	}

	public Object removerNoFim() {

		if (totalElementos == 1) {
			Nodo aux = new Nodo();
			aux = fim;

			come�o = fim = null;

			totalElementos--;
			return aux;
		} else if (totalElementos > 0) {
			Nodo aux = new Nodo();
			aux = fim;
			fim = fim.getAnterior();
			totalElementos--;
			return aux;
		} else
			return null;
	}

	public Nodo removerNoComeco() {

		if (totalElementos == 1) {

			Nodo aux = new Nodo();
			aux = come�o;

			come�o = fim = null;
			totalElementos--;
			return aux;
		} else if (totalElementos > 0) {
			Nodo aux = new Nodo();
			aux = come�o;
			come�o = come�o.getProximo();

			totalElementos--;
			return aux;

		} else
			return null;
	}

	public Nodo getPrimeiroElemento() {
		return come�o;
	}

	public Nodo getUltimoElemento() {
		return fim;
	}

	public int getTotalElementos() {

		return this.totalElementos;
	}

	@Override
	public String toString() {
		if (totalElementos == 0)
			return ("[]");

		String s = "[";
		for (Nodo aux = come�o; aux != fim; aux = aux.getProximo()) {

			s += aux.getDado().toString() + ", ";
		}
		s += fim.getDado() + "]";

		return s;
	}

	public boolean contemElemento(Object dado) {

		for (Nodo i = come�o; i != null; i = i.getProximo()) {

			if (i.getDado().equals(dado)) {
				return true;
			}

		}
		return false;
	}

	private Nodo getElemento(int indice) {

		Nodo aux = come�o;

		if (indice >= totalElementos) {
			return null;
		}
		for (int i = 0; i < indice; i++) {

			aux = aux.getProximo();
		}
		return aux;
	}

	public void addPorIndice(int indice, Object dado) {
		if (indice == 0) {
			adicionaNoComeco(dado);
		} else if (indice == totalElementos) {
			adicionaNoFim(dado);
		} else {

			Nodo novo = new Nodo(dado);

			Nodo anterior = this.getElemento(indice - 1);
			Nodo proxima = anterior.getProximo();

			novo.setProximo(anterior.getProximo());
			novo.setAnterior(anterior);
			anterior.setProximo(novo);
			proxima.setAnterior(novo);
			totalElementos++;
		}
	}

	// /////////////////////M�TODOS ESPECIAIS///////////////////////////

	public ListaDuplamenteEncadeada reverter() {

		ListaDuplamenteEncadeada listAux = new ListaDuplamenteEncadeada();

		for (Nodo i = fim; i != come�o; i = i.getAnterior()) {

			listAux.adicionaNoFim(i.getDado());

		}
		listAux.adicionaNoFim(come�o.getDado());
		return listAux;

	}

	public ListaDuplamenteEncadeada subList(int primeiraPos, int ultimaPos)
			throws NullPointerException {
		ListaDuplamenteEncadeada cell = new ListaDuplamenteEncadeada();

		for (Nodo i = come�o; i != fim; i = i.getProximo()) {

			cell.adicionaNoFim(i.getDado());

		}
		cell.adicionaNoFim(fim.getDado());

		if (ultimaPos >= totalElementos) {

			System.out
					.println("ERRO, a posi�� final � maior do que o tamanho da lista !.");
		}
		ListaDuplamenteEncadeada novaSublista = new ListaDuplamenteEncadeada();

		for (int i = 0; i < primeiraPos; i++) {
			cell.come�o = cell.come�o.getProximo();
		}

		for (int j = primeiraPos; j <= ultimaPos; j++) {
			novaSublista.adicionaNoFim(cell.come�o.getDado());
			cell.come�o = cell.come�o.getProximo();
		}
		return novaSublista;
	}

}