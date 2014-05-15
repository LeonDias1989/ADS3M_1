package Campo.POJO;

public class PortaAviao extends Navio {

	public PortaAviao() {
		super();
		this.tamanhoL = 5;
		this.tamanhoC = 5;
		this.estrutura = new String[tamanhoL][tamanhoC];
		this.totalElementos = this.tamanhoL;
		this.mnemonic = "[POA]";
	}

}
