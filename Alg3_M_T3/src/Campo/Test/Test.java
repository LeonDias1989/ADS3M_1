package Campo.Test;

import Campo.View.CampoView;

public class Test {

	public static void main(String[] args) {

		CampoView[] cv = new CampoView[10];

		for (int i = 0; i < cv.length; i++) {
			cv[i] = new CampoView();
			cv[i].mostrarCampo();
			System.out.println("\n");
		}

	}

}
