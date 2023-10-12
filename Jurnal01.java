import java.util.Scanner;

public class Jurnal01 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		String cek = " ";
		for (int i = 1; i <= a; i++){
			if (i % 2 == 1) {
				cek = "Ganjil";
			} else if (i % 2 == 0) {
				cek = "Genap";
			}
			System.out.println(i + " - " + cek);
		}
	}
}