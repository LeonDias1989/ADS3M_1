package Repositor;

import java.io.IOException;

import Utilitarios.Arquivo;
import Contato.Contato;
import Estrutura.ListaEncadeada;

public class RepositorioContato {

	private ListaEncadeada<Contato> listaTel;
	private Arquivo file;

	public RepositorioContato() {
		listaTel = new ListaEncadeada<>();
		file = new Arquivo();
	}

	public void addContato(Contato pessoa) throws IOException {

		listaTel.inserirNoFinal(pessoa);
		file.salvar(pessoa);
	}

	public ListaEncadeada<Contato> getListaTel() {
		return listaTel;
	}

}
