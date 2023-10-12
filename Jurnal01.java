import java.util.Scanner;

public class Jurnal01 {

	public static void main(final String[] args) {
		Scanner s = new Scanner(System.in);
		String nama1 = s.nextLine();
		String nama2 = s.nextLine();
		int jam = s.nextInt();
		String waktu = "";
		if (jam >= 06 && jam <= 11) {
			waktu = "pagi";
		} else if (jam >= 12 && jam <= 14) {
			waktu = "siang";
		} else if (jam >= 15 && jam <= 17) {
			waktu = "sore";
		} else if (jam >= 18 && jam <= 05) {
			waktu = "sore";
		}
		ucapan(nama1, waktu);
		ucapan(nama2, waktu);
	}

	private static void ucapan(String nama, String waktu) {
		System.out.println("Halo, " + nama + ". Selamat " + waktu + ".");
	}
}
