package Campo.POJO;

public class Destroyer extends Navio {

	public Destroyer() {
		super();
		this.tamanhoL = 4;
		this.tamanhoC = 4;
		this.estrutura = new String[tamanhoL][tamanhoC];
		this.totalElementos = this.tamanhoL;
		this.mnemonic = "[DES]";
	}

}
