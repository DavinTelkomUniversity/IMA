import java.util.Scanner;

public class TP03 {

	public static void main(final String[] args) {
		Scanner input = new Scanner(System.in);
		int Dira = input.nextInt();
		int Radi = input.nextInt();
		int Idar = input.nextInt();
		if (Radi > Dira && Radi > Idar) {
			System.out.println("Radi");
		} else if (Dira > Idar && Dira > Radi) {
			System.out.println("Dira");
		} else if (Idar > Radi && Idar > Dira) {
			System.out.println("Idar");
		}
	}
}
