import java.util.*;

public class Jurnal01 {
	public static void main(final String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[][] matrix1 = new int[n][n];
		int[][] matrix2 = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix1[i][j] = s.nextInt();
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int b = n - 1 - i;
				matrix2[i][j] = matrix1[b][j];

			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == n - 1) {
					System.out.print(matrix2[i][j]);
				} else {
					System.out.print(matrix2[i][j] + " ");
				}
			}
			System.out.println();
		}
		s.close();
	}
}