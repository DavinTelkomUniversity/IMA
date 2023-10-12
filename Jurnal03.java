import java.util.Scanner;

public class Jurnal03 {
	public static void main(final String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int mat[][] = new int[n][n];
		int cellA = 0;
		int cellI = n - 1;
		int rowA = 0;
		int rowI = n - 1;
		int cValue = 1;

		while (cValue <= n * n) {
			for (int i = cellA; i <= cellI; i++) {
				mat[rowA][i] = cValue;
				cValue++;
			}
			for (int j = rowA + 1; j <= rowI; j++) {
				mat[j][cellI] = cValue;
				cValue++;
			}
			for (int k = cellI - 1; k >= cellA; k--) {
				mat[rowI][k] = cValue;
				cValue++;
			}
			for (int l = rowI - 1; l >= rowA + 1; l--) {
				mat[l][cellA] = cValue;
				cValue++;
			}
			cellA++;
			rowA++;
			cellI--;
			rowI--;
		}
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if (j == n - 1) {
					System.out.print(mat[j][i]);
				} else {
					System.out.print(mat[j][i] + " ");
				}
			}
			System.out.println();
		}
		in.close();
	}
}