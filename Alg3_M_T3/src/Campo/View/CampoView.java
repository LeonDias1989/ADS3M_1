package Campo.View;

import Campo.Controller.Campo;

public class CampoView {
	
	private String[] colunas = { "     ", "[ A ]", "[ B ]", "[ C ]", "[ D ]",
			"[ E ]", "[ F ]", "[ G ]", "[ H ]", "[ I ]", "[ J ]" };
	private String[] linhas = {"[ 0 ]", "[ 1 ]", "[ 2 ]", "[ 3 ]",
			"[ 4 ]", "[ 5 ]", "[ 6 ]", "[ 7 ]", "[ 8 ]", "[ 9 ]" };
	
	private Campo campo = new Campo();
	
	public Campo getCampo() {
		return campo;
	}
	
	public void telaUsuario() {

		for (int i = 0; i < colunas.length; i++) {
			System.out.print(colunas[i]);
		}
		System.out.println();

		for (int l = 0; l < campo.getCampo().length; l++) {
			System.out.print(linhas[l]);
			for (int c = 0; c < campo.getCampo().length; c++) {

				if (campo.getCampo()[l][c] == "[ O ]") {

					System.out.print("[ O ]");

				} else if (campo.getCampo()[l][c] == "[ - ]") {

					System.out.print("[ - ]");

				} else {

					System.out.print("[ . ]");
				}

			}
			System.out.println();
		}
	}
	
	public void mostrarCampo() {

		for (int i = 0; i < colunas.length; i++) {
			System.out.print(colunas[i]);
		}
		System.out.println();

		for (int i = 0; i < campo.getCampo().length; i++) {
			System.out.print(linhas[i]);
			for (int j = 0; j < campo.getCampo().length; j++) {

				if (campo.getCampo()[i][j] == null) {

					System.out.print("[ . ]");

				} else

					System.out.print(campo.getCampo()[i][j]);
			}
			System.out.println();
		}
	}

}
