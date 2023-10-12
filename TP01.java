import java.util.Scanner;

public class TP01 {
	public static void main(final String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int i = 1;
		for(i = 1; i <= 10; i++){
			int x = a * i;
			System.out.println(i + " x " + a + " = " + x);
		}
	}
}