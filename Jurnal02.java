import java.util.Scanner;

public class Jurnal02 {

	public static void main(final String[] args) {
		try (
				Scanner s = new Scanner(System.in)) {
			int n = s.nextInt();
			int[][] x = new int[n][n];

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					x[i][j] = s.nextInt();
				}
			}
			for (int i = 0; i < n; i++) {
				if (x[i][0] == x[i][1] && x[i][1] == x[i][2]) {
					if (x[i][0] == 1) {
						System.out.println("O");
						return;
					} else if (x[i][0] == 2) {
						System.out.println("X");
						return;
					}
				}
			}
			for (int i = 0; i < n; i++) {
				if (x[0][i] == x[1][i] && x[1][i] == x[2][i]) {
					if (x[0][i] == 1) {
						System.out.println("O");
						return;
					} else if (x[0][i] == 2) {
						System.out.println("X");
						return;
					}
				}
			}
			if (x[0][0] == x[1][1] && x[1][1] == x[2][2]) {
				if (x[0][0] == 1) {
					System.out.println("O");
					return;
				} else if (x[0][0] == 2) {
					System.out.println("X");
					return;
				}
			}
			if (x[0][2] == x[1][1] && x[1][1] == x[2][0]) {
				if (x[0][2] == 1) {
					System.out.println("O");
					return;
				} else if (x[0][2] == 2) {
					System.out.println("X");
					return;
				}
			}
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (x[i][j] == 0) {
						System.out.println("?");
						return;
					}
				}
			}
		}
		System.out.println("-");
	}
}