package Test;

import Contato.*;
import Estrutura.*;

public class Testes {

	public static void main(String[] args) {
		
		Contato a = new Contato("Aur�lio", "51 91839297");
		Contato b = new Contato("Maria Alencar", "51 33935677");
		Contato c = new Contato("Aaron", "51 82828282");
		Contato d = new Contato("Dilma da Silva", "51 91171171");
		Contato f = new Contato("Felizberto Tome da Cunha", "SEM TELEFONE");
		
		ListaDuplamenteEncadeada listaTelefonica = new ListaDuplamenteEncadeada();
		ListaDuplamenteEncadeada listaTelefonica2 = new ListaDuplamenteEncadeada();
		
		

		listaTelefonica.adicionaNoFim(b);
		listaTelefonica.adicionaNoFim(f);
		listaTelefonica.adicionaNoFim(d);
		listaTelefonica.adicionaNoFim(a);
		listaTelefonica.adicionaNoFim(c);
		
//		listaTelefonica.adicionaNoFim("Z");
//		listaTelefonica.adicionaNoFim("Y");
//		listaTelefonica.adicionaNoFim("W");
//		listaTelefonica.adicionaNoFim("X");
//		listaTelefonica.adicionaNoFim("V");
//		listaTelefonica.adicionaNoFim("U");
//		listaTelefonica.adicionaNoFim("T");
//		listaTelefonica.adicionaNoFim("S");
//		listaTelefonica.adicionaNoFim("R");
//		listaTelefonica.adicionaNoFim("Q");
//		listaTelefonica.adicionaNoFim("P");
//		listaTelefonica.adicionaNoFim("O");
//		listaTelefonica.adicionaNoFim("N");
//		listaTelefonica.adicionaNoFim("M");
//		listaTelefonica.adicionaNoFim("L");
//		listaTelefonica.adicionaNoFim("K");
//		listaTelefonica.adicionaNoFim("J");
//		listaTelefonica.adicionaNoFim("I");
//		listaTelefonica.adicionaNoFim("H");
//		listaTelefonica.adicionaNoFim("G");
//		listaTelefonica.adicionaNoFim("F");
//		listaTelefonica.adicionaNoFim("E");
//		listaTelefonica.adicionaNoFim("D");
//		listaTelefonica.adicionaNoFim("C");
//		listaTelefonica.adicionaNoFim("B");
//		listaTelefonica.adicionaNoFim("A");
		
		listaTelefonica2 = listaTelefonica.bubbleSortNewList(); 
		
		System.out.println("Exibindo elementos Desordenados: ");
		System.out.println(listaTelefonica.toString());
		
		System.out.println("\nExibindo elementos Ordenados: ");
		System.out.println(listaTelefonica2.toString());
		
		
		
		

	}

}
