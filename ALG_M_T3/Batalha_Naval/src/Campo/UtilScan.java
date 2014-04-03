package Campo;

import java.util.Scanner;

public class UtilScan {

	private Scanner var = new Scanner(System.in);

	public UtilScan() {
		// TODO Auto-generated constructor stub
	}

	public int scanInt() {

		return var.nextInt();
	}

	public String scanString() {

		return var.next();
	}

}
