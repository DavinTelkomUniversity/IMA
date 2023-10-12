import java.util.Scanner;

public class Jurnal02 {

	public static void main(final String[] args) {
		Scanner s = new Scanner(System.in);
		String lirik = s.nextLine();
		int jumlah = lirik.length() % 5;
		String replace = "";
		switch (jumlah) {
			case 0 : replace = "a"; break;
			case 1 : replace = "e"; break;
			case 2 : replace = "i"; break;
			case 3 : replace = "o"; break;
			case 4 : replace = "u"; break;
		}
		hasil(lirik, replace);
	}

	private static void hasil(String lirik, String replace) {
		String hasil1 = lirik.replace("a", replace);
		String hasil2 = hasil1.replace("i", replace);
		String hasil3 = hasil2.replace("u", replace);
		String hasil4 = hasil3.replace("e", replace);
		String hasil5 = hasil4.replace("o", replace);
		System.out.println(hasil5);
	}
}
