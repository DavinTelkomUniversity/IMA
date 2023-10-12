import java.util.Scanner;

public class Jurnal03 {
	
    public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
        tower(n, 'A', 'C', 'B');
    }

	private static void tower(int n, char a, char b, char c) {
	if (n == 0) {
		return;
	}
	
	tower(n - 1, a, c, b);
	System.out.println("Cakram " + n + " dipindahkan dari " + a + " ke " + b);
	tower(n - 1, c, b, a);
	}
	
}