package Campo.POJO;

public class Torpedeiro extends Navio {

	public Torpedeiro() {
		super();
		this.tamanhoL = 2;
		this.tamanhoC = 2;
		this.estrutura = new String[tamanhoL][tamanhoC];
		this.totalElementos = this.tamanhoL;
		this.mnemonic = "[TOP]";
	}

}
