import java.util.Scanner;

public class TP03 {

	public static void main(final String[] args) {
		Scanner s = new Scanner(System.in);
		String bangun = s.nextLine();

		switch (bangun) {
			case "Persegi":
				int sisi = s.nextInt();
				persegi(sisi);
				break;
			case "Persegi Panjang":
				int panjang = s.nextInt();
				int lebar = s.nextInt();
				persegipanjang(panjang,lebar);
				break;
			case "Segitiga":
				int alas = s.nextInt();
				int tinggi = s.nextInt();
				segitiga(alas,tinggi);
				break;
			case "Lingkaran":
				int diameter = s.nextInt();
				lingkaran(diameter);
				break;
		}
	}
	private static void persegi(int sisi) {
		int luas = sisi * sisi;
		int keliling = sisi * 4;
		System.out.println(luas + " " + keliling);
	}

	private static void persegipanjang(int panjang, int lebar) {
		int luas = panjang * lebar;
		int keliling = panjang * 2 + lebar * 2;
		System.out.println(luas + " " + keliling);		
	}

	private static void segitiga(int alas, int tinggi) {
		int luas = alas * tinggi / 2;
		int keliling = alas * 3 + 3;
		System.out.println(luas + " " + keliling);		
	}
 
	private static void lingkaran(int diameter) {
		double luas = 0.25 * 3.14 * diameter * diameter;
		double keliling = 3.14 * diameter;
		System.out.println(luas + " " + keliling);
	}
}