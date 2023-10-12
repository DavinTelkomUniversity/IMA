import java.util.Scanner;

import java.util.Scanner;

public class TP01 {

	public static void main(final String[] args) {
		Scanner s = new Scanner(System.in);
        int nilai = s.nextInt();
		int kelipatan = 6;
		if (nilai % kelipatan == 0) {
			System.out.println("Kelipatan enam");
		} else {
			System.out.println("Bukan kelipatan enam");
		}
	}
}
