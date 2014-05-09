package Campo.POJO;

public class Submarino extends Navio {

	public Submarino() {
		super();
		this.tamanhoL = 1;
		this.tamanhoC = 1;
		this.estrutura = new String[tamanhoL][tamanhoC];
		this.totalElementos = this.tamanhoL;
		this.mnemonic = "[SUB]";
	}

}
