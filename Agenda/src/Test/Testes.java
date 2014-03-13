package Test;

import Contato.*;
import Estrutura.*;

public class Testes {

	public static void main(String[] args) {
		
		Contato a = new Contato("Aurélio", "51 91839297");
		Contato b = new Contato("Maria Alencar", "51 33935677");
		Contato c = new Contato("Aaron", "51 82828282");
		Contato d = new Contato("Dilma da Silva", "51 91171171");
		Contato f = new Contato("Felizberto Tome da Cunha", "SEM TELEFONE");
		
		ListaDuplamenteEncadeada listaTelefonica = new ListaDuplamenteEncadeada();
		
		listaTelefonica.adicionaNoFim(f);
		listaTelefonica.adicionaNoFim(b);
		listaTelefonica.adicionaNoFim(c);
		listaTelefonica.adicionaNoFim(a);
		listaTelefonica.adicionaNoFim(a);
		listaTelefonica.adicionaNoFim(d);
		
		
		
		System.out.println(listaTelefonica.toString());
		
		
		
		

	}

}
