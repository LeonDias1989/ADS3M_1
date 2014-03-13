package Estrutura;

public class ListaDuplamenteEncadeada {

	protected Nodo comeco;
	protected Nodo fim;

	protected int totalElementos = 0;

	public ListaDuplamenteEncadeada() {
		// Default Constructor
	}

	public void adicionaNoComeco(Object dado) {

		Nodo novo = new Nodo(dado);

		if (totalElementos == 0) {

			comeco = fim = novo;
		}

		novo.setProximo(comeco);
		comeco.setAnterior(novo);
		comeco = novo;

		totalElementos++;
	}

	public void adicionaNoFim(Object dado) {

		Nodo novo = new Nodo(dado);

		if (totalElementos == 0) {
			comeco = fim = novo;
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

			comeco = fim = null;

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
			aux = comeco;

			comeco = fim = null;
			totalElementos--;
			return aux;
		} else if (totalElementos > 0) {
			Nodo aux = new Nodo();
			aux = comeco;
			comeco = comeco.getProximo();

			totalElementos--;
			return aux;

		} else
			return null;
	}

	public Nodo getPrimeiroElemento() {
		return comeco;
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
		for (Nodo aux = comeco; aux != fim; aux = aux.getProximo()) {

			s += aux.getDado().toString() + ", ";
		}
		s += fim.getDado() + "]";

		return s;
	}

	public boolean contemElemento(Object dado) {

		for (Nodo i = comeco; i != null; i = i.getProximo()) {

			if (i.getDado().equals(dado)) {
				return true;
			}

		}
		return false;
	}

	protected Nodo getElemento(int indice) {

		Nodo aux = comeco;

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

		for (Nodo i = fim; i != comeco; i = i.getAnterior()) {

			listAux.adicionaNoFim(i.getDado());

		}
		listAux.adicionaNoFim(comeco.getDado());
		return listAux;

	}

	public ListaDuplamenteEncadeada subList(int primeiraPos, int ultimaPos)
			throws NullPointerException {
		ListaDuplamenteEncadeada cell = new ListaDuplamenteEncadeada();

		for (Nodo i = comeco; i != fim; i = i.getProximo()) {

			cell.adicionaNoFim(i.getDado());

		}
		cell.adicionaNoFim(fim.getDado());

		if (ultimaPos >= totalElementos) {

			System.out
					.println("ERRO, a posi�� final � maior do que o tamanho da lista !.");
		}
		ListaDuplamenteEncadeada novaSublista = new ListaDuplamenteEncadeada();

		for (int i = 0; i < primeiraPos; i++) {
			cell.comeco = cell.comeco.getProximo();
		}

		for (int j = primeiraPos; j <= ultimaPos; j++) {
			novaSublista.adicionaNoFim(cell.comeco.getDado());
			cell.comeco = cell.comeco.getProximo();
		}
		return novaSublista;
	}
	
	public ListaDuplamenteEncadeada bubbleSortNewList() {

		ListaDuplamenteEncadeada listAux = new ListaDuplamenteEncadeada();

		for (Nodo i = comeco; i != fim; i = i.getProximo()) {

			listAux.adicionaNoComeco(i.getDado());
		}
		listAux.adicionaNoComeco(fim.getDado());

		for (int i = 0; i < totalElementos; i++) {
			for (int j = i + 1; j < totalElementos; j++) {

				String a = listAux.getElemento(i).getDado().toString();
				String b = listAux.getElemento(j).getDado().toString();

				int result = a.compareTo(b);

				if (result > 0) {

					Object aux = listAux.getElemento(i).getDado();
					listAux.getElemento(i).setDado(
							listAux.getElemento(j).getDado());
					listAux.getElemento(j).setDado(aux);
				}

			}

		}
		return listAux;

	}



}
