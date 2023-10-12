import java.util.Scanner;

public class Jurnal02 {

	public static void main(final String[] args) {
		Scanner s = new Scanner(System.in);
		String mataKuliah = s.nextLine();
		int jam = s.nextInt();
		int jumlahJam = jam * 2;

		System.out.println("Aku suka kuliah " + mataKuliah + ".");
		System.out.println("Kuliah " + jam + " jam per minggu rasanya kurang.");
		System.out.println("Tambahin dong jadi " + jumlahJam + " jam per minggu :)");
	}
}
