package exercicio2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class CrudPessoa extends JFrame implements ActionListener {

	private JButton novo, editar, remover;
	private JList<String> pessoas;
	private JPanel painelBotoes;

	public CrudPessoa() {
		super("Crud de Pessoas");

		iniciarComponentes();

		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	private void iniciarComponentes() {

		novo = new JButton("Novo");

		novo.addActionListener(this);

		editar = new JButton("Editar");
		remover = new JButton("Remover");
		painelBotoes = new JPanel(new FlowLayout());

		painelBotoes.add(novo);
		painelBotoes.add(editar);
		painelBotoes.add(remover);

		getContentPane().add(painelBotoes, BorderLayout.SOUTH);

		pessoas = new JList<>();
		getContentPane().add(pessoas, BorderLayout.NORTH);

	}

	public JList<String> getPessoas() {

		return pessoas;
	}
	
	public void setPessoas(JList<String> pessoas) {
		this.pessoas = pessoas;
	}

	public static void main(String[] args) {
		new CrudPessoa();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == novo) {
			new FormularioPessoa();
			this.setVisible(false);
		}

	}

}
