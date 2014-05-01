package exercicio2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class FormularioPessoa extends JFrame implements ActionListener {

	private JLabel nome, idade;
	private JTextField textoNome, textoIdade;
	private JButton ok, cancelar;
	private JPanel painelBotoes, painelForms;

	public FormularioPessoa() {
		super("Formulário Pessoa");

		iniciarComponentes();

		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	private void iniciarComponentes() {

		nome = new JLabel("Nome");
		idade = new JLabel("Idade");
		textoNome = new JTextField();
		textoIdade = new JTextField();

		ok = new JButton("OK");
		cancelar = new JButton("Cancelar");

		painelBotoes = new JPanel(new FlowLayout());
		painelForms = new JPanel(new GridLayout(2, 2));

		painelForms.add(nome);
		painelForms.add(textoNome);
		painelForms.add(idade);
		painelForms.add(textoIdade);

		painelBotoes.add(ok);
		painelBotoes.add(cancelar);
		cancelar.addActionListener(this);

		getContentPane().add(painelBotoes, BorderLayout.SOUTH);
		getContentPane().add(painelForms, BorderLayout.NORTH);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cancelar) {
			new CrudPessoa();
			this.setVisible(false);
		}

		if (e.getSource() == ok) {
			// TODO
		}

	}

}
