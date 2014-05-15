package Campo.POJO;

public class Fragata extends Navio {

	public Fragata() {
		super();
		this.tamanhoL = 3;
		this.tamanhoC = 3;
		this.estrutura = new String[tamanhoL][tamanhoC];
		this.totalElementos = this.tamanhoL;
		this.mnemonic = "[FRA]";
	}

}
