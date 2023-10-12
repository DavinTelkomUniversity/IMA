import java.util.Scanner;

public class Jurnal03 {

	public static void main(final String[] args) {
		Scanner s = new Scanner(System.in);
		double phi = Math.PI;
		int jarijari = s.nextInt();
		int tinggi = s.nextInt();
		int akar = (tinggi * tinggi) + (jarijari * jarijari);
		double akarnya = Math.sqrt(akar);
		double kerucut = phi * jarijari * (jarijari + akarnya);
		double tabung = (2 * jarijari * phi * tinggi) + (2 * phi * jarijari * jarijari);
		hasil(kerucut, tabung);
	}

	private static void hasil(double kerucut, double tabung) {
		System.out.printf("%.3f %.3f", kerucut, tabung);
	}
}
