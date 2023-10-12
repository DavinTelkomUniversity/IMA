import java.util.Arrays;
import java.util.Scanner;

public class Soal03 {
    public static int[][] urutkanMatrik(int dimensi, int[][] matrik) {
        for (int i = 0; i < dimensi; i++) {
            Arrays.sort(matrik[i]);
        }
        return matrik;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int dimensi = s.nextInt();
        int[][] matrik = new int[dimensi][dimensi];
        for (int i = 0; i < dimensi; i++) {
            for (int j = 0; j < dimensi; j++) {
                matrik[i][j] = s.nextInt();
            }
        }

        int[][] matrikUrut = urutkanMatrik(dimensi, matrik);
		
        for (int i = 0; i < dimensi; i++) {
            for (int j = 0; j < dimensi; j++) {
                System.out.print(matrikUrut[i][j] + " ");
            }
            System.out.println();
        }
    }
}
