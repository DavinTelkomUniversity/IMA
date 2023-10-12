import java.util.Scanner;

public class Jurnal03 {

	public static void main(final String[] args) {
		Scanner input = new Scanner(System.in);
		int Dira = input.nextInt();
		int Radi = input.nextInt();
		int Idar = input.nextInt();
		if (Radi < Dira && Radi < Idar) {
			if (Dira < Idar) {
				System.out.println("Radi, Dira, Idar");
			} else if (Idar < Dira) {
				System.out.println("Radi, Idar, Dira");
			}
		} else if (Dira < Idar && Dira < Radi) {
			if (Radi < Idar) {
				System.out.println("Dira, Radi, Idar");
			} else if (Idar > Radi) {
				System.out.println("Dira, Idar, Radi");
			}
		} else if (Idar < Radi && Idar < Dira) {
			if (Dira < Radi) {
				System.out.println("Idar, Dira, Radi");
			} else if (Radi < Dira) {
				System.out.println("Idar, Radi, Dira");
			}
		}
	}
}