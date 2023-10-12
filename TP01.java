import java.util.Scanner;
 
public class TP01 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[][] x = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				x[i][j] = s.nextInt();
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = n - 1; j >= 0; j--) {
				if (j == 0) {
					System.out.print(x[i][j]);
				} else {
					System.out.print(x[i][j] + " ");
				}
			}
			System.out.println();
		}
	}
}