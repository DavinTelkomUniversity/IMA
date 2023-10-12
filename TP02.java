import java.util.Scanner;

public class TP02 {
	public static void main(final String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int f = 1;
        for (int i = 1; i <= n; i++){
			f *= i;
		}
		System.out.println(f);
	}
}