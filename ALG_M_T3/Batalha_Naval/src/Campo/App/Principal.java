package Campo.App;

import Campo.View.CampoView;
import Campo.utils.UtilScan;

public class Principal {

	public static void main(String[] args) {

		CampoView campo = new CampoView();

		UtilScan us = new UtilScan();

		int pontos = 15;

		while (pontos > 0 || campo.getCampo().todosDestruidos()) {

			int linha, coluna = 0;
			campo.telaUsuario();

			System.out.println("Linha: ");
			linha = us.scanInt();
			System.out.println("Coluna: ");

			String letter = us.scanString();

			switch (letter) {
			case "a":
				coluna = 0;
				break;
			case "b":
				coluna = 1;
				break;
			case "c":
				coluna = 2;
				break;
			case "d":
				coluna = 3;
				break;
			case "e":
				coluna = 4;
				break;
			case "f":
				coluna = 5;
				break;
			case "g":
				coluna = 6;
				break;
			case "h":
				coluna = 7;
				break;
			case "i":
				coluna = 8;
				break;
			case "j":
				coluna = 9;
				break;
			default:
				break;
			}

			boolean condition = campo.getCampo().atacar(linha, coluna);
			pontos--;

			System.out.println("\nAcertou: " + condition);
			if (condition) {
				pontos += 3;
			}
			System.out.println("Pontos: " + pontos);
		}
		campo.mostrarCampo();
		System.out.println("FIM DE JOGO");
	}
}
