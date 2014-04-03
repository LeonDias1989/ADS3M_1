package Campo;

public class Principal {

	public static void main(String[] args) {

		Campo campo = new Campo();
		UtilScan us = new UtilScan();

		int pontos = 15;

		while (pontos > 0) {

			campo.telaUsuario();

			System.out.println("Linha: ");
			int linha = us.scanInt();
			System.out.println("Coluna: ");
			int coluna = us.scanInt();

			boolean condition = campo.atacar(linha, coluna);
			pontos--;

			System.out.println(condition);
			if (condition) {
				pontos += 3;
			}

		}
		campo.mostrarCampo();
		System.out.println("FIM DE JOGO");
	}
}
