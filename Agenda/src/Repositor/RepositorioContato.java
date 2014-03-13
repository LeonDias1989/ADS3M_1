package Repositor;

import java.io.IOException;

import Utilitarios.Arquivo;
import Contato.Contato;
import Estrutura.ListaDuplamenteEncadeada;


public class RepositorioContato {

	private ListaDuplamenteEncadeada listaTel;
	private Arquivo file;

	public RepositorioContato() {
		listaTel = new ListaDuplamenteEncadeada();
		file = new Arquivo();
	}

	public void addContato(Contato pessoa) throws IOException {

		listaTel.adicionaNoFim(pessoa);
		file.salvar(pessoa);
	}
	
	public static void main(String[] args) throws IOException {
		
		Contato c = new Contato("Adamastor", "123 456 789 10");
		Contato b = new Contato("Berisvaldo Jos� Antunes", "23 456 789 ");
		RepositorioContato rc = new RepositorioContato();
		
		rc.addContato(c);
		rc.addContato(b);
		System.out.println("ADD com Sucesso");
		
		
		
	}
	
	
	
	

}
