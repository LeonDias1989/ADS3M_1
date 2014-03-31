package Campo;

public class Campo {

	private String[][] campo = new String[10][10];
	private String[] colunas = { "     ", "[ A ]", "[ B ]", "[ C ]", "[ D ]",
			"[ E ]", "[ F ]", "[ G ]", "[ H ]", "[ I ]", "[ J ]" };

	public Campo() {
		inicarCampo();
	}

	public void telaUsuario() {

		for (int i = 0; i < colunas.length; i++) {
			System.out.print(colunas[i]);
		}
		System.out.println();

		for (int l = 0; l < campo.length; l++) {
			System.out.print("[ " + l + " ]");
			for (int c = 0; c < campo.length; c++) {

				if (campo[l][c] == "[ O ]") {

					System.out.print("[ O ]");

				} else if (campo[l][c] == "[ - ]") {

					System.out.print("[ - ]");

				} else {

					System.out.print("[ . ]");
				}

			}
			System.out.println();
		}
	}

	private void inicarCampo() {

		GeradoRandom gr = new GeradoRandom();

		int countSubmarino = 0;
		int countTorped = 0;
		int countFragata = 0;
		int countDestroyer = 0;
		int countPortAvioes = 0;

		int linha, coluna;

		for (int i = 0; i < campo.length; i++) {
			for (int j = 0; j < campo.length; j++) {

				linha = gr.gerarNumero();
				coluna = gr.gerarNumero();

				if (campo[linha][coluna] == null && countSubmarino < 5) {

					campo[linha][coluna] = "[Sub]";
					countSubmarino++;

				} else if (campo[linha][coluna] == null && countTorped < 3) {

					campo[linha][coluna] = "[TOP]";

					countTorped++;
				} else if (campo[linha][coluna] == null && countFragata < 2) {

					campo[linha][coluna] = "[FRA]";

					countFragata++;
				} else if (campo[linha][coluna] == null && countDestroyer < 2) {

					campo[linha][coluna] = "[DES]";

					countDestroyer++;
				} else if (campo[linha][coluna] == null && countPortAvioes < 1) {

					campo[linha][coluna] = "[POR]";

					countPortAvioes++;
				}
			}

		}
	}

	/** show the field open to user */
	public void mostrarCampo() {

		for (int i = 0; i < colunas.length; i++) {
			System.out.print(colunas[i]);
		}
		System.out.println();

		for (int i = 0; i < campo.length; i++) {
			System.out.print("[ " + i + " ]");
			for (int j = 0; j < campo.length; j++) {

				if (campo[i][j] == null) {

					System.out.print("[ . ]");

				} else

					System.out.print(campo[i][j]);
			}
			System.out.println();
		}
	}

	public boolean atacar(int linha, int coluna) {

		boolean flag = false;

		for (int i = 0; i < campo.length; i++) {
			for (int j = 0; j < campo.length; j++) {
				if (linha == i && coluna == j) {

					if (campo[linha][coluna] != null) {
						flag = true;
						campo[i][j] = "[ O ]";
					} else {
						flag = false;
						campo[i][j] = "[ - ]";
					}
				}
			}
		}
		return flag;

	}
	
	/*
	 * TODO
	 * OS NAVIOS ESTÃO EM SEUS TOTAIS E NÃO EM SUAS QUANTIDADES, 
	 * POR EXEMPLO: O TORPEDO OCUPA DUAS POSIÇÕES, LOGO O VALOR TOTAL MUDARÁ
	 * 2 DE TORPEDOS, SENDO QUE TEM 3 TORPEDOS LOGO O RESULTADO É 6
	 * CONCLUINDO: 
	 * A VALIDAÇÃO NÃO SERÁ COM O NÚMERO 13 E SIM COM O NÚMERO: 30**/
	public boolean todosDestruidos(){
		
		int count = 0;
		
		for (int i = 0; i < campo.length; i++) {
			for (int j = 0; j < campo.length; j++) {
				if (campo[i][j] == "[ O ]" ) {
					count++;
				}
			}
		}
		//TODO VALIDAR DEPOIS COM O NÚMERO 30
		if (count==13) {
			return true;
		}else
			return false;
		
		
	}

}
