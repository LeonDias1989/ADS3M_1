package busca_binaria;

public class ListaEncadeada<T> {

	private Nodo<T> cabeca;
	private Nodo<T> cauda;
	private int totalElementos;

	public ListaEncadeada() {
		super();
		this.cabeca = null;
		this.cauda = null;
		this.totalElementos = 0;
	}

	public Nodo<T> getCabeca() {
		return cabeca;
	}

	public void setCabeca(Nodo<T> cabeca) {
		this.cabeca = cabeca;
	}

	public Nodo<T> getCauda() {
		return cauda;
	}

	public void setCauda(Nodo<T> cauda) {
		this.cauda = cauda;
	}

	public int getTotalElementos() {
		return totalElementos;
	}

	public void setTotalElementos(int totalElementos) {
		this.totalElementos = totalElementos;
	}

	public Nodo<T> inserirNoComeco(T elemento) {

		Nodo<T> novoElemento = new Nodo<>(elemento);

		if (totalElementos == 0) {
			cabeca = cauda = novoElemento;
		}

		novoElemento.setProximo(cabeca);
		cabeca.setAnterior(novoElemento);
		cabeca = novoElemento;

		totalElementos++;

		return novoElemento;
	}

	public Nodo<T> inserirNoFinal(T elemento) {

		Nodo<T> novoElemento = new Nodo<>(elemento);

		if (totalElementos == 0) {
			cabeca = cauda = novoElemento;
		}

		novoElemento.setAnterior(cauda);
		cauda.setProximo(novoElemento);
		cauda = novoElemento;

		totalElementos++;
		return novoElemento;
	}

	public void inserirPorIndice(int indice, T elemento) {
		if (indice == 0) {
			inserirNoComeco(elemento);
		} else if (indice == totalElementos) {
			inserirNoFinal(elemento);
		} else {

			Nodo<T> novoElemento = new Nodo<>(elemento);

			Nodo<T> anterior = this.getElemento(indice - 1);
			Nodo<T> proxima = this.getElemento(indice);

			novoElemento.setProximo(proxima);
			anterior.setProximo(novoElemento);
			totalElementos++;
		}
	}

	// TODO create method inserirPorIndice(index, element);

	public Nodo<T> removerDoInicio() {

		if (totalElementos == 1) {
			Nodo<T> auxiliar = new Nodo<>();

			auxiliar = cabeca;
			cabeca = cauda = null;
			totalElementos--;

			return auxiliar;
		} else if (totalElementos > 0) {

			Nodo<T> auxiliar = new Nodo<>();

			auxiliar = cabeca;

			cabeca.getProximo().setAnterior(null);
			cabeca = cabeca.getProximo();
			totalElementos--;
			return auxiliar;
		} else {
			return null;
		}

	}

	public Nodo<T> removerDoFinal() {

		if (totalElementos == 1) {

			Nodo<T> auxiliar = new Nodo<>();

			auxiliar = cauda;

			cauda = cabeca = null;
			totalElementos--;

			return auxiliar;

		} else if (totalElementos > 1) {

			Nodo<T> auxiliar = new Nodo<>();

			auxiliar = cauda;
			cauda.getAnterior().setProximo(null);
			cauda = cauda.getAnterior();
			totalElementos--;

			return auxiliar;
		} else {
			return null;
		}

	}

	// TODO create method removerPorIndice(index, element);
	public T trocar(T novoElemento, T elementoAnterior) {

		Nodo<T> auxiliar = cabeca;

		for (int i = 0; i < totalElementos; i++) {

			if (auxiliar.getDado().equals(elementoAnterior)) {
				auxiliar.setDado(novoElemento);
			}
			auxiliar = auxiliar.getProximo();
		}

		return novoElemento;
	}

	public boolean contemElemento(T elemento) {

		Nodo<T> i;

		for (i = cabeca; i != null; i = i.getProximo()) {

			if (i.getDado().equals(elemento)) {
				return true;
			}
		}
		return false;
	}

	public Nodo<T> getElemento(int indice) {

		Nodo<T> auxiliar = cabeca;

		if (indice >= totalElementos) {
			return null;
		}

		for (int i = 0; i < indice; i++) {

			auxiliar = auxiliar.getProximo();
		}

		return auxiliar;
	}

	@Override
	public String toString() {
		if (totalElementos == 0) {
			return "[]";
		}

		String s = "[";
		for (Nodo<T> aux = cabeca; aux != cauda; aux = aux.getProximo()) {

			s += aux.getDado() + ", ";
		}
		s += cauda.getDado();
		s += "]";
		return s;
	}

}
