import java.util.Scanner;

public class TP02 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int[][] n = new int[x][x];
		int[][] number = new int[x][x];

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x; j++) {
				n[i][j] = s.nextInt();
			}
		} 
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x; j++) {
				number[i][j] = s.nextInt();
			}
		}
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x; j++) {
				if (j == x - 1) {
					System.out.print(n[i][j] + number[i][j]);
				} else {
					System.out.print((n[i][j] + number[i][j]) + " ");
				}
			}
			System.out.println();
		}
	}
}