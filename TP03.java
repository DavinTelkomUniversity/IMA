import java.util.Scanner;

public class TP03 {

	public static void main(final String[] args) {
		Scanner s = new Scanner(System.in);
		String bangunDatar = s.nextLine();
		if (bangunDatar.equals("Persegi")) {
			int x = s.nextInt();
			int luas = x * x;
			int keliling = x * 4;
			System.out.println(luas + " " + keliling);
		} else if (bangunDatar.equals("Persegi Panjang")) {
			int x = s.nextInt();
			int y = s.nextInt();
			int luas = x * y;
			int keliling = (x + y) * 2;
			System.out.println(luas + " " + keliling);
		} else if (bangunDatar.equals("Segitiga")) {
			int x = s.nextInt();
			int y = s.nextInt();
			int luas = x * y / 2;
			int xKuadrat = x * x;
			int yKuadrat = y * y;
			int akar = xKuadrat+yKuadrat;
			double kemiringan = Math.sqrt(akar);
			int keliling = (int)(x + y + kemiringan);
			System.out.println(luas + " " + keliling);
		} else if (bangunDatar.equals("Lingkaran")) {
			int x = s.nextInt();
			double jarijari = x / 2;
			double luas = 3.14 * jarijari * jarijari;
			double keliling = 2 * 3.14 * jarijari;
			System.out.println(luas + " " + keliling);
		}
	}
}
