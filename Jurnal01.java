import java.util.Scanner;

public class Jurnal01 {

	public static void main(final String[] args) {
		Scanner s = new Scanner(System.in);
        int nilai = s.nextInt();
		int nilai1 = 24;
		int nilai2 = 56;
		if (nilai1 % nilai == 0 && nilai2 % nilai == 0) {
			System.out.println("Faktor dari " + nilai1 + " dan " + nilai2);
		} else {
			System.out.println("Bukan faktor dari " + nilai1 + " dan " + nilai2);
		}
	}
}
