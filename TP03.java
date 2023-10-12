import java.util.Scanner;

public class TP03 {
	public static void main(final String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int[][] matrix = new int[x][x];
		int[][] matrix2 = new int[x][x];
		int[][] n = new int[x][x];
 
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x; j++) {
				matrix[i][j] = s.nextInt();
			}
		}
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x; j++) {
				matrix2[i][j] = s.nextInt();
			}
		}
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x; j++) {
				for (int k = 0; k < x; k++) {
					n[i][j] += matrix[i][k] * matrix2[k][j];
				}
			}
		}
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x; j++) {
				if (j == x - 1) {
					System.out.print(n[i][j]);
				} else {
					System.out.print(n[i][j] + " ");
				}
			}
			System.out.println();
		}

	}
}