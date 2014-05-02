package Contato;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Contato implements Comparable<Contato>, Serializable {

	private String nome;
	private String telefone;

	public Contato(String nome, String telefone) {
		super();
		this.nome = nome;
		this.telefone = telefone;
	}

	public Contato() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return nome + " Telefone: " + telefone;
	}

	@Override
	public int compareTo(Contato o) {
		return nome.compareTo(o.getNome());
	}

}
