import java.util.Scanner;

public class Jurnal03 {

	public static void main(final String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		char o = s.next().charAt(0);
		int b = s.nextInt();
		switch (o) {
			case '/': 
			System.out.println(a / (float) b);
			break;
			case '+': 
			int hasil2 = a + b;
			System.out.println(hasil2);
			break;
			case '*': 
			int hasil3 = a * b;
			System.out.println(hasil3);
			break;
			case '-': 
			int hasil4 = a - b;
			System.out.println(hasil4);
			break;
		}
	}
}
