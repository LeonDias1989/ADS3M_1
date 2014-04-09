package Campo;

import java.util.Scanner;

public class UtilScan {

	private Scanner var = new Scanner(System.in);

	public int scanInt() {

		return var.nextInt();
	}

	public String scanString() {

		return var.next();
	}

}
