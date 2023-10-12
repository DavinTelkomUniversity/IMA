import java.util.Scanner;

public class Jurnal03 {
    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
    int x = s.nextInt();
	int n = x, m, y = 0;
    while (n > 0) {
        m = n % 10;
		y = y + faktor(m);
		n = n / 10; 
    }
	if (y == x) {
		System.out.println("YA");
	} else {
		System.out.println("BUKAN");
	}
    }

	private static int faktor (int x) {
		int a = 1;
		while (x > 0) {
			a = a * x;
			x--;
		}
		return a;
	}
}