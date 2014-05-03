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

	public void bubbleSort() {

		for (int i = 0; i < totalElementos; i++) {
			for (int j = i + 1; j < totalElementos; j++) {

				Object x = getElemento(i).getDado();
				Object y = getElemento(j).getDado();

				int comparacao = ((Comparable) x).compareTo((Comparable) y);

				if (comparacao > 0) {

					Object aux2 = getElemento(j).getDado();
					getElemento(j).setDado(getElemento(i).getDado());
					getElemento(i).setDado((T) aux2);
				}
			}
		}
	}

	public boolean buscaBinaria(ListaEncadeada<T> lista, String nome) {

		boolean achou = false;
		int alto = lista.getTotalElementos() - 1;
		int baixo = 0;
		int meio = alto / 2;

		while ((achou == false) && alto >= baixo) {

			if (((String) lista.getElemento(meio).getDado()).compareTo(nome) == 0) {
				achou = true;
			} else if (((String) lista.getElemento(meio).getDado())
					.compareTo(nome) > 0) {
				alto = meio - 1;
			} else {
				baixo = meio + 1;
			}
			meio = (alto + baixo) / 2;
		}

		return achou;
	}
	/**Teste para busca bin�ria, este algoritmo tamb�m cont�m no trabalho 1 
	 * e faz a busca bin�ria para um Contato da lista telef�nica na classe RepositorioContato*/
	public static void main(String[] args) {

		ListaEncadeada<String> lista = new ListaEncadeada<>();

		lista.inserirNoFinal("A");
		lista.inserirNoFinal("B");
		lista.inserirNoFinal("C");
		lista.inserirNoFinal("D");
		lista.inserirNoFinal("E");
		lista.inserirNoFinal("F");
		lista.inserirNoFinal("G");
		lista.inserirNoFinal("H");
		lista.inserirNoFinal("I");
		lista.inserirNoFinal("J");

		System.out.println(lista.buscaBinaria(lista, "A"));
		System.out.println(lista.buscaBinaria(lista, "D"));
		System.out.println(lista.buscaBinaria(lista, "S"));
		System.out.println(lista.buscaBinaria(lista, "X"));

	}

}