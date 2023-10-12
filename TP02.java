import java.util.Scanner;

public class TP02 {

	public static void main(final String[] args) {
		Scanner s = new Scanner(System.in);
		String konten = s.nextLine();
		kalimat(konten);
	}

	private static void kalimat(String konten) {
		String hasil1 = konten.replace("a", "");
		String hasil2 = hasil1.replace("i", "");
		String hasil3 = hasil2.replace("u", "");
		String hasil4 = hasil3.replace("e", "");
		String hasil5 = hasil4.replace("o", "");
		System.out.println(hasil5);		
	}
}
