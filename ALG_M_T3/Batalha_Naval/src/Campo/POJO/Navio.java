package Campo.POJO;

public class Navio {

	protected String[][] estrutura;
	protected int tamanhoL, tamanhoC, totalElementos;
	protected boolean horizontal;
	protected String mnemonic;

	public Navio() {
		super();
		estrutura = new String[tamanhoL][tamanhoC];
		horizontal = true;
	}

	public String[][] getEstrutura() {
		return estrutura;
	}

	public void setEstrutura(String[][] estrutura) {
		this.estrutura = estrutura;
	}

	public boolean isHorizontal() {
		return horizontal;
	}

	public void setHorizontal(boolean horizontal) {
		this.horizontal = horizontal;
	}

	public int getTamanho() {

		return tamanhoL * tamanhoC;
	}

	public String getMnemonic() {
		return mnemonic;
	}

	public void preencher() {

		if (isHorizontal()) {
			for (int i = 0; i < estrutura.length; i++) {

				for (int j = 0; j < estrutura.length; j++) {

					if (i == 0) {
						getEstrutura()[i][j] = mnemonic;
					}

				}
			}
		} else {
			for (int i = 0; i < getEstrutura().length; i++) {

				for (int j = 0; j < getEstrutura().length; j++) {

					if (j == 0) {
						getEstrutura()[i][j] = mnemonic;
					}
				}
			}
		}
	}

	public void imprimir() {

		for (int i = 0; i < estrutura.length; i++) {

			for (int j = 0; j < estrutura.length; j++) {
				System.out.print(estrutura[i][j] + " ");
			}
			System.out.println();
		}

	}

}
