package Test;

import Contato.Contato;
import Estrutura.ListaEncadeada;

public class Testes {

	public static void main(String[] args) {

		Contato a = new Contato("Aurélio", "51 91839297");
		Contato b = new Contato("Maria Alencar", "51 33935677");
		Contato c = new Contato("Aaron", "51 82828282");
		Contato d = new Contato("Dilma da Silva", "51 91171171");
		Contato f = new Contato("Felizberto Tome da Cunha", "SEM TELEFONE");

		ListaEncadeada<Contato> listaTelefonica = new ListaEncadeada<>();

		listaTelefonica.inserirNoFinal(b);
		listaTelefonica.inserirNoFinal(f);
		listaTelefonica.inserirNoFinal(d);
		listaTelefonica.inserirNoFinal(a);
		listaTelefonica.inserirNoFinal(c);

		System.out.println(listaTelefonica.toString());

	}

}
