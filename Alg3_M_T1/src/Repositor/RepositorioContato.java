package Repositor;

import Contato.Contato;
import Estrutura.ListaEncadeada;

public class RepositorioContato {

	private ListaEncadeada<Contato> lista;

	public RepositorioContato() {
		lista = new ListaEncadeada<>();
	}

	public ListaEncadeada<Contato> getLista() {
		return lista;
	}

	public Contato adicionar(Contato contato) {

		lista.inserirNoFinal(contato);
		ordenar();
		return contato;
	}

	public boolean buscaBinaria(ListaEncadeada<Contato> lista, String nome) {

		boolean achou = false;
		int alto = lista.getTotalElementos() - 1;
		int baixo = 0;
		int meio = alto / 2;

		while ((achou == false) && alto >= baixo) {

			if (lista.getElemento(meio).getDado().getNome().compareTo(nome) == 0) {
				achou = true;

			} else if (lista.getElemento(meio).getDado().getNome()
					.compareTo(nome) > 0) {
				alto = meio - 1;

			} else {
				baixo = meio + 1;
			}
			meio = (alto + baixo) / 2;
		}

		return achou;
	}

	public void ordenar() {

		for (int i = 0; i < lista.getTotalElementos(); i++) {
			for (int j = i + 1; j < lista.getTotalElementos(); j++) {

				String x = lista.getElemento(i).getDado().getNome();
				String y = lista.getElemento(j).getDado().getNome();

				int comparacao = ((String) x).compareTo((String) y);

				if (comparacao > 0) {

					Contato aux2 = lista.getElemento(j).getDado();
					lista.getElemento(j)
							.setDado(lista.getElemento(i).getDado());
					lista.getElemento(i).setDado(aux2);
				}
			}
		}
	}

	public static void main(String[] args) {

		RepositorioContato lista = new RepositorioContato();

		lista.adicionar(new Contato("Pitagoras", "51-85858585"));
		lista.adicionar(new Contato("J.Alencar", "51-84848484"));
		lista.adicionar(new Contato("Endom�trio", "51-91919191"));
		lista.adicionar(new Contato("Bartolomeu", "51-81818181"));
		lista.adicionar(new Contato("Leon", "51-85314027"));
		lista.adicionar(new Contato("Dante", "51-96666666"));
		lista.adicionar(new Contato("Cristhoper", "51-33343536"));
		lista.adicionar(new Contato("Fun�ria", "51-99999999"));
		
		System.out.println(lista.getLista());
		System.out.println(lista.buscaBinaria(lista.getLista(), "Adailton"));
		System.out.println(lista.buscaBinaria(lista.getLista(), "Fun�ria"));
	}

}
